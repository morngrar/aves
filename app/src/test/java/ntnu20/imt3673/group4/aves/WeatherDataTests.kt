package ntnu20.imt3673.group4.aves

import ntnu20.imt3673.group4.aves.weather.WeatherDataPoint
import ntnu20.imt3673.group4.aves.weather.WeatherUtil
import ntnu20.imt3673.group4.aves.weather.ZuluUtil
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.shadows.ShadowLog
import java.net.URL
import java.util.*

@RunWith(RobolectricTestRunner::class)
//@Config(sdk = [Build.VERSION_CODES.O_MR1])
class WeatherDataTests {

    @Test
    fun getNearestDataPoint_returns_correctly() {
        val date = ZuluUtil.toDate("2020-04-16T17:45:00Z")
        assertNotNull(
            "If this fails, something is wrong with the test - zulu/date conversion",
            date
        )

        val expected = WeatherDataPoint(
            "2020-04-16T18:00:00Z",
            "136",
            "6.5",
            "N",
            "4.3",
           "10.7",
            "50.2",
            "1015.6",
            "0.0",
            "0.0",
            "0.0",
            "0.0",
            "0.0",
            "-3.1",
            "0.0",
            "0.0",
           "0.0"
        )

        val xmlData = WeatherDataTests::class.java.getResource("/api.met.no.xml")!!.readText()
        val got = WeatherUtil.getNearestDataPoint(date!!, xmlData)
        assertEquals(
            "The gotten data should match known occurrence",
            expected,
            got
        )
    }

    @Test
    fun testing_url_getting() {
        val latitude: Double = 60.10
        val longitude: Double = 9.58
        val dataPoint = WeatherUtil.getRecentFrom(latitude, longitude)
        assertEquals(
            "gotten datapoint should match known value",
            "496",
            dataPoint?.altitude
        )
    }
}