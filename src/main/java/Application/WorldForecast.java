package Application;

import java.util.List;

public class WorldForecast extends BasicWeather {

    private final List<CityWeather> worldForecastList;

    public WorldForecast(List<CityWeather> worldForecastList) {
        super("cityName", "forecast");
        this.worldForecastList = worldForecastList;
    }

    public void displayWorldForecast() {
        System.out.println("\nWorld Forecast:\n");
        for (CityWeather cityWeather : worldForecastList) {
            cityWeather.displayBasicWeather();
            System.out.println();

        }
    }
}