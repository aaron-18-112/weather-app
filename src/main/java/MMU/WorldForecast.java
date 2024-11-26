package MMU;

import java.util.List;

public class WorldForecast extends BasicWeather {

    private final List<CityWeather> cityWeathers;

    public WorldForecast(List<CityWeather> cityWeathers) {
        super("World Forecast", "Combined weather forecast for major cities");
        this.cityWeathers = cityWeathers;
    }

    public void displayWorldForecast() {
        System.out.println("\nWorld Forecast:\n");
        for (CityWeather cityWeather : cityWeathers) {
            cityWeather.displayBasicWeather();
            System.out.println();

        }
    }
}