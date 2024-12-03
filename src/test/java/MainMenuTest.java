import Application.CityWeather;
import Application.MainMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class MainMenuTest {

    private MainMenu mainMenu;
    private List<CityWeather> cities;
    private CityWeather cityWeather;

    // Set up MainMenu and CityWeather objects before each test
    @BeforeEach
    public void setUp() {
        mainMenu = new MainMenu();
        cities = new ArrayList<>();
        cityWeather = new CityWeather("TestCity", 25.0, 50, "Sunny", "Clear skies tomorrow");
        cities.add(cityWeather);
    }

    // Testing the menu shows the correct options
    @Test
    public void testShowMenuOptions() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MainMenu.showMenuOptions(false);

        String output = outContent.toString();
        assertTrue(output.contains("1. Convert the temperature to Fahrenheit"));
        assertTrue(output.contains("2. See weather data for another city"));
        assertTrue(output.contains("3. See the World Forecast"));
        assertTrue(output.contains("4. Exit"));

        System.setOut(System.out);
    }

    // Testing the menu shows the correct options after the world forecast is displayed - Shouldn't show option 1
    @Test
    public void testShowMenuOptionsAfterWorldForecastDisplayed() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MainMenu.showMenuOptions(true);

        String output = outContent.toString();
        assertFalse(output.contains("1. Convert the temperature to Fahrenheit"));
        assertTrue(output.contains("2. See weather data for another city"));
        assertTrue(output.contains("3. See the World Forecast"));
        assertTrue(output.contains("4. Exit"));

        System.setOut(System.out);
    }

    // Testing the temperature conversion method
    @Test
    public void testTemperatureConversion() {
        assertEquals(77.0, mainMenu.celsiusToFahrenheit(25.0), 0.01);
    }

    //Testing the displayWeatherMenu method
    @Test
    public void testDisplayWeatherMenu() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Scanner scanner = new Scanner("TestCity\n");

        CityWeather result = mainMenu.displayWeatherMenu(cities, scanner);

        String output = outContent.toString();
        assertTrue(output.contains("Which city would you like to see weather data for?"));
        assertTrue(output.contains("TestCity"));
        assertTrue(output.contains("25.0"));
        assertTrue(output.contains("50"));
        assertTrue(output.contains("Sunny"));
        assertTrue(output.contains("Clear skies tomorrow"));
        assertEquals("TestCity", result.getCityName());

        System.setOut(System.out);
    }

}
