package ntnu20.imt3673.group4.aves.weather

/**
 * Data class to hold pointData from the 1.9 version of met.no's Locationforecast API
 *
 * See https://api.met.no/weatherapi/locationforecast/1.9/documentation for details
 */
data class WeatherDataPoint(
    val zuluTime: String,           // met.no specific zulustring
    val altitude: Int,              // meters above sea
    val temperature: Float,         // celsius
    val windDirection: String,      // NN, NW etc
    val windSpeed: Float,           // mps
    val windGust: Float,            // mps
    val humidity: Float,            // percent
    val pressure: Float,            // hPa
    val cloudiness: Float,          // percent
    val fog: Float,                 // percent
    val lowClouds: Float,           // percent
    val mediumClouds: Float,        // percent
    val highClouds: Float,          // percent
    val dewPoint: Float,            // celsius -- called 'dewpoint' in the xml

    // mm last hour
    val precipitationValue: Float,
    val precipitationMax: Float,
    val precipitationMin: Float
)