package MMU;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {

    //Data needs to be readily available so is statically loaded
    public static List<CityWeather> cityWeatherList = new ArrayList<>();

    //Weather data for major cities, which is passed into other classes
    static {
        cityWeatherList.add(new CityWeather("Manchester", 12.5, 80, "Cloudy", "Chance of rain tomorrow"));
        cityWeatherList.add(new CityWeather("New York", 22.1, 60, "Sunny", "Clear skies tomorrow"));
        cityWeatherList.add(new CityWeather("Paris", 15.3, 75, "Partly Cloudy", "Sunny tomorrow"));
        cityWeatherList.add(new CityWeather("Tokyo", 19.8, 70, "Rainy", "Rain expected tomorrow"));
    }

}

