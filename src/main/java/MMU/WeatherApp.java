package MMU;

import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {

        CityWeather londonWeather = new CityWeather("London", 12.5, 80, "Cloudy", "Chance of rain tomorrow");
        CityWeather newYorkWeather = new CityWeather("New York", 22.1, 60, "Sunny", "Clear skies tomorrow");
        CityWeather parisWeather = new CityWeather("Paris", 15.3, 75, "Partly Cloudy", "Sunny tomorrow");
        CityWeather tokyoWeather = new CityWeather("Tokyo", 19.8, 70, "Rainy", "Rain expected tomorrow");

        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to convert from Fahrenheit or Celsius?");
        String input = sc.nextLine();

        if (input.toLowerCase().contains("f")) {
            System.out.println("Convert from Fahrenheit to Celsius");
            System.out.println("Enter the value you would like to convert:");
            double fahrenheit = sc.nextDouble();
            System.out.println(TemperatureConversion.fahrenheitToCelsius(fahrenheit) + " Celsius");
        } else {
            System.out.println("Convert from Celsius to Fahrenheit");
            System.out.println("Enter the value you would like to convert:");
            double celsius = sc.nextDouble();
            System.out.println(TemperatureConversion.celsiusToFahrenheit(celsius) + " Fahrenheit");

        }
    }
}
