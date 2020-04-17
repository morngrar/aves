package ntnu20.imt3673.group4.aves.weather

import android.util.Xml
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException
import java.io.IOException
import java.io.InputStream
import java.net.URL
import java.util.*
import kotlin.math.abs

object WeatherUtil {
    // We don't use namespaces
    private val ns: String? = null

    @Throws(XmlPullParserException::class, IOException::class)
    private fun parse(inputStream: InputStream): List<WeatherDataPoint> {
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
            // Starts by looking for the first time tag
            if (parser.name == "time") {
                val from = ZuluUtil.toDate(readAttributeWithoutStepping(parser, "from")!!)
                val to = ZuluUtil.toDate(readAttributeWithoutStepping(parser, "to")!!)
                if (abs(from!!.time - to!!.time) == 21600000L) {
                    skip(parser) // six hours span
                    parser.nextTag()
                }
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
        val zuluTime = parser.getAttributeValue(null, "from")

        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
            when (parser.name) {
                "location" -> altitude = readAttributeWithoutStepping(parser, "altitude")
                "temperature" -> temperature = readAttribute(parser, "value")
                "windDirection" -> windDirection = readAttribute(parser, "name")
                "windSpeed" -> windSpeed = readAttribute(parser, "mps")
                "windGust" -> windGust =  readAttribute(parser, "mps")
                "humidity" -> humidity = readAttribute(parser, "value")
                "pressure" -> pressure = readAttribute(parser, "value")
                "cloudiness" -> cloudiness = readAttribute(parser, "percent")
                "fog" -> fog = readAttribute(parser, "percent")
                "lowClouds" -> lowClouds = readAttribute(parser, "percent")
                "mediumClouds" -> mediumClouds = readAttribute(parser, "percent")
                "highClouds" -> highClouds = readAttribute(parser, "percent")
                "dewpointTemperature" -> dewPoint = readAttribute(parser, "value")
                else -> skip(parser)
            }
        }

        // Getting precipitation
        while (parser.name != "time") {
            parser.nextTag()
        }
        parser.nextTag()
        parser.require(XmlPullParser.START_TAG, ns, "time")
        loop@ while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
            when (parser.name) {
                "location" -> continue@loop
                "precipitation" -> {
                    precipitationValue = readAttributeWithoutStepping(parser, "value")
                    precipitationMax = readAttributeWithoutStepping(parser, "maxvalue")
                    precipitationMin = readAttributeWithoutStepping(parser, "minvalue")
                    parser.next()
                }
                else -> skip(parser)
            }
        }

        parser.nextTag()
        parser.require(XmlPullParser.END_TAG, ns, "time")

        return WeatherDataPoint(
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
    }

    // Returns the value of the given attribute between location-tags
    @Throws(IOException::class, XmlPullParserException::class)
    private fun readAttribute(parser: XmlPullParser, name: String): String {
        parser.require(XmlPullParser.START_TAG, ns, parser.name)
        val value = parser.getAttributeValue(null, name)
        parser.nextTag()
        parser.require(XmlPullParser.END_TAG, ns, parser.name)
        return value
    }

    // Returns the value of the given attribute, without stepping the parser forward
    @Throws(IOException::class, XmlPullParserException::class)
    private fun readAttributeWithoutStepping(parser: XmlPullParser, name: String): String? {
        parser.require(XmlPullParser.START_TAG, ns, parser.name)
        return parser.getAttributeValue(null, name)
    }


    fun getNearestDataPoint(date: Date, xmlData: String): WeatherDataPoint? {
        val input = xmlData.byteInputStream()
        val pointList = parse(input)

        var pointData: WeatherDataPoint? = null
        for (point in pointList) {
            val pointDate = ZuluUtil.toDate(point.zuluTime)
            if (pointDate != null) {
                if (pointDate.after(date)) {
                    pointData = point
                    break
                }
            }
        }

        return pointData
    }

    /**
     * Returns the most relevant data point from the location given
     */
    fun getRecentFrom(latitude: Double, longitude: Double) : WeatherDataPoint? {
        val url = URL("https://api.met.no/weatherapi/locationforecast/1.9/?lat=$latitude&lon=$longitude");
        return getNearestDataPoint(Date(), url.readText())
    }
}