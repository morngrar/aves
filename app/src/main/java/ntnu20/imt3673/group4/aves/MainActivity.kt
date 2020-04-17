package ntnu20.imt3673.group4.aves

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView


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
    }
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

