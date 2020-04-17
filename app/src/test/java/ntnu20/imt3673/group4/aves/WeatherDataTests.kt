package ntnu20.imt3673.group4.aves

import ntnu20.imt3673.group4.aves.weather.Mock
import ntnu20.imt3673.group4.aves.weather.WeatherDataPoint
import ntnu20.imt3673.group4.aves.weather.WeatherUtil
import ntnu20.imt3673.group4.aves.weather.ZuluUtil
import org.junit.Test
import org.junit.Assert.*

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
            136,
            "7.9",
            "N",
            "7.1",
           "11.0",
            "41.5",
            "1014.9",
            "9.2",
            "0.0",
            "8.8",
            "0.9",
            "0.0",
            "-4.3",
            "0.0",
            "0.0",
           "0.0"
        )

        val got: WeatherDataPoint = WeatherUtil.getNearestDataPoint(date!!, Mock.xmlData)
        assertEquals(
            "Teh gotten data should match known occurrence",
            expected,
            got
        )
    }
}