package MMU;

import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {

        CityWeather manchesterWeather = new CityWeather("Manchester", 12.5, 80, "Cloudy", "Chance of rain tomorrow");
        CityWeather newYorkWeather = new CityWeather("New York", 22.1, 60, "Sunny", "Clear skies tomorrow");
        CityWeather parisWeather = new CityWeather("Paris", 15.3, 75, "Partly Cloudy", "Sunny tomorrow");
        CityWeather tokyoWeather = new CityWeather("Tokyo", 19.8, 70, "Rainy", "Rain expected tomorrow");

        Scanner sc = new Scanner(System.in);

        System.out.println("Hi! We have located your nearest major city as Manchester... \n" +
                "This is the data we have found:");

        System.out.println();
        manchesterWeather.displayWeather();
        System.out.println();

        MainMenu.displayMenu(manchesterWeather);

    }

}