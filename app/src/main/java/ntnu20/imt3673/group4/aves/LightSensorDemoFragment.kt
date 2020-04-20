package ntnu20.imt3673.group4.aves

import android.content.Context
import android.graphics.Color
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_light_sensor_demo.*
import ntnu20.imt3673.group4.aves.databinding.FragmentLightSensorDemoBinding

/** Fragment to demonstrate usage of the light sensor */
class LightSensorDemoFragment : Fragment(), SensorEventListener {

    private var light : Sensor? = null
    private lateinit var sensorManager: SensorManager

    private lateinit var views: FragmentLightSensorDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* Light sensor service */
        sensorManager = context?.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        light = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)

    }

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        views = FragmentLightSensorDemoBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_light_sensor_demo, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        /* Hide text by default so it is only shown when the correct light level is present */
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
            txt_lux.text = ("Current light (lux): " + event.values[0])

            if (event.values[0] < 30) {
                text_dark.visibility = View.VISIBLE
                text_light.visibility = View.INVISIBLE
                constraintLayout1.setBackgroundColor(Color.parseColor("#0f2040"))
            } else {
                text_dark.visibility = View.INVISIBLE
                text_light.visibility = View.VISIBLE
                constraintLayout1.setBackgroundColor(Color.parseColor("#a0bffa"))
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