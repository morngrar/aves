package ntnu20.imt3673.group4.aves

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.content.FileProvider
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_add_observation.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ntnu20.imt3673.group4.aves.databinding.FragmentAddObservationBinding
import ntnu20.imt3673.group4.aves.location.LocationUtility
import ntnu20.imt3673.group4.aves.location.PermissionUtility
import ntnu20.imt3673.group4.aves.viewmodels.AddObservationViewModel
import ntnu20.imt3673.group4.aves.viewmodels.FirestoreViewModel
import ntnu20.imt3673.group4.aves.weather.WeatherDataPoint
import ntnu20.imt3673.group4.aves.weather.WeatherUtil
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

/** Fragment for adding an observation */
class AddObservationFragment : Fragment() {

    private  var currentPhotoPath: String = ""
    private val REQUEST_CODE = 42
    private val viewModel: AddObservationViewModel by viewModels()

    private lateinit var binding: FragmentAddObservationBinding

    private lateinit var userID: String
    private val firestoreViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(
        Application()
    ).create(FirestoreViewModel::class.java)
    var user = FirebaseAuth.getInstance().currentUser



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_add_observation,
            container,
            false
        )
        binding.lifecycleOwner = viewLifecycleOwner
        binding.vm = viewModel

        userID = user?.uid.toString()
        viewModel.setOwnerID(userID)

        return binding.root
    }

    /** Gets the weather data from met.no api in a background thread */
    private suspend fun getWeatherData(
        latitude: Double,
        longitude: Double
    ): WeatherDataPoint? = run {

        var dataPoint: WeatherDataPoint? = null
        while (dataPoint == null) {
            try {
                withContext(Dispatchers.IO) {
                    dataPoint = WeatherUtil.getRecentFrom(latitude, longitude)
                }
            } catch (e: FileNotFoundException) {
            }
        }
        return dataPoint
    }

    /** Gets the location and weatherdata consecutively in the background */
    private fun getLocationAndWeather() = lifecycleScope.launch {
        delay(1000)
        if (PermissionUtility.haveFineLocationPermission(requireContext())) {
            Log.d("AVES", "havePermission")
            val latitude = LocationUtility.latitude
            val longitude = LocationUtility.longitude
            viewModel.setLocation(latitude, longitude)
            viewModel.setWeatherData(getWeatherData(latitude, longitude)!!)
        } else {
            Log.d("AVES", "havePermission is false")
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        getLocationAndWeather()

/*
        btn_gallery.setOnClickListener {
            pickImageFromGallery()
        }
*/

        //Button to capture image, checks permission first
        btn_capture.setOnClickListener {
            checkPermission()
        }

        btn_add_observation.setOnClickListener {
            viewModel.addObservation()
            val homeAction = AddObservationFragmentDirections.nextAction()
            Navigation.findNavController(it).navigate(homeAction)
        }
    }

    /**
     * Function checks if the user has allowed access to camera and storage
     */
    @RequiresApi(Build.VERSION_CODES.M)
    private fun checkPermission() { //
        if (requireContext().checkSelfPermission(android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED
            || requireContext().checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
            PackageManager.PERMISSION_GRANTED
        ) {
            // Create an array of those permissions we want accepted
            val permission = arrayOf(
                android.Manifest.permission.CAMERA,
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE
            )
            // Show popup to request permission
            requestPermissions(permission, REQUEST_CODE)
        } else {
            // If the permission was already granted, capture the image
            dispatchTakePictureIntent()
        }
    }

    /** Takes a picture, using the camera app */
    private fun dispatchTakePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            // Ensure that there's a camera activity to handle the intent
            takePictureIntent.resolveActivity(requireActivity().packageManager)?.also {
                // Create the File where the photo should go
                val photoFile: File? = try {
                    createImageFile()
                } catch (ex: IOException) {
                    // Error occurred while creating the File
                    null
                }
                // Continue only if the File was successfully created
                photoFile?.also {
                    val photoURI: Uri = FileProvider.getUriForFile(
                        requireContext(),
                        "ntnu20.imt3673.group4.aves.provider",
                        it
                    )
                    // Intent to capture the image
                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
                    startActivityForResult(takePictureIntent, REQUEST_CODE)
                }
            }
        }
    }

    /** Creates an image file from the result of the camera intent */
    @SuppressLint("SimpleDateFormat")
    @Throws(IOException::class)
    private fun createImageFile(): File {
        // Create an image file name
        val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val storageDir: File? = requireContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(
            "JPEG_${timeStamp}_", /* prefix */
            ".jpg", /* suffix */
            storageDir /* directory */
        ).apply {
            // Save a file: path for use with ACTION_VIEW intents
            currentPhotoPath = absolutePath
        }
    }

    /**
     * Set the image captured by the camera to the image_view_observation displayed in the xml file
     * Or use the image picked from gallery
     */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == requestCode && resultCode == Activity.RESULT_OK) {
            if(requestCode == REQUEST_CODE) {   // If the user captured an image
                image_view_observation.setImageURI(Uri.parse(currentPhotoPath))
                viewModel.getImageViewPath(currentPhotoPath)
            } else {
                image_view_observation.setImageURI(data?.data)
            }
        }
    }

    /** Pick image from gallery */
    private fun pickImageFromGallery() {
        //Intent to pick image
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, 1000)
    }
}
