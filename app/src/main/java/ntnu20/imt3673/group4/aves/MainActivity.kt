package ntnu20.imt3673.group4.aves

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Set the action bar that we are using */
        setSupportActionBar(toolbar)

        /* Configure our app bar to have 1 home destination and a drawer */
        val navController = findNavController(R.id.nav_fragment)
        val appBarConfig = AppBarConfiguration(navController.graph, mainDrawerLayout)

        /* Hook up toolbar with nav controller */
        toolbar.setupWithNavController(navController, appBarConfig)

        /* Hook up drawer with nav controller */
        navigationView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp() = findNavController(R.id.nav_fragment).navigateUp()
}

