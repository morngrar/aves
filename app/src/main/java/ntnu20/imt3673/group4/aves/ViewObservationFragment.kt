package ntnu20.imt3673.group4.aves

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_view_observation.*
import ntnu20.imt3673.group4.aves.databinding.FragmentViewObservationBinding
import java.io.File
import java.util.*

class ViewObservationFragment : Fragment() {
    private lateinit var views: FragmentViewObservationBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        views = FragmentViewObservationBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_view_observation, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Get the arguments passed with action
        arguments?.let {    // If the arguments are not null, insert
            val safeArgs = ViewObservationFragmentArgs.fromBundle(it)
            val data = safeArgs.ObservationToView
            view_birdName.text = data.birdName
            view_description.text = data.description
            view_time.text = data.time.let { it1 -> Date(it1).toString() }
            view_location.text = "Loc: %4.4f, %4.4f".format(data.latitude, data.longitude)
            view_cloudiness.text = "Cloud cover: ${data.cloudiness}%"
            view_rain.text = "Rain: ${data.rain} mm"
            view_pressure.text = "Pressure: ${data.pressure} hPa"
            view_wind.text = "Wind speed: ${data.windSpeed} mps"
            view_temperature.text = "Temperature ${data.temperature}°C"
            view_number_seen.text = "Number seen: ${data.count}"

            // Set the imageView
            if(data.imagePath != "") {
                val file = File(data.imagePath)
                view_observation_image.setImageURI(Uri.parse(file.absolutePath))
            }


        }
    }

}