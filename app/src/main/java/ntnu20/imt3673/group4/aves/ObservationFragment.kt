package ntnu20.imt3673.group4.aves

import android.app.Activity
import android.content.ContentResolver
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.provider.SyncStateContract.Helpers.insert
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_observation.*
import ntnu20.imt3673.group4.aves.databinding.FragmentObservationBinding


class ObservationFragment : Fragment() {

    private lateinit var views: FragmentObservationBinding
    private val PERMISSION_CODE = 42
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

        /**
         * Button to capture image, checks permission first
         */
        btn_capture.setOnClickListener() {
            if (context?.checkSelfPermission(android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED
                || context?.checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
                PackageManager.PERMISSION_DENIED
            ) {
                // Permission was not enabled
                val permission = arrayOf(
                    android.Manifest.permission.CAMERA,
                    android.Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
                // Show popup to request permission
                requestPermissions(permission, PERMISSION_CODE)
            } else {
                // Permission already granted
                captureImage()
            }
        }

        /**
         * Button to save image captured
         */
        btn_share.setOnClickListener {
            if(image_view.drawable == null) {

            }
        }
    }

    private fun captureImage() {
        // Camera intent
        val captureImageIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(captureImageIntent, PERMISSION_CODE)
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        //When User Presses Allow Or Deny
        when (requestCode) {
            PERMISSION_CODE -> {
                // If user grants access
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED
                    && grantResults[1] == PackageManager.PERMISSION_GRANTED
                ) {
                   captureImage()
                }
            }
            else -> {
                Toast.makeText(requireContext(), "Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode) {
            PERMISSION_CODE -> {
                if(resultCode == Activity.RESULT_OK && data != null) {
                    image_view.setImageBitmap(data.extras?.get("data") as Bitmap)
                }
            }
            else -> {
                Toast.makeText(requireContext(), "Unrecognizable request code", Toast.LENGTH_SHORT).show()
            }
        }
    }
}



