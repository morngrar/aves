package ntnu20.imt3673.group4.aves.weather

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.Instant
import java.util.*
import kotlin.math.abs
import kotlin.math.floor
import kotlin.math.round

object ZuluUtil {

    private val FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ss'Z'"

    private fun _getFormatter() : SimpleDateFormat {
        val formatter = SimpleDateFormat(FORMAT_STRING)
        formatter.timeZone = TimeZone.getTimeZone("UTC")
        return formatter
    }

    /**
     * Returns the custom zulu time string as used by the met.no API from given Date object
     */
    fun toZulu(date: Date) : String {
        return _getFormatter().format(date)
    }

    /**
     * Returns a Date object corresponding to the given custom zulu time string given (as used by
     * the met.no API). Returns null if the string is invalid in some way.
     */
    fun toDate(zulu: String) : Date? {
        return _getFormatter().parse(zulu)
    }

    /**
     * Returns the absolute difference between the zulu string and the date object in seconds
     */
    fun getDifferenceBetween(zulu: String, date: Date) : Long {
        val zuluSeconds = _getFormatter().parse(zulu).time/1000
        val dateSeconds = date.time/1000
        val diff = round(zuluSeconds.toDouble() - dateSeconds.toDouble())
        return abs(diff.toLong())
    }
}