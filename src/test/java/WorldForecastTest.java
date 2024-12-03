import Application.CityWeather;
import Application.WorldForecast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WorldForecastTest {

    private WorldForecast worldForecast;
    private List<CityWeather> cityWeathers;

    // Set up WorldForecast and CityWeather objects before each test
    @BeforeEach
    public void setUp() {
        cityWeathers = new ArrayList<>();
        cityWeathers.add(new CityWeather("City1", 20.0, 60, "Sunny", "Clear skies tomorrow"));
        cityWeathers.add(new CityWeather("City2", 15.0, 70, "Cloudy", "Overcast throughout the day"));
        worldForecast = new WorldForecast(cityWeathers);
    }

    // Test the displayWorldForecast method - Make sure it runs the for loop and shows data for each city
    @Test
    public void testDisplayWorldForecast() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        worldForecast.displayWorldForecast();

        String output = outContent.toString();
        assertTrue(output.contains("World Forecast:"));
        assertTrue(output.contains("City Name\t: City1"));
        assertTrue(output.contains("Forecast\t: Clear skies tomorrow"));
        assertTrue(output.contains("City Name\t: City2"));
        assertTrue(output.contains("Forecast\t: Overcast throughout the day"));

        System.setOut(System.out);
    }
}