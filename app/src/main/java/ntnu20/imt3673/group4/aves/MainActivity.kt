package ntnu20.imt3673.group4.aves

import android.content.Context
import android.content.SharedPreferences
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import androidx.preference.PreferenceManager
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.fragment_activity_main.*


/**
 * This is an example of how the location utility is to be used. It is important that this is
 * used in a short-lived activity for registering gps data, or it will affect battery life.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        /* Read preferences */
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        // var useLocation = sharedPreferences.getBoolean("pref_location", false)

        /* Set app theme at startup */
        val useDarkMode = sharedPreferences.getBoolean("pref_theme", false)
        if (useDarkMode) {
            Log.d("darkMode", "true")
            setTheme(R.style.AppThemeDark)
        } else {
            Log.d("darkMode", "false")
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



    }
    /* Sets up the navigation menu to their respective tests */
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

