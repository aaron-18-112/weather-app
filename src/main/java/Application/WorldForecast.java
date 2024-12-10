package Application;

import java.util.List;

// WorldForecast class models basic weather for multiple cities

public class WorldForecast extends BasicWeather {

    // Initialises the WorldForecast object with a list of CityWeather objects
    private final List<CityWeather> worldForecastList;


    // Constructor
    public WorldForecast(List<CityWeather> worldForecastList) {
        super("cityName", "forecast");
        this.worldForecastList = worldForecastList;
    }

    // Displays the weather data for all cities in the world forecast, using a for loop to iterate through the list
    public void displayWorldForecast() {
        System.out.println("\nWorld Forecast:\n");
        for (CityWeather cityWeather : worldForecastList) {
            cityWeather.displayBasicWeather();
            System.out.println();

        }
    }
}