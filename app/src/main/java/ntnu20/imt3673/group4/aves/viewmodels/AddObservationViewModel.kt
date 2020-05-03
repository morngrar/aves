package ntnu20.imt3673.group4.aves.viewmodels

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ntnu20.imt3673.group4.aves.R
import ntnu20.imt3673.group4.aves.data.ObservationData
import ntnu20.imt3673.group4.aves.weather.WeatherDataPoint
import java.util.*

/** ViewModel for the AddObservation fragment */
class AddObservationViewModel(application: Application) : AndroidViewModel(application) {


    private val firestoreViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(
        Application()
    ).create(FirestoreViewModel::class.java)

    /** Location-related variables */
    private var latitude: Double? = null
    private var longitude: Double? = null

    private var _gotLocation = MutableLiveData(false)
    val gotLocation: LiveData<Boolean>
        get() = _gotLocation

    private val fetchingString = application.resources.getString(R.string.str_retrieving)
    private var _location = MutableLiveData(fetchingString)
    val location: LiveData<String>
        get() = _location


    /** Setter for location will also turn on flags changing text color */
    fun setLocation(lat: Double, lon: Double) {
        latitude = lat
        longitude = lon
        _location.value = "$latitude, $longitude"
        _gotLocation.value = true
    }

    /** Handle for changing the text if the user has turned off location in the app settings */
    // TODO: remove this in final version
    private val notPermittedString = application.resources.getString(R.string.str_not_permitted)
    fun locationNotUsed() {
        _location.value = notPermittedString
    }

    /** Weather-related variables */
    private var _gotWeather = MutableLiveData(false)
    val gotWeather: LiveData<Boolean>
        get() = _gotWeather
    private var weatherDataPoint: WeatherDataPoint? = null
    fun setWeatherData(dataPoint: WeatherDataPoint) {
        weatherDataPoint = dataPoint
        _gotWeather.value = true
    }

    /** The owner's ID */
    private lateinit var ownerID: String
    fun setOwnerID(id: String) {
        ownerID = id
    }

    /** Manual input fields */
    var birdName = MutableLiveData("") //TODO: change in final version
    var description = MutableLiveData("")
    var count = MutableLiveData("")

    /** The current time */
    val time = Date()
    val timeString = time.toString()

    /** Validation of data for enabling the add button */
    val validated = liveData {
        var bool = false
        while(true) {
            emit(bool)
            bool = _gotLocation.value!! && _gotWeather.value!!
            bool = bool && !birdName.value.isNullOrBlank()
            delay(100)
        }
    }

    /** Adding the data to db */
    private var path: String? = null
    fun getImageViewPath(imgPath: String){
        path = imgPath
    }

    //private val db = ObservationDatabase.getInstance(application)
    fun addObservation() = viewModelScope.launch {
        var calcPath: String = ""
        if (path != null) {
            calcPath = path!!
        }

        firestoreViewModel.saveObservationToFirebase(
            ObservationData(
                "",
                ownerID,
                birdName.value!!,
                description.value,
                count.value,
                calcPath,
                time.time,
                latitude!!,
                longitude!!,
                weatherDataPoint!!.precipitationValue!!,
                weatherDataPoint!!.temperature!!,
                weatherDataPoint!!.windSpeed!!,
                weatherDataPoint!!.cloudiness!!,
                weatherDataPoint!!.pressure!!
            )
        )
        Toast.makeText(getApplication(), "Added observation to database!", Toast.LENGTH_LONG).show()
    }
}
