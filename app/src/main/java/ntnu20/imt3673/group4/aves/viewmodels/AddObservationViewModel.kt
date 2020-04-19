package ntnu20.imt3673.group4.aves.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ntnu20.imt3673.group4.aves.R
import ntnu20.imt3673.group4.aves.weather.WeatherDataPoint
import java.util.*

class AddObservationViewModel(application: Application) : AndroidViewModel(application) {

    private var latitude: Double? = null
    private var longitude: Double? = null

    private var _gotLocation = MutableLiveData(false)
    val gotLocation: LiveData<Boolean>
        get() = _gotLocation

    private val fetchingString = application.resources.getString(R.string.str_retrieving)
    private var _location = MutableLiveData(fetchingString)
    val location: LiveData<String>
        get() = _location

    fun setLocation(latitude: Double, longitude: Double) {
        _location.value = "$latitude, $longitude"
        _gotLocation.value = true
    }

    private val notPermittedString = application.resources.getString(R.string.str_not_permitted)
    fun locationNotUsed() {
        _location.value = notPermittedString
    }

    private var _gotWeather = MutableLiveData(false)
    val gotWeather: LiveData<Boolean>
        get() = _gotWeather
    
    private var weatherDataPoint: WeatherDataPoint? = null
    fun setWeatherData(dataPoint: WeatherDataPoint) {
        weatherDataPoint = dataPoint
        _gotWeather.value = true
    }

    var validated = false

    val time = Date().toString()
}
