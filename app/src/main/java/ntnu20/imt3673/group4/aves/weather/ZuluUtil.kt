package ntnu20.imt3673.group4.aves.weather

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

object ZuluUtil {

    private val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")

    /**
     * Returns the custom zulu time string as used by the met.no API from given Date object
     */
    fun toZulu(date: Date) : String {
        return formatter.format(date)
    }

    /**
     * Returns a Date object corresponding to the given custom zulu time string given (as used by
     * the met.no API). Returns null if the string is invalid in some way.
     */
    fun toDate(zulu: String) : Date? {
        return formatter.parse(zulu)
    }
}