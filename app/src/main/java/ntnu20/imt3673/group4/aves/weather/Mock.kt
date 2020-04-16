package ntnu20.imt3673.group4.aves.weather

object Mock {
    val xmlData =
    """
<weatherdata xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="http://api.met.no/weatherapi/locationforecast/1.9/schema" created="2020-04-16T15:25:45Z">
  <meta>
    <model name="met_public_forecast" termin="2020-04-16T15:00:00Z" runended="2020-04-16T14:57:02Z" nextrun="2020-04-16T16:05:16Z" from="2020-04-16T16:00:00Z" to="2020-04-25T18:00:00Z"></model>
  </meta>
  <product class="pointData">
    <time datatype="forecast" from="2020-04-16T16:00:00Z" to="2020-04-16T16:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="8.7"></temperature>
        <windDirection id="dd" deg="319.9" name="NW"></windDirection>
        <windSpeed id="ff" mps="5.6" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="10.1"></windGust>
        <humidity unit="percent" value="45.1"></humidity>
        <pressure id="pr" unit="hPa" value="1014.1"></pressure>
        <cloudiness id="NN" percent="4.2"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="3.7"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.9"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-2.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T15:00:00Z" to="2020-04-16T16:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T17:00:00Z" to="2020-04-16T17:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="7.9"></temperature>
        <windDirection id="dd" deg="358.1" name="N"></windDirection>
        <windSpeed id="ff" mps="7.1" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="11.0"></windGust>
        <humidity unit="percent" value="41.5"></humidity>
        <pressure id="pr" unit="hPa" value="1014.9"></pressure>
        <cloudiness id="NN" percent="9.2"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="8.8"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.9"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-4.3"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T16:00:00Z" to="2020-04-16T17:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T18:00:00Z" to="2020-04-16T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="6.5"></temperature>
        <windDirection id="dd" deg="343.6" name="N"></windDirection>
        <windSpeed id="ff" mps="4.3" beaufort="3" name="Lett bris"></windSpeed>
        <windGust id="ff_gust" mps="10.7"></windGust>
        <humidity unit="percent" value="50.2"></humidity>
        <pressure id="pr" unit="hPa" value="1015.6"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-3.1"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T17:00:00Z" to="2020-04-16T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T19:00:00Z" to="2020-04-16T19:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="4.9"></temperature>
        <windDirection id="dd" deg="312.3" name="NW"></windDirection>
        <windSpeed id="ff" mps="2.9" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="6.2"></windGust>
        <humidity unit="percent" value="57.0"></humidity>
        <pressure id="pr" unit="hPa" value="1016.4"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.1"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-2.5"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T18:00:00Z" to="2020-04-16T19:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T20:00:00Z" to="2020-04-16T20:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="3.5"></temperature>
        <windDirection id="dd" deg="314.4" name="NW"></windDirection>
        <windSpeed id="ff" mps="2.9" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="4.8"></windGust>
        <humidity unit="percent" value="61.3"></humidity>
        <pressure id="pr" unit="hPa" value="1017.1"></pressure>
        <cloudiness id="NN" percent="0.1"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.1"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-2.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T19:00:00Z" to="2020-04-16T20:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T14:00:00Z" to="2020-04-16T20:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="3.5"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.3"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T21:00:00Z" to="2020-04-16T21:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="2.6"></temperature>
        <windDirection id="dd" deg="303.4" name="NW"></windDirection>
        <windSpeed id="ff" mps="3.4" beaufort="3" name="Lett bris"></windSpeed>
        <windGust id="ff_gust" mps="5.3"></windGust>
        <humidity unit="percent" value="65.1"></humidity>
        <pressure id="pr" unit="hPa" value="1017.5"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-2.9"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T20:00:00Z" to="2020-04-16T21:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T15:00:00Z" to="2020-04-16T21:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="2.6"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="8.7"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T22:00:00Z" to="2020-04-16T22:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="2.1"></temperature>
        <windDirection id="dd" deg="302.8" name="NW"></windDirection>
        <windSpeed id="ff" mps="3.9" beaufort="3" name="Lett bris"></windSpeed>
        <windGust id="ff_gust" mps="6.3"></windGust>
        <humidity unit="percent" value="56.9"></humidity>
        <pressure id="pr" unit="hPa" value="1017.7"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-6.0"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T21:00:00Z" to="2020-04-16T22:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T16:00:00Z" to="2020-04-16T22:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="2.1"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="7.9"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T23:00:00Z" to="2020-04-16T23:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="1.5"></temperature>
        <windDirection id="dd" deg="283.1" name="W"></windDirection>
        <windSpeed id="ff" mps="2.6" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="5.8"></windGust>
        <humidity unit="percent" value="64.5"></humidity>
        <pressure id="pr" unit="hPa" value="1018.1"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-4.9"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T22:00:00Z" to="2020-04-16T23:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T17:00:00Z" to="2020-04-16T23:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="1.5"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="6.5"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T00:00:00Z" to="2020-04-17T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="1.2"></temperature>
        <windDirection id="dd" deg="271.7" name="W"></windDirection>
        <windSpeed id="ff" mps="2.5" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="3.8"></windGust>
        <humidity unit="percent" value="65.0"></humidity>
        <pressure id="pr" unit="hPa" value="1018.5"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-4.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T23:00:00Z" to="2020-04-17T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T18:00:00Z" to="2020-04-17T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="1.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="4.9"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="0"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T01:00:00Z" to="2020-04-17T01:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.9"></temperature>
        <windDirection id="dd" deg="276.4" name="W"></windDirection>
        <windSpeed id="ff" mps="3.1" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="4.2"></windGust>
        <humidity unit="percent" value="64.4"></humidity>
        <pressure id="pr" unit="hPa" value="1019.0"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.0"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T00:00:00Z" to="2020-04-17T01:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T19:00:00Z" to="2020-04-17T01:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.9"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="3.5"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T02:00:00Z" to="2020-04-17T02:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.8"></temperature>
        <windDirection id="dd" deg="284.8" name="W"></windDirection>
        <windSpeed id="ff" mps="3.3" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="4.5"></windGust>
        <humidity unit="percent" value="64.5"></humidity>
        <pressure id="pr" unit="hPa" value="1019.4"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.3"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T01:00:00Z" to="2020-04-17T02:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T20:00:00Z" to="2020-04-17T02:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.8"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="2.6"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T03:00:00Z" to="2020-04-17T03:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.6"></temperature>
        <windDirection id="dd" deg="283.5" name="W"></windDirection>
        <windSpeed id="ff" mps="3.1" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="4.3"></windGust>
        <humidity unit="percent" value="64.7"></humidity>
        <pressure id="pr" unit="hPa" value="1019.7"></pressure>
        <cloudiness id="NN" percent="0.1"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.1"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.5"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T02:00:00Z" to="2020-04-17T03:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T21:00:00Z" to="2020-04-17T03:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.6"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="2.1"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T04:00:00Z" to="2020-04-17T04:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.2"></temperature>
        <windDirection id="dd" deg="279.1" name="W"></windDirection>
        <windSpeed id="ff" mps="2.5" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="4.2"></windGust>
        <humidity unit="percent" value="64.4"></humidity>
        <pressure id="pr" unit="hPa" value="1020.4"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T03:00:00Z" to="2020-04-17T04:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T22:00:00Z" to="2020-04-17T04:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="1.5"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T05:00:00Z" to="2020-04-17T05:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.4"></temperature>
        <windDirection id="dd" deg="284.0" name="W"></windDirection>
        <windSpeed id="ff" mps="2.7" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="3.7"></windGust>
        <humidity unit="percent" value="62.3"></humidity>
        <pressure id="pr" unit="hPa" value="1020.8"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-6.1"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T04:00:00Z" to="2020-04-17T05:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-16T23:00:00Z" to="2020-04-17T05:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="1.2"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T06:00:00Z" to="2020-04-17T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="1.9"></temperature>
        <windDirection id="dd" deg="295.7" name="NW"></windDirection>
        <windSpeed id="ff" mps="3.1" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="4.7"></windGust>
        <humidity unit="percent" value="56.1"></humidity>
        <pressure id="pr" unit="hPa" value="1021.2"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-6.0"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T05:00:00Z" to="2020-04-17T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T00:00:00Z" to="2020-04-17T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="1.9"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="0"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T07:00:00Z" to="2020-04-17T07:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="4.1"></temperature>
        <windDirection id="dd" deg="328.4" name="NW"></windDirection>
        <windSpeed id="ff" mps="4.8" beaufort="3" name="Lett bris"></windSpeed>
        <windGust id="ff_gust" mps="7.7"></windGust>
        <humidity unit="percent" value="46.4"></humidity>
        <pressure id="pr" unit="hPa" value="1021.3"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-6.5"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T06:00:00Z" to="2020-04-17T07:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T01:00:00Z" to="2020-04-17T07:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="4.1"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T08:00:00Z" to="2020-04-17T08:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="5.6"></temperature>
        <windDirection id="dd" deg="339.3" name="N"></windDirection>
        <windSpeed id="ff" mps="6.9" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="11.1"></windGust>
        <humidity unit="percent" value="41.6"></humidity>
        <pressure id="pr" unit="hPa" value="1021.4"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-6.1"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T07:00:00Z" to="2020-04-17T08:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T02:00:00Z" to="2020-04-17T08:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="5.6"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T09:00:00Z" to="2020-04-17T09:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="6.7"></temperature>
        <windDirection id="dd" deg="342.5" name="N"></windDirection>
        <windSpeed id="ff" mps="6.5" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="11.3"></windGust>
        <humidity unit="percent" value="41.1"></humidity>
        <pressure id="pr" unit="hPa" value="1021.5"></pressure>
        <cloudiness id="NN" percent="2.7"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.2"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="2.5"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-4.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T08:00:00Z" to="2020-04-17T09:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T03:00:00Z" to="2020-04-17T09:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="6.7"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T10:00:00Z" to="2020-04-17T10:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="7.7"></temperature>
        <windDirection id="dd" deg="339.0" name="N"></windDirection>
        <windSpeed id="ff" mps="5.8" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="10.7"></windGust>
        <humidity unit="percent" value="40.8"></humidity>
        <pressure id="pr" unit="hPa" value="1021.6"></pressure>
        <cloudiness id="NN" percent="4.7"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="1.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="3.6"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-3.9"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T09:00:00Z" to="2020-04-17T10:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T04:00:00Z" to="2020-04-17T10:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.4"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="7.7"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T11:00:00Z" to="2020-04-17T11:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="8.6"></temperature>
        <windDirection id="dd" deg="336.8" name="NW"></windDirection>
        <windSpeed id="ff" mps="6.2" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="10.4"></windGust>
        <humidity unit="percent" value="39.2"></humidity>
        <pressure id="pr" unit="hPa" value="1021.8"></pressure>
        <cloudiness id="NN" percent="31.5"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="1.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="30.7"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-3.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T10:00:00Z" to="2020-04-17T11:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T05:00:00Z" to="2020-04-17T11:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="1.9"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="8.6"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T12:00:00Z" to="2020-04-17T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="8.8"></temperature>
        <windDirection id="dd" deg="338.4" name="N"></windDirection>
        <windSpeed id="ff" mps="6.7" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="11.2"></windGust>
        <humidity unit="percent" value="36.6"></humidity>
        <pressure id="pr" unit="hPa" value="1021.9"></pressure>
        <cloudiness id="NN" percent="37.5"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.9"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.1"></mediumClouds>
        <highClouds id="HIGH" percent="37.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-4.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T11:00:00Z" to="2020-04-17T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T06:00:00Z" to="2020-04-17T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="4.1"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="8.8"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T13:00:00Z" to="2020-04-17T13:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="9.1"></temperature>
        <windDirection id="dd" deg="343.7" name="N"></windDirection>
        <windSpeed id="ff" mps="7.1" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="11.7"></windGust>
        <humidity unit="percent" value="34.5"></humidity>
        <pressure id="pr" unit="hPa" value="1022.0"></pressure>
        <cloudiness id="NN" percent="4.3"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.7"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="3.7"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-6.0"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T12:00:00Z" to="2020-04-17T13:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T07:00:00Z" to="2020-04-17T13:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="5.6"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.1"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T14:00:00Z" to="2020-04-17T14:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="9.2"></temperature>
        <windDirection id="dd" deg="344.8" name="N"></windDirection>
        <windSpeed id="ff" mps="6.7" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="11.7"></windGust>
        <humidity unit="percent" value="32.9"></humidity>
        <pressure id="pr" unit="hPa" value="1021.9"></pressure>
        <cloudiness id="NN" percent="8.1"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.5"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="7.6"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-6.2"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T13:00:00Z" to="2020-04-17T14:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T08:00:00Z" to="2020-04-17T14:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="6.7"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.2"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T15:00:00Z" to="2020-04-17T15:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="9.1"></temperature>
        <windDirection id="dd" deg="345.1" name="N"></windDirection>
        <windSpeed id="ff" mps="6.4" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="11.0"></windGust>
        <humidity unit="percent" value="33.6"></humidity>
        <pressure id="pr" unit="hPa" value="1022.1"></pressure>
        <cloudiness id="NN" percent="61.8"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.2"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="61.7"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.9"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T14:00:00Z" to="2020-04-17T15:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T09:00:00Z" to="2020-04-17T15:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="7.7"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.2"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T16:00:00Z" to="2020-04-17T16:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="8.5"></temperature>
        <windDirection id="dd" deg="346.2" name="N"></windDirection>
        <windSpeed id="ff" mps="5.6" beaufort="4" name="Laber bris"></windSpeed>
        <windGust id="ff_gust" mps="10.4"></windGust>
        <humidity unit="percent" value="36.0"></humidity>
        <pressure id="pr" unit="hPa" value="1022.1"></pressure>
        <cloudiness id="NN" percent="66.8"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.1"></mediumClouds>
        <highClouds id="HIGH" percent="66.7"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.5"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T15:00:00Z" to="2020-04-17T16:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T10:00:00Z" to="2020-04-17T16:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="8.5"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.2"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T17:00:00Z" to="2020-04-17T17:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="7.8"></temperature>
        <windDirection id="dd" deg="351.1" name="N"></windDirection>
        <windSpeed id="ff" mps="4.5" beaufort="3" name="Lett bris"></windSpeed>
        <windGust id="ff_gust" mps="8.8"></windGust>
        <humidity unit="percent" value="39.4"></humidity>
        <pressure id="pr" unit="hPa" value="1022.3"></pressure>
        <cloudiness id="NN" percent="52.4"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="6.6"></mediumClouds>
        <highClouds id="HIGH" percent="49.7"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.0"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T16:00:00Z" to="2020-04-17T17:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T11:00:00Z" to="2020-04-17T17:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="7.8"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.2"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T18:00:00Z" to="2020-04-17T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="6.6"></temperature>
        <windDirection id="dd" deg="349.8" name="N"></windDirection>
        <windSpeed id="ff" mps="2.5" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="6.8"></windGust>
        <humidity unit="percent" value="44.8"></humidity>
        <pressure id="pr" unit="hPa" value="1022.7"></pressure>
        <cloudiness id="NN" percent="29.8"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="6.0"></mediumClouds>
        <highClouds id="HIGH" percent="25.6"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-3.5"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T17:00:00Z" to="2020-04-17T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T12:00:00Z" to="2020-04-17T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="6.6"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.2"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
        <symbolProbability unit="probabilitycode" value="0"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T19:00:00Z" to="2020-04-17T19:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="4.7"></temperature>
        <windDirection id="dd" deg="311.4" name="NW"></windDirection>
        <windSpeed id="ff" mps="0.9" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="3.4"></windGust>
        <humidity unit="percent" value="52.2"></humidity>
        <pressure id="pr" unit="hPa" value="1023.3"></pressure>
        <cloudiness id="NN" percent="5.4"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.8"></mediumClouds>
        <highClouds id="HIGH" percent="4.6"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-3.3"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T18:00:00Z" to="2020-04-17T19:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T13:00:00Z" to="2020-04-17T19:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="4.7"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.2"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T20:00:00Z" to="2020-04-17T20:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="3.1"></temperature>
        <windDirection id="dd" deg="302.0" name="NW"></windDirection>
        <windSpeed id="ff" mps="1.6" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="2.3"></windGust>
        <humidity unit="percent" value="59.5"></humidity>
        <pressure id="pr" unit="hPa" value="1023.9"></pressure>
        <cloudiness id="NN" percent="1.9"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.7"></mediumClouds>
        <highClouds id="HIGH" percent="1.2"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-3.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T19:00:00Z" to="2020-04-17T20:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T14:00:00Z" to="2020-04-17T20:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="3.1"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.1"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T21:00:00Z" to="2020-04-17T21:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="2.0"></temperature>
        <windDirection id="dd" deg="292.4" name="W"></windDirection>
        <windSpeed id="ff" mps="2.3" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="3.1"></windGust>
        <humidity unit="percent" value="64.3"></humidity>
        <pressure id="pr" unit="hPa" value="1024.6"></pressure>
        <cloudiness id="NN" percent="32.5"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="5.5"></mediumClouds>
        <highClouds id="HIGH" percent="29.3"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-3.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T20:00:00Z" to="2020-04-17T21:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T15:00:00Z" to="2020-04-17T21:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="2.0"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="8.5"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T22:00:00Z" to="2020-04-17T22:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="1.3"></temperature>
        <windDirection id="dd" deg="293.3" name="NW"></windDirection>
        <windSpeed id="ff" mps="2.8" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="3.7"></windGust>
        <humidity unit="percent" value="66.9"></humidity>
        <pressure id="pr" unit="hPa" value="1025.3"></pressure>
        <cloudiness id="NN" percent="22.2"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="15.1"></mediumClouds>
        <highClouds id="HIGH" percent="8.9"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-4.2"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T21:00:00Z" to="2020-04-17T22:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T16:00:00Z" to="2020-04-17T22:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="1.3"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="7.8"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T23:00:00Z" to="2020-04-17T23:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.8"></temperature>
        <windDirection id="dd" deg="312.4" name="NW"></windDirection>
        <windSpeed id="ff" mps="2.1" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="3.6"></windGust>
        <humidity unit="percent" value="68.8"></humidity>
        <pressure id="pr" unit="hPa" value="1025.7"></pressure>
        <cloudiness id="NN" percent="8.7"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="8.4"></mediumClouds>
        <highClouds id="HIGH" percent="0.4"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-4.4"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T22:00:00Z" to="2020-04-17T23:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T17:00:00Z" to="2020-04-17T23:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.8"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="6.6"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T00:00:00Z" to="2020-04-18T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.1"></temperature>
        <windDirection id="dd" deg="346.7" name="N"></windDirection>
        <windSpeed id="ff" mps="1.2" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="2.8"></windGust>
        <humidity unit="percent" value="69.5"></humidity>
        <pressure id="pr" unit="hPa" value="1026.0"></pressure>
        <cloudiness id="NN" percent="0.7"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.4"></mediumClouds>
        <highClouds id="HIGH" percent="0.4"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-4.5"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T23:00:00Z" to="2020-04-18T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T18:00:00Z" to="2020-04-18T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.1"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="4.7"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T01:00:00Z" to="2020-04-18T01:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="-0.3"></temperature>
        <windDirection id="dd" deg="341.5" name="N"></windDirection>
        <windSpeed id="ff" mps="1.3" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="2.0"></windGust>
        <humidity unit="percent" value="70.9"></humidity>
        <pressure id="pr" unit="hPa" value="1026.1"></pressure>
        <cloudiness id="NN" percent="4.6"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.1"></mediumClouds>
        <highClouds id="HIGH" percent="4.5"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-4.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T00:00:00Z" to="2020-04-18T01:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T19:00:00Z" to="2020-04-18T01:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.3"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="3.1"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T02:00:00Z" to="2020-04-18T02:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="-0.5"></temperature>
        <windDirection id="dd" deg="359.6" name="N"></windDirection>
        <windSpeed id="ff" mps="1.9" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="2.6"></windGust>
        <humidity unit="percent" value="73.1"></humidity>
        <pressure id="pr" unit="hPa" value="1026.2"></pressure>
        <cloudiness id="NN" percent="7.6"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="5.3"></mediumClouds>
        <highClouds id="HIGH" percent="2.5"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-4.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T01:00:00Z" to="2020-04-18T02:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T20:00:00Z" to="2020-04-18T02:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.5"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="2.0"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T03:00:00Z" to="2020-04-18T03:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="-0.6"></temperature>
        <windDirection id="dd" deg="24.4" name="NE"></windDirection>
        <windSpeed id="ff" mps="1.8" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="2.6"></windGust>
        <humidity unit="percent" value="72.5"></humidity>
        <pressure id="pr" unit="hPa" value="1026.3"></pressure>
        <cloudiness id="NN" percent="35.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.1"></lowClouds>
        <mediumClouds id="MEDIUM" percent="34.9"></mediumClouds>
        <highClouds id="HIGH" percent="0.1"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.3"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T02:00:00Z" to="2020-04-18T03:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T21:00:00Z" to="2020-04-18T03:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.6"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="1.3"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T04:00:00Z" to="2020-04-18T04:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="-0.8"></temperature>
        <windDirection id="dd" deg="12.2" name="N"></windDirection>
        <windSpeed id="ff" mps="1.0" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="2.5"></windGust>
        <humidity unit="percent" value="71.2"></humidity>
        <pressure id="pr" unit="hPa" value="1026.3"></pressure>
        <cloudiness id="NN" percent="61.2"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="0.9"></lowClouds>
        <mediumClouds id="MEDIUM" percent="61.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T03:00:00Z" to="2020-04-18T04:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T22:00:00Z" to="2020-04-18T04:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.8"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="0.8"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T05:00:00Z" to="2020-04-18T05:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="-0.7"></temperature>
        <windDirection id="dd" deg="255.6" name="W"></windDirection>
        <windSpeed id="ff" mps="0.2" beaufort="0" name="Stille"></windSpeed>
        <windGust id="ff_gust" mps="1.4"></windGust>
        <humidity unit="percent" value="69.9"></humidity>
        <pressure id="pr" unit="hPa" value="1026.4"></pressure>
        <cloudiness id="NN" percent="78.5"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="3.2"></lowClouds>
        <mediumClouds id="MEDIUM" percent="78.1"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T04:00:00Z" to="2020-04-18T05:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-17T23:00:00Z" to="2020-04-18T05:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.8"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="0.1"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T06:00:00Z" to="2020-04-18T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.3"></temperature>
        <windDirection id="dd" deg="183.5" name="S"></windDirection>
        <windSpeed id="ff" mps="1.1" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="1.7"></windGust>
        <humidity unit="percent" value="64.7"></humidity>
        <pressure id="pr" unit="hPa" value="1026.8"></pressure>
        <cloudiness id="NN" percent="90.7"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="7.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="90.1"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-5.5"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T05:00:00Z" to="2020-04-18T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Cloud" number="4"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T00:00:00Z" to="2020-04-18T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.8"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="0.3"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T07:00:00Z" to="2020-04-18T07:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="1.7"></temperature>
        <windDirection id="dd" deg="220.3" name="SW"></windDirection>
        <windSpeed id="ff" mps="1.7" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="3.0"></windGust>
        <humidity unit="percent" value="61.2"></humidity>
        <pressure id="pr" unit="hPa" value="1027.0"></pressure>
        <cloudiness id="NN" percent="95.2"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="13.2"></lowClouds>
        <mediumClouds id="MEDIUM" percent="94.5"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.2"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T06:00:00Z" to="2020-04-18T07:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Cloud" number="4"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T01:00:00Z" to="2020-04-18T07:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.8"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="1.7"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T08:00:00Z" to="2020-04-18T08:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="2.9"></temperature>
        <windDirection id="dd" deg="227.4" name="SW"></windDirection>
        <windSpeed id="ff" mps="1.5" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="3.2"></windGust>
        <humidity unit="percent" value="54.5"></humidity>
        <pressure id="pr" unit="hPa" value="1027.0"></pressure>
        <cloudiness id="NN" percent="93.0"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="31.2"></lowClouds>
        <mediumClouds id="MEDIUM" percent="90.8"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-5.4"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T07:00:00Z" to="2020-04-18T08:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Cloud" number="4"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T02:00:00Z" to="2020-04-18T08:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.8"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="2.9"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T09:00:00Z" to="2020-04-18T09:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="4.1"></temperature>
        <windDirection id="dd" deg="232.6" name="SW"></windDirection>
        <windSpeed id="ff" mps="1.1" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="3.2"></windGust>
        <humidity unit="percent" value="50.8"></humidity>
        <pressure id="pr" unit="hPa" value="1026.9"></pressure>
        <cloudiness id="NN" percent="94.9"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="54.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="91.6"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-4.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T08:00:00Z" to="2020-04-18T09:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Cloud" number="4"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T03:00:00Z" to="2020-04-18T09:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.8"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="4.1"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T10:00:00Z" to="2020-04-18T10:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="5.3"></temperature>
        <windDirection id="dd" deg="235.7" name="SW"></windDirection>
        <windSpeed id="ff" mps="1.5" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="3.8"></windGust>
        <humidity unit="percent" value="47.5"></humidity>
        <pressure id="pr" unit="hPa" value="1026.5"></pressure>
        <cloudiness id="NN" percent="93.5"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="52.3"></lowClouds>
        <mediumClouds id="MEDIUM" percent="87.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-4.1"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T09:00:00Z" to="2020-04-18T10:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Cloud" number="4"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T04:00:00Z" to="2020-04-18T10:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.7"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="5.3"></maxTemperature>
        <symbol id="Cloud" number="4"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T11:00:00Z" to="2020-04-18T11:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="6.4"></temperature>
        <windDirection id="dd" deg="238.3" name="SW"></windDirection>
        <windSpeed id="ff" mps="2.4" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="5.1"></windGust>
        <humidity unit="percent" value="45.8"></humidity>
        <pressure id="pr" unit="hPa" value="1026.1"></pressure>
        <cloudiness id="NN" percent="71.1"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="31.4"></lowClouds>
        <mediumClouds id="MEDIUM" percent="57.9"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-3.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T10:00:00Z" to="2020-04-18T11:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T05:00:00Z" to="2020-04-18T11:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.3"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="6.4"></maxTemperature>
        <symbol id="Cloud" number="4"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T12:00:00Z" to="2020-04-18T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="7.4"></temperature>
        <windDirection id="dd" deg="235.1" name="SW"></windDirection>
        <windSpeed id="ff" mps="2.0" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="5.1"></windGust>
        <humidity unit="percent" value="44.3"></humidity>
        <pressure id="pr" unit="hPa" value="1025.8"></pressure>
        <cloudiness id="NN" percent="64.7"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="30.6"></lowClouds>
        <mediumClouds id="MEDIUM" percent="51.5"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-3.2"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T11:00:00Z" to="2020-04-18T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T06:00:00Z" to="2020-04-18T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="1.7"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="7.4"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="0"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T13:00:00Z" to="2020-04-18T13:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="8.5"></temperature>
        <windDirection id="dd" deg="237.3" name="SW"></windDirection>
        <windSpeed id="ff" mps="2.0" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="4.8"></windGust>
        <humidity unit="percent" value="43.3"></humidity>
        <pressure id="pr" unit="hPa" value="1025.6"></pressure>
        <cloudiness id="NN" percent="65.2"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="38.7"></lowClouds>
        <mediumClouds id="MEDIUM" percent="52.4"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-2.6"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T12:00:00Z" to="2020-04-18T13:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T07:00:00Z" to="2020-04-18T13:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="2.9"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="8.5"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T14:00:00Z" to="2020-04-18T14:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="9.3"></temperature>
        <windDirection id="dd" deg="217.0" name="SW"></windDirection>
        <windSpeed id="ff" mps="1.3" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="4.6"></windGust>
        <humidity unit="percent" value="42.9"></humidity>
        <pressure id="pr" unit="hPa" value="1025.2"></pressure>
        <cloudiness id="NN" percent="66.5"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="47.7"></lowClouds>
        <mediumClouds id="MEDIUM" percent="47.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-2.3"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T13:00:00Z" to="2020-04-18T14:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T08:00:00Z" to="2020-04-18T14:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="4.1"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.3"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T15:00:00Z" to="2020-04-18T15:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="9.8"></temperature>
        <windDirection id="dd" deg="174.4" name="S"></windDirection>
        <windSpeed id="ff" mps="0.5" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="3.7"></windGust>
        <humidity unit="percent" value="43.2"></humidity>
        <pressure id="pr" unit="hPa" value="1024.9"></pressure>
        <cloudiness id="NN" percent="59.9"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="51.8"></lowClouds>
        <mediumClouds id="MEDIUM" percent="23.1"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-1.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T14:00:00Z" to="2020-04-18T15:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T09:00:00Z" to="2020-04-18T15:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="5.3"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.8"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T16:00:00Z" to="2020-04-18T16:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="10.0"></temperature>
        <windDirection id="dd" deg="63.2" name="NE"></windDirection>
        <windSpeed id="ff" mps="1.1" beaufort="1" name="Flau vind"></windSpeed>
        <windGust id="ff_gust" mps="3.1"></windGust>
        <humidity unit="percent" value="43.4"></humidity>
        <pressure id="pr" unit="hPa" value="1024.9"></pressure>
        <cloudiness id="NN" percent="35.6"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="34.4"></lowClouds>
        <mediumClouds id="MEDIUM" percent="2.3"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-1.3"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T15:00:00Z" to="2020-04-18T16:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="LightCloud" number="2"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T10:00:00Z" to="2020-04-18T16:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="6.4"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="10.0"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T17:00:00Z" to="2020-04-18T17:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="9.9"></temperature>
        <windDirection id="dd" deg="37.5" name="NE"></windDirection>
        <windSpeed id="ff" mps="1.6" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="3.2"></windGust>
        <humidity unit="percent" value="47.2"></humidity>
        <pressure id="pr" unit="hPa" value="1024.8"></pressure>
        <cloudiness id="NN" percent="8.7"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="8.7"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <dewpointTemperature id="TD" unit="celsius" value="-0.2"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T16:00:00Z" to="2020-04-18T17:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T11:00:00Z" to="2020-04-18T17:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="7.4"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="10.0"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T18:00:00Z" to="2020-04-18T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="8.8"></temperature>
        <windDirection id="dd" deg="43.5" name="NE"></windDirection>
        <windSpeed id="ff" mps="2.9" beaufort="2" name="Svak vind"></windSpeed>
        <windGust id="ff_gust" mps="5.0"></windGust>
        <humidity unit="percent" value="54.2"></humidity>
        <pressure id="pr" unit="hPa" value="1025.2"></pressure>
        <cloudiness id="NN" percent="1.8"></cloudiness>
        <fog id="FOG" percent="0.0"></fog>
        <lowClouds id="LOW" percent="1.8"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="0.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T17:00:00Z" to="2020-04-18T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <symbol id="Sun" number="1"></symbol>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T12:00:00Z" to="2020-04-18T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="8.5"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="10.0"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-19T00:00:00Z" to="2020-04-19T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="-0.3"></temperature>
        <windDirection id="dd" deg="349.2" name="N"></windDirection>
        <windSpeed id="ff" mps="1.4" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="91.7"></humidity>
        <pressure id="pr" unit="hPa" value="1027.4"></pressure>
        <cloudiness id="NN" percent="7.0"></cloudiness>
        <lowClouds id="LOW" percent="5.1"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.8"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-1.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-18T18:00:00Z" to="2020-04-19T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.3"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="6.2"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-19T06:00:00Z" to="2020-04-19T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="2.3"></temperature>
        <windDirection id="dd" deg="328.2" name="NW"></windDirection>
        <windSpeed id="ff" mps="0.7" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="82.9"></humidity>
        <pressure id="pr" unit="hPa" value="1028.8"></pressure>
        <cloudiness id="NN" percent="11.7"></cloudiness>
        <lowClouds id="LOW" percent="4.7"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-0.5"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-19T00:00:00Z" to="2020-04-19T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.7"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="2.3"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="0"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-19T12:00:00Z" to="2020-04-19T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="12.2"></temperature>
        <windDirection id="dd" deg="310.4" name="NW"></windDirection>
        <windSpeed id="ff" mps="1.4" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="46.8"></humidity>
        <pressure id="pr" unit="hPa" value="1027.8"></pressure>
        <cloudiness id="NN" percent="2.3"></cloudiness>
        <lowClouds id="LOW" percent="0.8"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="1.0"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-19T06:00:00Z" to="2020-04-19T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="2.7"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="12.2"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="0"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-19T18:00:00Z" to="2020-04-19T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="10.2"></temperature>
        <windDirection id="dd" deg="229.9" name="SW"></windDirection>
        <windSpeed id="ff" mps="1.4" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="62.2"></humidity>
        <pressure id="pr" unit="hPa" value="1027.7"></pressure>
        <cloudiness id="NN" percent="0.8"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="3.1"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-19T12:00:00Z" to="2020-04-19T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="10.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="13.6"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-20T00:00:00Z" to="2020-04-20T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.4"></temperature>
        <windDirection id="dd" deg="21.6" name="N"></windDirection>
        <windSpeed id="ff" mps="1.6" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="92.3"></humidity>
        <pressure id="pr" unit="hPa" value="1031.4"></pressure>
        <cloudiness id="NN" percent="0.8"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-0.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-19T18:00:00Z" to="2020-04-20T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.4"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="9.7"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="0"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-20T06:00:00Z" to="2020-04-20T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="3.0"></temperature>
        <windDirection id="dd" deg="39.9" name="NE"></windDirection>
        <windSpeed id="ff" mps="0.7" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="82.7"></humidity>
        <pressure id="pr" unit="hPa" value="1033.4"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="0.2"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-20T00:00:00Z" to="2020-04-20T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.5"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="3.0"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="0"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-20T12:00:00Z" to="2020-04-20T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="14.7"></temperature>
        <windDirection id="dd" deg="267.6" name="W"></windDirection>
        <windSpeed id="ff" mps="0.9" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="45.9"></humidity>
        <pressure id="pr" unit="hPa" value="1032.6"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="3.1"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-20T06:00:00Z" to="2020-04-20T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="3.3"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="14.7"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-20T18:00:00Z" to="2020-04-20T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="12.4"></temperature>
        <windDirection id="dd" deg="299.4" name="NW"></windDirection>
        <windSpeed id="ff" mps="1.2" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="60.4"></humidity>
        <pressure id="pr" unit="hPa" value="1031.9"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="4.9"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-20T12:00:00Z" to="2020-04-20T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="12.4"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="15.8"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-21T00:00:00Z" to="2020-04-21T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="1.4"></temperature>
        <windDirection id="dd" deg="352.4" name="N"></windDirection>
        <windSpeed id="ff" mps="1.0" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="92.3"></humidity>
        <pressure id="pr" unit="hPa" value="1034.8"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="0.2"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-20T18:00:00Z" to="2020-04-21T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="1.4"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="11.9"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-21T06:00:00Z" to="2020-04-21T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="3.7"></temperature>
        <windDirection id="dd" deg="240.9" name="SW"></windDirection>
        <windSpeed id="ff" mps="0.5" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="81.2"></humidity>
        <pressure id="pr" unit="hPa" value="1035.6"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="0"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="0.6"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-21T00:00:00Z" to="2020-04-21T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="-0.1"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="3.7"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-21T12:00:00Z" to="2020-04-21T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="16.6"></temperature>
        <windDirection id="dd" deg="263.9" name="W"></windDirection>
        <windSpeed id="ff" mps="1.2" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="40.9"></humidity>
        <pressure id="pr" unit="hPa" value="1033.1"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="3.1"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-21T06:00:00Z" to="2020-04-21T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="3.9"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="16.6"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-21T18:00:00Z" to="2020-04-21T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="13.1"></temperature>
        <windDirection id="dd" deg="14.4" name="N"></windDirection>
        <windSpeed id="ff" mps="1.2" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="57.0"></humidity>
        <pressure id="pr" unit="hPa" value="1030.2"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="4.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-21T12:00:00Z" to="2020-04-21T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="13.1"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="17.4"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-22T00:00:00Z" to="2020-04-22T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="2.1"></temperature>
        <windDirection id="dd" deg="335.3" name="NW"></windDirection>
        <windSpeed id="ff" mps="1.6" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="88.1"></humidity>
        <pressure id="pr" unit="hPa" value="1032.6"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="0.2"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-21T18:00:00Z" to="2020-04-22T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="2.1"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="13.0"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-22T06:00:00Z" to="2020-04-22T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="4.2"></temperature>
        <windDirection id="dd" deg="302.5" name="NW"></windDirection>
        <windSpeed id="ff" mps="0.8" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="77.5"></humidity>
        <pressure id="pr" unit="hPa" value="1033.4"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="0.5"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-22T00:00:00Z" to="2020-04-22T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="4.2"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="2"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-22T12:00:00Z" to="2020-04-22T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="15.3"></temperature>
        <windDirection id="dd" deg="342.7" name="N"></windDirection>
        <windSpeed id="ff" mps="1.4" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="40.6"></humidity>
        <pressure id="pr" unit="hPa" value="1029.3"></pressure>
        <cloudiness id="NN" percent="77.3"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="20.3"></mediumClouds>
        <highClouds id="HIGH" percent="52.3"></highClouds>
        <temperatureProbability unit="probabilitycode" value="2"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="1.9"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-22T06:00:00Z" to="2020-04-22T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="5.1"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="15.3"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="2"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-22T18:00:00Z" to="2020-04-22T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="11.7"></temperature>
        <windDirection id="dd" deg="16.8" name="N"></windDirection>
        <windSpeed id="ff" mps="3.0" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="54.0"></humidity>
        <pressure id="pr" unit="hPa" value="1028.8"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="2"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="2.6"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-22T12:00:00Z" to="2020-04-22T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="11.7"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="16.3"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-23T00:00:00Z" to="2020-04-23T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="1.9"></temperature>
        <windDirection id="dd" deg="11.9" name="N"></windDirection>
        <windSpeed id="ff" mps="1.9" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="81.8"></humidity>
        <pressure id="pr" unit="hPa" value="1031.0"></pressure>
        <cloudiness id="NN" percent="0.0"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-1.1"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-22T18:00:00Z" to="2020-04-23T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="1.9"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="11.2"></maxTemperature>
        <symbol id="Sun" number="1"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-23T06:00:00Z" to="2020-04-23T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="4.4"></temperature>
        <windDirection id="dd" deg="13.4" name="N"></windDirection>
        <windSpeed id="ff" mps="1.2" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="74.9"></humidity>
        <pressure id="pr" unit="hPa" value="1030.1"></pressure>
        <cloudiness id="NN" percent="57.0"></cloudiness>
        <lowClouds id="LOW" percent="0.8"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.4"></mediumClouds>
        <highClouds id="HIGH" percent="10.5"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="0.2"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-23T00:00:00Z" to="2020-04-23T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.6"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="4.4"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-23T12:00:00Z" to="2020-04-23T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="12.9"></temperature>
        <windDirection id="dd" deg="6.4" name="N"></windDirection>
        <windSpeed id="ff" mps="2.6" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="39.5"></humidity>
        <pressure id="pr" unit="hPa" value="1025.9"></pressure>
        <cloudiness id="NN" percent="75.4"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="2.0"></mediumClouds>
        <highClouds id="HIGH" percent="31.6"></highClouds>
        <temperatureProbability unit="probabilitycode" value="2"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-0.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-23T06:00:00Z" to="2020-04-23T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="4.8"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="12.9"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-23T18:00:00Z" to="2020-04-23T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="9.7"></temperature>
        <windDirection id="dd" deg="26.9" name="NE"></windDirection>
        <windSpeed id="ff" mps="2.8" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="52.7"></humidity>
        <pressure id="pr" unit="hPa" value="1024.2"></pressure>
        <cloudiness id="NN" percent="51.6"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="1.2"></mediumClouds>
        <highClouds id="HIGH" percent="1.6"></highClouds>
        <temperatureProbability unit="probabilitycode" value="2"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="0.4"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-23T12:00:00Z" to="2020-04-23T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="9.7"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="14.0"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-24T00:00:00Z" to="2020-04-24T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.7"></temperature>
        <windDirection id="dd" deg="33.7" name="NE"></windDirection>
        <windSpeed id="ff" mps="1.7" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="84.5"></humidity>
        <pressure id="pr" unit="hPa" value="1025.4"></pressure>
        <cloudiness id="NN" percent="1.6"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="2"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-1.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-23T18:00:00Z" to="2020-04-24T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.7"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="7.9"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-24T06:00:00Z" to="2020-04-24T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="3.1"></temperature>
        <windDirection id="dd" deg="338.5" name="N"></windDirection>
        <windSpeed id="ff" mps="1.3" beaufort="1" name="Flau vind"></windSpeed>
        <humidity unit="percent" value="72.7"></humidity>
        <pressure id="pr" unit="hPa" value="1023.4"></pressure>
        <cloudiness id="NN" percent="41.4"></cloudiness>
        <lowClouds id="LOW" percent="0.8"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-1.6"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-24T00:00:00Z" to="2020-04-24T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.4"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="3.1"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-24T12:00:00Z" to="2020-04-24T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="11.3"></temperature>
        <windDirection id="dd" deg="199.8" name="S"></windDirection>
        <windSpeed id="ff" mps="2.7" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="38.0"></humidity>
        <pressure id="pr" unit="hPa" value="1019.9"></pressure>
        <cloudiness id="NN" percent="75.8"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="39.1"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="2"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-2.8"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-24T06:00:00Z" to="2020-04-24T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="3.3"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="11.3"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-24T18:00:00Z" to="2020-04-24T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="9.2"></temperature>
        <windDirection id="dd" deg="350.2" name="N"></windDirection>
        <windSpeed id="ff" mps="2.8" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="52.0"></humidity>
        <pressure id="pr" unit="hPa" value="1020.0"></pressure>
        <cloudiness id="NN" percent="60.9"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="15.6"></mediumClouds>
        <highClouds id="HIGH" percent="3.1"></highClouds>
        <temperatureProbability unit="probabilitycode" value="2"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-0.4"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-24T12:00:00Z" to="2020-04-24T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="9.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="13.2"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-25T00:00:00Z" to="2020-04-25T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="0.6"></temperature>
        <windDirection id="dd" deg="338.7" name="N"></windDirection>
        <windSpeed id="ff" mps="1.7" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="82.3"></humidity>
        <pressure id="pr" unit="hPa" value="1023.5"></pressure>
        <cloudiness id="NN" percent="5.1"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="2"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-2.3"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-24T18:00:00Z" to="2020-04-25T00:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.5"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="7.9"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-25T06:00:00Z" to="2020-04-25T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="2.9"></temperature>
        <windDirection id="dd" deg="6.3" name="N"></windDirection>
        <windSpeed id="ff" mps="1.8" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="71.7"></humidity>
        <pressure id="pr" unit="hPa" value="1019.5"></pressure>
        <cloudiness id="NN" percent="52.7"></cloudiness>
        <lowClouds id="LOW" percent="4.7"></lowClouds>
        <mediumClouds id="MEDIUM" percent="10.9"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="1"></temperatureProbability>
        <windProbability unit="probabilitycode" value="0"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-1.9"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-25T00:00:00Z" to="2020-04-25T06:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="0.1"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="2.9"></maxTemperature>
        <symbol id="LightCloud" number="2"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-25T12:00:00Z" to="2020-04-25T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="8.8"></temperature>
        <windDirection id="dd" deg="355.0" name="N"></windDirection>
        <windSpeed id="ff" mps="3.0" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="42.0"></humidity>
        <pressure id="pr" unit="hPa" value="1017.1"></pressure>
        <cloudiness id="NN" percent="88.3"></cloudiness>
        <lowClouds id="LOW" percent="24.2"></lowClouds>
        <mediumClouds id="MEDIUM" percent="60.2"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="2"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-3.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-25T06:00:00Z" to="2020-04-25T12:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="3.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="8.8"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-25T18:00:00Z" to="2020-04-25T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <temperature id="TTT" unit="celsius" value="8.2"></temperature>
        <windDirection id="dd" deg="333.2" name="NW"></windDirection>
        <windSpeed id="ff" mps="2.3" beaufort="2" name="Svak vind"></windSpeed>
        <humidity unit="percent" value="50.8"></humidity>
        <pressure id="pr" unit="hPa" value="1019.6"></pressure>
        <cloudiness id="NN" percent="0.8"></cloudiness>
        <lowClouds id="LOW" percent="0.0"></lowClouds>
        <mediumClouds id="MEDIUM" percent="0.0"></mediumClouds>
        <highClouds id="HIGH" percent="0.0"></highClouds>
        <temperatureProbability unit="probabilitycode" value="2"></temperatureProbability>
        <windProbability unit="probabilitycode" value="1"></windProbability>
        <dewpointTemperature id="TD" unit="celsius" value="-1.7"></dewpointTemperature>
      </location>
    </time>
    <time datatype="forecast" from="2020-04-25T12:00:00Z" to="2020-04-25T18:00:00Z">
      <location altitude="136" latitude="60.79119" longitude="11.15422">
        <precipitation unit="mm" value="0.0" minvalue="0.0" maxvalue="0.0"></precipitation>
        <minTemperature id="TTT" unit="celsius" value="8.2"></minTemperature>
        <maxTemperature id="TTT" unit="celsius" value="11.9"></maxTemperature>
        <symbol id="PartlyCloud" number="3"></symbol>
        <symbolProbability unit="probabilitycode" value="1"></symbolProbability>
      </location>
    </time>
  </product>
</weatherdata>
    """
}