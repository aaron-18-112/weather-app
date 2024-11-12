package MMU;

import java.util.List;
import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Initialising scanner

        List<CityWeather> cities = WeatherData.cityWeatherList;
        CityWeather currentCityWeather = cities.get(0); //Displays weather data for Manchester

        System.out.println("Hi! We have located your nearest major city as Manchester... \n" +
                "This is the data we have found:");

        System.out.println();
        currentCityWeather.displayWeather();
        System.out.println("Press enter to continue"); //Prompt to user
        sc.nextLine();

        MainMenu mainMenu = new MainMenu();
        //Creating an instance/object of MainMenu to dynamically load in when needed
        mainMenu.displayMenu(cities, currentCityWeather);
        //Call the displayMenu method from my mainMenu object

    }

}