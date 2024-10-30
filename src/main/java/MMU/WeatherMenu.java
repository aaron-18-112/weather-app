package MMU;

import java.util.List;
import java.util.Scanner;

public class WeatherMenu {

    // By returning CityWeather object it can be returned which can be used by the calling code
    public static CityWeather displayWeatherMenu(List<CityWeather> cities) {

        Scanner weatherMenuSc = new Scanner(System.in);

        System.out.println("Which city would you like to see weather data for?");
        String cityName = weatherMenuSc.nextLine();

       //Using an if-else statement for scalability of data

        for (CityWeather cityWeather : cities) {
            if (cityWeather.getCityName().equalsIgnoreCase(cityName)) {
                cityWeather.displayWeather();
                return cityWeather;
            }
        }

        System.out.println("Invalid city name, Please try again.");
        return displayWeatherMenu(cities);
    }
}
