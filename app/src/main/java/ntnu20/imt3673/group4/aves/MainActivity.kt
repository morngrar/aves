package ntnu20.imt3673.group4.aves

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ntnu20.imt3673.group4.aves.location.LocationUtility
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


}



