package ntnu20.imt3673.group4.aves

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import ntnu20.imt3673.group4.aves.location.LocationUtility
import ntnu20.imt3673.group4.aves.location.PermissionUtility


/**
 * This is an example of how the location utility is to be used. It is important that this is
 * used in a short-lived activity for registering gps data, or it will affect battery life.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val latitude = LocationUtility.latitude.toString()
            val longitude = LocationUtility.longitude.toString()
            textView.text = "lat: $latitude long: $longitude"

            supportFragmentManager.beginTransaction().addToBackStack("profile").replace(R.id.main_view, FragmentProfile(), "profile").commit()
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
                    LocationUtility.LOCATION_PERMISSION_REQUEST_CODE
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
            LocationUtility.LOCATION_PERMISSION_REQUEST_CODE -> {
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



