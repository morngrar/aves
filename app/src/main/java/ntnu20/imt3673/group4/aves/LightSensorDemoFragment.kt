package ntnu20.imt3673.group4.aves

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_activity_main.*
import kotlinx.android.synthetic.main.fragment_light_sensor_demo.*
import ntnu20.imt3673.group4.aves.databinding.FragmentLightSensorDemoBinding
import java.io.IOException


class LightSensorDemoFragment : Fragment(), SensorEventListener {

    var light : Sensor? = null
    private lateinit var sensorManager: SensorManager
    var isRunning = false

    private lateinit var views: FragmentLightSensorDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* Light sensor */
        sensorManager = context?.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        light = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)

    }

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        views = FragmentLightSensorDemoBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_light_sensor_demo, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        text_light.visibility = View.INVISIBLE
        text_dark.visibility = View.INVISIBLE
    }

    /* What happens when light sensor accuracy is changed */
    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        // Not implemented. Not Needed.
    }

    /* What happens when light sensor detects a change */
    override fun onSensorChanged(event: SensorEvent?) {
        if (event != null) {
            txt_lux.text = ("Lux: " + event.values[0])

            if (event!!.values[0] < 30) {
                text_dark.visibility = View.VISIBLE
                text_light.visibility = View.INVISIBLE
            } else {
                text_dark.visibility = View.INVISIBLE
                text_light.visibility = View.VISIBLE
            }
        }
    }

    override fun onResume() {
        // Register a listener for the light sensor.
        super.onResume()
        sensorManager.registerListener(this, light, SensorManager.SENSOR_DELAY_NORMAL)
    }

    override fun onPause() {
        /* Unregister light sensor when activity pauses to prevent battery drain in background */
        super.onPause()
        sensorManager.unregisterListener(this)
    }
}