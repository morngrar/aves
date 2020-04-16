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

        val datapoint: WeatherDataPoint = WeatherUtil.getNearestDataPoint(date!!, Mock.xmlData)
    }
}