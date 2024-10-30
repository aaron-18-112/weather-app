package MMU;

import java.util.Scanner;
import java.util.List;

public class MainMenu {

    public static void displayMenu(List<CityWeather> cities, CityWeather currentCityWeather) {

        //Initialising a menu scanner
        Scanner menuSc = new Scanner(System.in);

        System.out.println("1. Convert the temperature to Fahrenheit");
        System.out.println("2. See weather data for another city");
        System.out.println("3. Exit");
        int input = menuSc.nextInt();

        switch (input) {
            case 1: //Temperature Conversion Method
                double fahrenheitTemp = TemperatureConversion.celsiusToFahrenheit(currentCityWeather.getTemperature());
                double roundedFahrenheitTemp = Math.round(fahrenheitTemp * 100.0) / 100.0;
                System.out.println("Temperature in Fahrenheit: " + roundedFahrenheitTemp + "F");
                break;

            case 2: //Another Menu to choose Weather Data from another city - Build a WeatherMenuClass
                WeatherMenu.displayWeatherMenu(cities);
                return;

            case 3: //Build Exit - TODO
                System.out.println("Exiting Program");
                break;

            default: //Need to create a while loop - TODO
                System.out.println("Invalid input");
                break;

        }
    }
}
