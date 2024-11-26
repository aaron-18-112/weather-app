import MMU.CityWeather;
import MMU.TemperatureConversion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CItyWeatherTest {

    // Test the creation of a CityWeather object with valid data
    @Test
    public void testCityWeather() {
        CityWeather cityWeather = new CityWeather("TestCity", 25.0, 50, "Sunny", "Clear skies tomorrow");
        assertEquals("TestCity", cityWeather.getCityName());
        assertEquals(25.0, cityWeather.getTemperature());
        assertEquals(50, cityWeather.getHumidity());
        assertEquals("Sunny", cityWeather.getDescription());
        assertEquals("Clear skies tomorrow", cityWeather.getForecast());
    }

    // Test the temperature conversion from Celsius to Fahrenheit
    @Test
    public void testTemperatureConversion() {
        TemperatureConversion tempConv = new TemperatureConversion();
        assertEquals(77.0, tempConv.celsiusToFahrenheit(25.0), 0.01);
    }

}
