package ntnu20.imt3673.group4.aves

import ntnu20.imt3673.group4.aves.weather.ZuluUtil
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Tesing the utility functions in regards to Zulu time conversion
 */
class ZuluTests {
    @Test
    fun conversion_datetime_to_zulu_is_correct() {
        val cal = Calendar.getInstance()
        cal.set(
            2016,
            4,
            15,
            20,
            14
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
            4,
            15,
            20,
            14
        )
        val date = cal.time
        val zulu = ZuluUtil.toZulu(date)

        val got = ZuluUtil.toDate(zulu)
        assertEquals(
            "Conversion from custom zulu string should return the same date that creatied it",
            date,
            got
        )
    }
}