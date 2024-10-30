package MMU;

import java.util.List;

public class WeatherApp {

    public static void main(String[] args) {

        List<CityWeather> cities = WeatherData.cityWeatherList;
        CityWeather currentCityWeather = cities.get(0);

        System.out.println("Hi! We have located your nearest major city as Manchester... \n" +
                "This is the data we have found:");

        System.out.println();
        currentCityWeather.displayWeather();

        MainMenu.displayMenu(cities, currentCityWeather);

    }

}