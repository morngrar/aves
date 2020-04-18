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
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_light_sensor_demo.*
import ntnu20.imt3673.group4.aves.databinding.FragmentLightSensorDemoBinding
import java.io.IOException


class LightSensorDemoFragment : Fragment(), SensorEventListener {

    var sensor : Sensor? = null
    private lateinit var sensorManager: SensorManager
    var isRunning = false

    private lateinit var views: FragmentLightSensorDemoBinding

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        views = FragmentLightSensorDemoBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_light_sensor_demo, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        text_light.visibility = View.INVISIBLE
        text_dark.visibility = View.INVISIBLE



        sensorManager = context?.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensor = sensorManager!!.getDefaultSensor(Sensor.TYPE_LIGHT)
    }

//    override fun OnResume() {
//        super.onResume()
//        sensorManager!!.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL)
//    }
//
//    override fun onPause() {
//        super.onPause()
//        sensorManager!!.unregisterListener(this)
//    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("Not implemented")
    }

    override fun onSensorChanged(event: SensorEvent?) {

        if (event != null) {
            if (event.sensor.type == Sensor.TYPE_LIGHT) {
                sensorText.text = "" + event.values[0]
                sensorText.visibility = View.VISIBLE
            }


        }
        val text = ("sensor changed!" + (event?.values?.get(0) ?: ""))
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(context, text, duration)
        toast.show()

        try {
            if(event!!.values[0] < 30 && !isRunning) {
                isRunning
                text_dark.visibility = View.VISIBLE
                text_light.visibility = View.INVISIBLE
            } else {
                isRunning = false
                sensorText.visibility = View.VISIBLE
                text_dark.visibility = View.INVISIBLE
                text_light.visibility = View.INVISIBLE
            }
        }
        catch (e : IOException) {

        }
    }
}