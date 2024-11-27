package MMU;

import java.util.List;
import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Initialising scanner

        List<CityWeather> cities = WeatherData.cityWeatherList;
        CityWeather currentCityWeather = cities.get(0); //Displays weather data for Manchester

        System.out.println("""
                Hi! We have located your nearest major city as Manchester...
                This is the data we have found:
                """);

        //Used a text block in order to write multi-line strings without needing to concatenate
        // """ Encapsulates the text block

        currentCityWeather.displayWeather();
        //Displays the weather data for Manchester
        System.out.println("\nPress enter to continue");
        //Prompt to user & used \n notation in order to save writing out System.out.println()

        sc.nextLine();

        MainMenu mainMenu = new MainMenu();
        //Creating an instance/object of MainMenu

        mainMenu.displayMenu(cities, currentCityWeather);
        //Calling the displayMenu method from the mainMenu Object
    }

}