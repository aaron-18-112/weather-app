package MMU;

import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public static void displayMenu(List<CityWeather> cities, CityWeather currentCityWeather) {

        //Initialising a menu scanner
        Scanner menuSc = new Scanner(System.in);
        boolean runMenu = true;

        while (runMenu) {

            System.out.println();
            System.out.println("1. Convert the temperature to Fahrenheit");
            System.out.println("2. See weather data for another city");
            System.out.println("3. Exit");
            int input = menuSc.nextInt();

            switch (input) {
                case 1: //Temperature Conversion Method
                    double fahrenheitTemp = TemperatureConversion.celsiusToFahrenheit(currentCityWeather.getTemperature());
                    double roundedFahrenheitTemp = Math.round(fahrenheitTemp * 100.0) / 100.0;
                    System.out.println();
                    System.out.println("Temperature in Fahrenheit: " + roundedFahrenheitTemp + "F");
                    System.out.println();
                    break;

                case 2: //Another Menu to choose Weather Data from another city - Build a WeatherMenuClass
                    currentCityWeather = WeatherMenu.displayWeatherMenu(cities);
                    break;

                case 3: //Build Exit
                    System.out.println("Exiting Program");
                    runMenu = false;
                    break;

                default:
                    System.out.println("Invalid input, Try Again");
                    break;

            }
        }

        System.out.println("Goodbye!");
        menuSc.close();

    }
}
