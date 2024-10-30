package MMU;

import java.util.Scanner;

public class MainMenu {

    public static void displayMenu(CityWeather cityWeather) {

        //Initialising a menu scanner
        Scanner menuSc = new Scanner(System.in);

        System.out.println("1. Convert the temperature to Fahrenheit");
        System.out.println("2. See weather data for another city");
        System.out.println("3. Exit");
        int input = menuSc.nextInt();

        switch (input) {
            case 1: //Temperature Conversion Method
                double fahrenheitTemp = TemperatureConversion.celsiusToFahrenheit(cityWeather.getTemperature());
                double roundedFahrenheitTemp = Math.round(fahrenheitTemp * 100.0) / 100.0;
                System.out.println("Temperature in Fahrenheit: " + roundedFahrenheitTemp + "F");
                break;

            case 2: //Another Menu to choose Weather Data from another city - Build a WeatherMenuClass
                System.out.println("See weather data for another city");
                break;

            case 3: //Build Exit
                System.out.println("Exit Program");
                break;

            default:
                System.out.println("Invalid input");
                break;

        }
    }
}
