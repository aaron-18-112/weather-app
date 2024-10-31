package MMU;

import java.util.List;
import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<CityWeather> cities = WeatherData.cityWeatherList;
        CityWeather currentCityWeather = cities.get(0);

        System.out.println("Hi! We have located your nearest major city as Manchester... \n" +
                "This is the data we have found:");

        System.out.println();
        currentCityWeather.displayWeather();
        System.out.println("Press enter to continue");
        sc.nextLine();

        MainMenu.displayMenu(cities, currentCityWeather);

    }

}