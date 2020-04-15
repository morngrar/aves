package ntnu20.imt3673.group4.aves

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ntnu20.imt3673.group4.aves.location.LocationUtility
import ntnu20.imt3673.group4.aves.location.LocationUtility.LOCATION_PERMISSION_REQUEST_CODE
import ntnu20.imt3673.group4.aves.location.PermissionUtility

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val latitude = LocationUtility.latitude.toString()
            val longitude = LocationUtility.longitude.toString()
            textView.text = "lat: $latitude long: $longitude"
        }
    }


    override fun onStart() {
        super.onStart()

        when {
            PermissionUtility.haveFineLocationPermission(this) -> {
                when {
                    PermissionUtility.locationIsEnabled(this) -> {
                        LocationUtility.configureLocationListener(this)
                    }
                    else -> {
                        PermissionUtility.showGPSAlertDialog(this)
                    }
                }
            }
            else -> {
                PermissionUtility.requestFineLocationPermission(
                    this,
                    LOCATION_PERMISSION_REQUEST_CODE
                )
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            LOCATION_PERMISSION_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    when {
                        PermissionUtility.locationIsEnabled(this) -> {
                            LocationUtility.configureLocationListener(this)
                        }
                        else -> {
                            PermissionUtility.showGPSAlertDialog(this)
                        }
                    }
                }
            }
            else -> {
                Toast.makeText(
                    this,
                    "Don't have location permission",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}



