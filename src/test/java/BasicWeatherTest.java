import Application.BasicWeather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicWeatherTest {

    private BasicWeather basicWeather;

    @BeforeEach
    public void setUp() {
        basicWeather = new BasicWeather("TestCity", "Clear skies tomorrow");
    }

    // Test the BasicWeather constructor
    @Test
    public void testBasicWeatherConstructor() {
        assertEquals("TestCity", basicWeather.getCityName());
        assertEquals("Clear skies tomorrow", basicWeather.getForecast());
    }

    // Test the getCityName method
    @Test
    public void testGetCityName() {
        assertEquals("TestCity", basicWeather.getCityName());
    }

    // Test the getForecast method
    @Test
    public void testGetForecast() {
        assertEquals("Clear skies tomorrow", basicWeather.getForecast());
    }

}
