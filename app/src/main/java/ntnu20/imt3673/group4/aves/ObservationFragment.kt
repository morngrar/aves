package ntnu20.imt3673.group4.aves

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.FileProvider
import androidx.core.view.drawToBitmap
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_observation.*
import ntnu20.imt3673.group4.aves.databinding.FragmentObservationBinding
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*


class ObservationFragment : Fragment() {

    private lateinit var views: FragmentObservationBinding
    private lateinit var currentPhotoPath :String
    private val requestCode = 42

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        views = FragmentObservationBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_observation, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //Button to capture image, checks permission first
        btn_capture.setOnClickListener {
            checkPermission()
        }

        //Button to save image captured
        btn_share.setOnClickListener {
            if(image_view.drawable != null) {
                // Save the image to gallery
                galleryAddPic()
            } else {
                Toast.makeText(requireContext(), "Take a picture ", Toast.LENGTH_SHORT).show()
            }
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
        val storageDir: File? =  requireContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(
            "JPEG_${timeStamp}_", /* prefix */
            ".jpg", /* suffix */
            storageDir /* directory */
        ).apply {
            // Save a file: path for use with ACTION_VIEW intents
            currentPhotoPath = absolutePath
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == requestCode && resultCode == Activity.RESULT_OK) {
            image_view.setImageURI(Uri.parse(currentPhotoPath))
        }
    }

    private fun galleryAddPic() {
        Intent(Intent.ACTION_VIEW).also { mediaScanIntent ->
            val ctx = requireContext()
            mediaScanIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            val f = File(currentPhotoPath)
            mediaScanIntent.data = FileProvider.getUriForFile(ctx, ctx.applicationContext.packageName + ".provider", f)
            requireContext().sendBroadcast(mediaScanIntent)
            Toast.makeText(requireContext(), "Saved", Toast.LENGTH_SHORT).show()
        }
    }
}





