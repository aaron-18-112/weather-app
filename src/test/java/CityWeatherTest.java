import Application.CityWeather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CityWeatherTest {

    private CityWeather cityWeather;

    // Set up a CityWeather object before each test
    @BeforeEach
    public void setUp() {
        cityWeather = new CityWeather("TestCity", 25.0, 50, "Sunny", "Clear skies tomorrow");
    }

    // Test the creation of a CityWeather object with valid data
    @Test
    public void testCityWeather() {
        assertEquals("TestCity", cityWeather.getCityName());
        assertEquals(25.0, cityWeather.getTemperature());
        assertEquals(50, cityWeather.getHumidity());
        assertEquals("Sunny", cityWeather.getDescription());
        assertEquals("Clear skies tomorrow", cityWeather.getForecast());
    }

    // Test getCityName method - Inherited, so making sure that it can be accessed correctly
    @Test
    public void testGetCityName() {
        assertEquals("TestCity", cityWeather.getCityName());
    }

    // Test getTemperature method
    @Test
    public void testGetTemperature() {
        assertEquals(25.0, cityWeather.getTemperature());
    }

    // Test getHumidity method
    @Test
    public void testGetHumidity() {
        assertEquals(50, cityWeather.getHumidity());
    }

    // Test getDescription method
    @Test
    public void testGetDescription() {
        assertEquals("Sunny", cityWeather.getDescription());
    }

    // Test getForecast method - Inherited, so making sure that it can be accessed correctly
    @Test
    public void testGetForecast() {
        assertEquals("Clear skies tomorrow", cityWeather.getForecast());
    }

    // Test the displayWeather method - Checks the output is accurate
    @Test
    public void testDisplayWeather() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        cityWeather.displayWeather();

        String output = outContent.toString();
        assertTrue(output.contains("City Name\t: TestCity"));
        assertTrue(output.contains("Temperature\t: 25.00C"));
        assertTrue(output.contains("Humidity\t: 50%"));
        assertTrue(output.contains("Description\t: Sunny"));
        assertTrue(output.contains("Forecast\t: Clear skies tomorrow"));
        assertTrue(output.contains("    \\   /"));
        assertTrue(output.contains("     .-."));
        assertTrue(output.contains(" -- (   ) --"));
        assertTrue(output.contains("     `-`"));
        assertTrue(output.contains("    /   \\"));

        System.setOut(System.out);
    }

    // Test the displayBasicWeather method - Checks the output is accurate
    @Test
    public void testDisplayBasicWeather() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        cityWeather.displayBasicWeather();

        String output = outContent.toString();
        assertTrue(output.contains("City Name\t: TestCity"));
        assertTrue(output.contains("Forecast\t: Clear skies tomorrow"));

        System.setOut(System.out);
    }

}
