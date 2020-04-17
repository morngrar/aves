package ntnu20.imt3673.group4.aves.weather

import android.util.Log
import android.util.Xml
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException
import java.io.IOException
import java.io.InputStream
import java.util.*

object WeatherUtil {
    // We don't use namespaces
    private val ns: String? = null

    @Throws(XmlPullParserException::class, IOException::class)
    private fun parse(inputStream: InputStream): List<WeatherDataPoint> {
        println("\n\n================================")
        println("\nPARSE CALLED\n")
        println("================================\n\n")
        inputStream.use { stream ->
            val parser: XmlPullParser = Xml.newPullParser()
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false)
            parser.setInput(stream, null)
            while (parser.name != "product") {
                parser.nextTag()
            }
            return readProduct(parser)
        }
    }

    @Throws(XmlPullParserException::class, IOException::class)
    private fun readProduct(parser: XmlPullParser): List<WeatherDataPoint> {
        val points = mutableListOf<WeatherDataPoint>()

        parser.require(XmlPullParser.START_TAG, ns, "product")
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
            // Starts by looking for the entry tag
            if (parser.name == "time") {
                points.add(readDataPoint(parser))
            } else {
                skip(parser)
            }
        }
        return points
    }

    @Throws(XmlPullParserException::class, IOException::class)
    private fun skip(parser: XmlPullParser) {
        if (parser.eventType != XmlPullParser.START_TAG) {
            throw IllegalStateException()
        }
        var depth = 1
        while (depth != 0) {
            when (parser.next()) {
                XmlPullParser.END_TAG -> depth--
                XmlPullParser.START_TAG -> depth++
            }
        }
    }

    // Parses the contents of an entry. If it encounters a title, summary, or link tag, hands them off
    // to their respective "read" methods for processing. Otherwise, skips the tag.
    @Throws(XmlPullParserException::class, IOException::class)
    private fun readDataPoint(parser: XmlPullParser): WeatherDataPoint {
        parser.require(XmlPullParser.START_TAG, ns, "time")
        println("parser.name:")
        println(parser.name)

        // define variables
        var altitude: String? = null             // meters above sea
        var temperature: String? = null        // celsius
        var windDirection: String? = null    // NN, NW etc
        var windSpeed: String? = null    // mps
        var windGust: String? = null     // mps
        var humidity: String? = null   // percent
        var pressure: String? = null  // hPa
        var cloudiness: String? = null  // percent
        var fog: String? = null   // percent
        var lowClouds: String? = null     // percent
        var mediumClouds: String? = null   // percent
        var highClouds: String? = null     // percent
        var dewPoint: String? = null    // celsius -- called 'dewpoint' in the xml

        // mm last hour
        var precipitationValue: String? = null
        var precipitationMax: String? = null
        var precipitationMin: String? = null

        // Get time from time tag
        var tag = parser.name
        val zuluTime = parser.getAttributeValue(null, "from")

        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
            println("parser.name:")
            println(parser.name)
            when (parser.name) {
                "location" -> altitude = null//readAltitude()
                "temperature" -> temperature = readValue(parser, parser.name)
                //"windDirection" -> windDirection = readName()
                //"windSpeed" -> windSpeed = readMps()
                //"windGust" -> windGust = readMps()
                //"humidity" -> humidity = readValue()
                else -> skip(parser)
            }
        }

        val dataPoint = WeatherDataPoint(
            zuluTime,
            altitude,
            temperature,
            windDirection,
            windSpeed,
            windGust,
            humidity,
            pressure,
            cloudiness,
            fog,
            lowClouds,
            mediumClouds,
            highClouds,
            dewPoint,
            precipitationValue,
            precipitationMax,
            precipitationMin
        )
        println("TEMPERATURE:")
        println(temperature)
        return dataPoint
    }

    // returns the value of the 'value' attribute of a tag that has it
    @Throws(IOException::class, XmlPullParserException::class)
    private fun readValue(parser: XmlPullParser, name: String): String {
        parser.require(XmlPullParser.START_TAG, ns, name)
        println("parser.name AFTER")
        println(parser.name)
        val value = parser.getAttributeValue(null, "value")
        parser.nextTag()
        parser.require(XmlPullParser.END_TAG, ns, name)
        return value
    }

    fun getNearestDataPoint(date: Date, xmlData: String): WeatherDataPoint? {

        val input = xmlData.byteInputStream()

        val pointList = parse(input)

        return pointList[0]
    }
}