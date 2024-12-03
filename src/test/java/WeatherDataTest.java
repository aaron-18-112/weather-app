import Application.CityWeather;
import Application.WeatherData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherDataTest {

    // Test the initialisation of the city weather list - Gets the respective city weather objects, and checks accuracy
    @Test
    public void testCityWeatherListInitialization() {
        assertEquals(50, WeatherData.cityWeatherList.size());

        CityWeather manchester = WeatherData.cityWeatherList.get(0);
        assertEquals("Manchester", manchester.getCityName());
        assertEquals(7.7, manchester.getTemperature());
        assertEquals(85, manchester.getHumidity());
        assertEquals("Foggy", manchester.getDescription());
        assertEquals("Chilly and foggy tomorrow", manchester.getForecast());

        CityWeather dubai = WeatherData.cityWeatherList.get(1);
        assertEquals("Dubai", dubai.getCityName());
        assertEquals(35.5, dubai.getTemperature());
        assertEquals(20, dubai.getHumidity());
        assertEquals("Sunny", dubai.getDescription());
        assertEquals("Hot and dry conditions tomorrow", dubai.getForecast());

    }
}