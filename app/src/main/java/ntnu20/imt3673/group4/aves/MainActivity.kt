package ntnu20.imt3673.group4.aves

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.preference.PreferenceManager
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*
import ntnu20.imt3673.group4.aves.location.LocationUtility
import ntnu20.imt3673.group4.aves.location.PermissionUtility


/**
 * Main activity sets up navigation drawer and loads shared preferences at startup.
 * Ensures that correct permissions are given.
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        /* Read preferences */
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        /* Set app theme at startup */
        val useDarkMode = sharedPreferences.getBoolean("pref_theme", false)
        if (useDarkMode) {
            setTheme(R.style.AppThemeDark)
        } else {
            setTheme(R.style.AppThemeLight)
        }

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

    /** Sets up the navigation menu to their respective destinations */
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

