package ntnu20.imt3673.group4.aves.weather

/**
 * Data class to hold pointData from the 1.9 version of met.no's Locationforecast API
 *
 * See https://api.met.no/weatherapi/locationforecast/1.9/documentation for details
 */
data class WeatherDataPoint(
    val zuluTime: String,           // met.no specific zulustring
    val altitude: Int,              // meters above sea
    val temperature: String,         // celsius
    val windDirection: String,      // NN, NW etc
    val windSpeed: String,           // mps
    val windGust: String,            // mps
    val humidity: String,            // percent
    val pressure: String,            // hPa
    val cloudiness: String,          // percent
    val fog: String,                 // percent
    val lowClouds: String,           // percent
    val mediumClouds: String,        // percent
    val highClouds: String,          // percent
    val dewPoint: String,            // celsius -- called 'dewpoint' in the xml

    // mm last hour
    val precipitationValue: String,
    val precipitationMax: String,
    val precipitationMin: String
)