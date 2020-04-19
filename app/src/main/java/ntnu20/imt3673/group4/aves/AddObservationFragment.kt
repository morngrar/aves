package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.preference.PreferenceManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ntnu20.imt3673.group4.aves.databinding.FragmentAddObservationBinding
import ntnu20.imt3673.group4.aves.location.LocationUtility
import ntnu20.imt3673.group4.aves.location.PermissionUtility
import ntnu20.imt3673.group4.aves.viewmodels.AddObservationViewModel
import ntnu20.imt3673.group4.aves.weather.WeatherDataPoint
import ntnu20.imt3673.group4.aves.weather.WeatherUtil


class AddObservationFragment : Fragment() {

    private val viewModel: AddObservationViewModel by viewModels()
    private lateinit var binding: FragmentAddObservationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_add_observation, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.vm = viewModel
        return binding.root
    }

    private suspend fun getWeatherData(latitude: Double, longitude: Double): WeatherDataPoint? = run {7
        var dataPoint: WeatherDataPoint? = null
        withContext(Dispatchers.IO) {
            dataPoint =  WeatherUtil.getRecentFrom(latitude, longitude)
        }
        return dataPoint
    }

    private fun getLocationAndWeather() = lifecycleScope.launch {
        delay(1000)
        if (PermissionUtility.haveFineLocationPermission(requireContext())) {
            Log.d("AVES", "havePermission")
            val latitude = LocationUtility.latitude
            val longitude = LocationUtility.longitude
            viewModel.setLocation(latitude, longitude)
            viewModel.setWeatherData(getWeatherData(latitude, longitude)!!)
        } else {
            Log.d("AVES", "havePermission is false")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val useLocation = sharedPreferences.getBoolean("pref_location", false)

        if (!useLocation) {
            viewModel.locationNotUsed()
        } else {
            getLocationAndWeather()
        }
    }
}
