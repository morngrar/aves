package ntnu20.imt3673.group4.aves

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.content.FileProvider
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import androidx.preference.PreferenceManager
import kotlinx.android.synthetic.main.fragment_add_observation.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ntnu20.imt3673.group4.aves.databinding.FragmentAddObservationBinding
import ntnu20.imt3673.group4.aves.location.LocationUtility
import ntnu20.imt3673.group4.aves.location.PermissionUtility
import ntnu20.imt3673.group4.aves.viewmodels.AddObservationViewModel
import ntnu20.imt3673.group4.aves.weather.WeatherDataPoint
import ntnu20.imt3673.group4.aves.weather.WeatherUtil
import java.io.FileNotFoundException
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*


class AddObservationFragment : Fragment() {

    private lateinit var currentPhotoPath :String
    private val requestCode = 42
    private val viewModel: AddObservationViewModel by viewModels()
    private lateinit var binding: FragmentAddObservationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_add_observation, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.vm = viewModel
        return binding.root
    }

    private suspend fun getWeatherData(latitude: Double, longitude: Double): WeatherDataPoint? = run {7
        var dataPoint: WeatherDataPoint? = null
        while (dataPoint == null) {
            try {
                withContext(Dispatchers.IO) {
                    dataPoint =  WeatherUtil.getRecentFrom(latitude, longitude)
                }
            } catch (e: FileNotFoundException) {}
        }
        return dataPoint
    }

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


        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val useLocation = sharedPreferences.getBoolean("pref_location", false)

        if (!useLocation) {
            viewModel.locationNotUsed()
        } else {
            getLocationAndWeather()
        }

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
            requestPermissions(permission, requestCode)
        } else {
            // If the permission was already granted, capture the image
            dispatchTakePictureIntent()
        }
    }

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
                    startActivityForResult(takePictureIntent, requestCode)
                }
            }
        }
    }

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
     */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == requestCode && resultCode == Activity.RESULT_OK) {
            image_view_observation.setImageURI(Uri.parse(currentPhotoPath))
            viewModel.getImageViewPath(currentPhotoPath)
        }
    }
}
