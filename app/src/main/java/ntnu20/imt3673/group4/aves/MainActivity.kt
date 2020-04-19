package ntnu20.imt3673.group4.aves

import android.content.pm.PackageManager
import android.os.Bundle
<<<<<<< HEAD
=======
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
>>>>>>> add-observation
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
<<<<<<< HEAD
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
=======
import androidx.preference.PreferenceManager
import ntnu20.imt3673.group4.aves.location.LocationUtility
import ntnu20.imt3673.group4.aves.location.PermissionUtility
>>>>>>> add-observation


/**
 * This is an example of how the location utility is to be used. It is important that this is
 * used in a short-lived activity for registering gps data, or it will affect battery life.
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Set the action bar that we are using */
        setSupportActionBar(toolbar)

        /* Configure our app bar to have 1 home destination and a drawer */
        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfig = AppBarConfiguration(navController.graph, mainDrawerLayout)

        /* Hook up toolbar with nav controller */
        toolbar.setupWithNavController(navController, appBarConfig)

        /* Hook up drawer with nav controller */
        navigationView.setupWithNavController(navController)

        /* Read preferences */
        // TODO: Use these values to change behaviour in app. Enable/disable location etc
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val useLocation = sharedPreferences.getBoolean("pref_location", false)

        // Ensuring permissions for location -- if using location
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

<<<<<<< HEAD
=======
    /** handling permission result for location */
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
>>>>>>> add-observation


    /** Sets up the navigation menu to their respective dests*/
    private fun setUpNavigationMenu(navController: NavController) {
        navigationView?.let {
            NavigationUI.setupWithNavController(it, navController)
        }
    }

    override fun onBackPressed() {
        if (mainDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mainDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    override fun onSupportNavigateUp() = findNavController(R.id.nav_host_fragment).navigateUp()
}

