package MMU;

import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public static void displayMenu(List<CityWeather> cities, CityWeather currentCityWeather) {

        //Initialising a menu scanner
        Scanner menuSc = new Scanner(System.in);
        boolean runMenu = true;

        while (runMenu) {

            showMenuOptions();
            int input = menuSc.nextInt();
            menuSc.nextLine();

            switch (input) {
                case 1: //Temperature Conversion Method
                    double fahrenheitTemp = TemperatureConversion.celsiusToFahrenheit(currentCityWeather.getTemperature());
                    System.out.printf("Temperature in Fahrenheit: %.2fF\n", fahrenheitTemp);
                    //printf formats the decimal to 2.dp. \n adds a new line, and fahrenheitTemp is the value that is used in the format
                    promptEnterToContinue(menuSc);
                    break;

                case 2: //Another Menu to choose Weather Data from another city - Build a WeatherMenuClass
                    currentCityWeather = WeatherMenu.displayWeatherMenu(cities);
                    promptEnterToContinue(menuSc);
                    break;

                case 3: //Build Exit
                    System.out.println("Exiting Program");
                    runMenu = false;
                    promptEnterToContinue(menuSc);
                    break;

                default:
                    System.out.println("Invalid input, Try Again");
                    break;

            }
        }

        System.out.println("Goodbye!");
        menuSc.close();

    }
    private static void showMenuOptions () {
        System.out.println("Would you like to:");
        System.out.println("1. Convert the temperature to Fahrenheit");
        System.out.println("2. See weather data for another city");
        System.out.println("3. Exit");
    }

    private static void promptEnterToContinue (Scanner scanner) {
        System.out.println("Press enter to continue");
        scanner.nextLine();
    }
}


