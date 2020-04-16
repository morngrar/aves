package ntnu20.imt3673.group4.aves

import android.util.Log
import ntnu20.imt3673.group4.aves.weather.ZuluUtil
import org.junit.Test

import org.junit.Assert.*
import java.time.Instant
import java.util.*

/**
 * Tesing the utility functions in regards to Zulu time conversion
 */
class ZuluTests {
    @Test
    fun conversion_date_to_zulu_is_correct() {
        val cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        cal.set(
            2016,
            3,
            15,
            20,
            14,
            0
        )
        val date = cal.time
        val got = ZuluUtil.toZulu(date)
        val expected = "2016-04-15T20:14:00Z"
        assertEquals("output should match custom zulu string", expected, got)
    }

    @Test
    fun conversion_zulu_to_date_is_correct() {
        val cal = Calendar.getInstance()
        cal.set(
            2016,
            3,
            15,
            20,
            14,
            0
        )
        val date = cal.time
        val zulu = ZuluUtil.toZulu(date)

        val got = ZuluUtil.toDate(zulu)
        assertEquals(
            "Conversion from custom zulu string should return the same date that created it",
            date.toString(),
            got.toString()
        )
    }

    @Test
    fun getDifferenceFrom_returns_seconds_correctly() {
        val cal = Calendar.getInstance()
        cal.set(
            2016,
            3,
            15,
            20,
            14,
            0
        )
        var date = cal.time
        val zulu = ZuluUtil.toZulu(date)

        cal.set(
            2016,
            3,
            15,
            20,
            14,
            4
        )
        date = cal.time
        var difference: Long = ZuluUtil.getDifferenceBetween(zulu, date) // difference in seconds
        assertEquals(
            "A date 4 seconds later should return 4",
            4L,
            difference
        )

        // backwards
        cal.set(
            2016,
            3,
            15,
            20,
            13,
            56
        )
        date = cal.time
        difference = ZuluUtil.getDifferenceBetween(zulu, date) // difference in seconds
        assertEquals(
            "A date 4 seconds earlier should return 4",
            4L,
            difference
        )
    }
}