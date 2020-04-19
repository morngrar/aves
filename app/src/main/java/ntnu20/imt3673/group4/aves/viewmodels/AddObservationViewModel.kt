package ntnu20.imt3673.group4.aves.viewmodels

import android.app.Application
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ntnu20.imt3673.group4.aves.R
import ntnu20.imt3673.group4.aves.data.ObservationData
import ntnu20.imt3673.group4.aves.data.ObservationDatabase
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

    fun setLocation(lat: Double, lon: Double) {
        latitude = lat
        longitude = lon
        _location.value = "$latitude, $longitude"
        _gotLocation.value = true
    }

    private val notPermittedString = application.resources.getString(R.string.str_not_permitted)
    fun locationNotUsed() {
        _location.value = notPermittedString
    }

    var birdName = MutableLiveData("")


    private var _gotWeather = MutableLiveData(false)
    val gotWeather: LiveData<Boolean>
        get() = _gotWeather
    
    private var weatherDataPoint: WeatherDataPoint? = null
    fun setWeatherData(dataPoint: WeatherDataPoint) {
        weatherDataPoint = dataPoint
        _gotWeather.value = true
    }

    val validated = liveData {
        var bool = false
        while(true) {
            emit(bool)
            bool = _gotLocation.value!! && _gotWeather.value!!
            bool = bool && !birdName.value.isNullOrBlank()
            //TODO: Check for image path as well
            delay(100)

            Log.d("AVES-VALIDATOR", "running validated coroutine")
            Log.d("AVES-VALIDATOR", "${_gotLocation.value}, ${_gotWeather.value}")
            Log.d("AVES-VALIDATOR", "Bird name: ${birdName.value}")

        }
    }

    val time = Date()
    val timeString = time.toString()

    private val db = ObservationDatabase.getInstance(application)
    fun handleClick(view: View) {
        addObservation()
    }
    fun addObservation() = viewModelScope.launch {
        db.observations().insertObservation(
            ObservationData(
                0,
                birdName.value!!,
                "NOT IMPLEMENTED", //TODO: get image path and add here
                time.time,
                latitude!!,
                longitude!!,
                weatherDataPoint!!.precipitationValue!!,
                weatherDataPoint!!.windSpeed!!,
                weatherDataPoint!!.cloudiness!!,
                weatherDataPoint!!.pressure!!
            )
        )
        Toast.makeText(getApplication(), "Added observation to database!", Toast.LENGTH_LONG).show()
    }
}
