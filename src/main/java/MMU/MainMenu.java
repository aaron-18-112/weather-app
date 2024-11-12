package MMU;

import java.util.List;
import java.util.Scanner;

public class MainMenu {

    //Method to call the menu options
    //This method is a static as it needs to be called often
    private static void showMenuOptions() {
        System.out.println("Would you like to:");
        System.out.println("1. Convert the temperature to Fahrenheit");
        System.out.println("2. See weather data for another city");
        System.out.println("3. Exit");
    }

    //Method to prompt users to tap enter
    //This method is a static as it needs to be called often
    private static void promptEnterToContinue(Scanner scanner) {
        System.out.println("Press enter to continue");
        scanner.nextLine();
    }

    public void displayMenu(List<CityWeather> cities, CityWeather currentCityWeather) {

        //Initialising a menu scanner
        Scanner menuSc = new Scanner(System.in);
        boolean runMenu = true;
        //Will allow the menu to run until this is set false by selecting case 3 in the switch
        //Safer than running a white true loop

        while (runMenu) {

            showMenuOptions(); //Method to show options to avoid repetition
            int input = menuSc.nextInt(); //User Input
            menuSc.nextLine();

            switch (input) {
                case 1: //Temperature Conversion Method
                    TemperatureConversion temperatureConversion = new TemperatureConversion();
                    double fahrenheitTemp = temperatureConversion.celsiusToFahrenheit(currentCityWeather.getTemperature());
                    //Uses the temperature conversion method from the temperatureConversion object created
                    System.out.printf("Temperature in Fahrenheit: %.2fF\n", fahrenheitTemp);
                    //printf formats the decimal to 2.dp. \n adds a new line, and fahrenheitTemp is the value that is used in the format
                    promptEnterToContinue(menuSc); //Method that uses the same scanner, to prompt user input
                    break;

                case 2: //Another Menu to choose Weather Data from another city
                    WeatherMenu weatherMenu = new WeatherMenu();
                    currentCityWeather = weatherMenu.displayWeatherMenu(cities);
                    //Define currentCityWeather to use as context for other methods
                    //Calls displayWeatherMenu from the weatherMenu object
                    //cities variable (ArrayList) is being passed as an argument into displayWeatherMenu
                    promptEnterToContinue(menuSc);
                    break;

                case 3: //Build Exit
                    System.out.println("Exiting Program");
                    runMenu = false; //Sets boolean to false to exit the while loop
                    promptEnterToContinue(menuSc);
                    break;

                default: //Default case
                    System.out.println("Invalid input, Try Again");
                    break;

            }
        }

        System.out.println("Goodbye!");
        menuSc.close();

    }
}


