package Application;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {

    //Data needs to be readily available so is statically loaded
    public static List<CityWeather> cityWeatherList = new ArrayList<>();

    //Weather data for 50 major cities, which is passed into other classes
    static {
        cityWeatherList.add(new CityWeather("Manchester", 7.7, 85, "Foggy", "Chilly and foggy tomorrow"));
        cityWeatherList.add(new CityWeather("Dubai", 35.5, 20, "Sunny", "Hot and dry conditions tomorrow"));
        cityWeatherList.add(new CityWeather("Mumbai", 30.2, 80, "Humid", "Chance of showers tomorrow"));
        cityWeatherList.add(new CityWeather("Cairo", 28.3, 40, "Sunny", "Clear skies tomorrow"));
        cityWeatherList.add(new CityWeather("Cape Town", 18.7, 70, "Windy", "Breezy conditions tomorrow"));
        cityWeatherList.add(new CityWeather("Beijing", 16.0, 60, "Partly Cloudy", "Mild conditions tomorrow"));
        cityWeatherList.add(new CityWeather("Toronto", 10.5, 75, "Rainy", "Showers expected tomorrow"));
        cityWeatherList.add(new CityWeather("Madrid", 20.8, 55, "Sunny", "Warm and clear tomorrow"));
        cityWeatherList.add(new CityWeather("Lisbon", 22.0, 65, "Partly Cloudy", "Mild and sunny tomorrow"));
        cityWeatherList.add(new CityWeather("Seoul", 17.2, 80, "Rainy", "Rain expected tomorrow"));

        cityWeatherList.add(new CityWeather("Bangkok", 33.0, 90, "Humid", "Thunderstorms likely tomorrow"));
        cityWeatherList.add(new CityWeather("Rio de Janeiro", 27.0, 70, "Sunny", "Clear skies tomorrow"));
        cityWeatherList.add(new CityWeather("Buenos Aires", 19.4, 60, "Windy", "Breezy conditions tomorrow"));
        cityWeatherList.add(new CityWeather("Singapore", 29.3, 85, "Humid", "Showers expected tomorrow"));
        cityWeatherList.add(new CityWeather("Kuala Lumpur", 30.5, 90, "Rainy", "Thunderstorms likely tomorrow"));
        cityWeatherList.add(new CityWeather("Jakarta", 31.2, 80, "Cloudy", "Possible rain tomorrow"));
        cityWeatherList.add(new CityWeather("Istanbul", 16.7, 65, "Partly Cloudy", "Sunny spells tomorrow"));
        cityWeatherList.add(new CityWeather("Athens", 21.8, 50, "Sunny", "Clear and warm tomorrow"));
        cityWeatherList.add(new CityWeather("Stockholm", 9.5, 60, "Rainy", "Showers expected tomorrow"));
        cityWeatherList.add(new CityWeather("Edinburgh", 8.3, 85, "Foggy", "Misty conditions tomorrow"));

        cityWeatherList.add(new CityWeather("Oslo", 7.8, 80, "Cloudy", "Cool conditions tomorrow"));
        cityWeatherList.add(new CityWeather("Helsinki", 6.0, 75, "Rainy", "Drizzles expected tomorrow"));
        cityWeatherList.add(new CityWeather("Prague", 12.7, 65, "Partly Cloudy", "Sunny spells tomorrow"));
        cityWeatherList.add(new CityWeather("Vienna", 14.9, 60, "Windy", "Breezy tomorrow"));
        cityWeatherList.add(new CityWeather("Zurich", 11.5, 70, "Rainy", "Showers expected tomorrow"));
        cityWeatherList.add(new CityWeather("Brussels", 10.2, 75, "Cloudy", "Chance of drizzle tomorrow"));
        cityWeatherList.add(new CityWeather("Warsaw", 8.9, 80, "Foggy", "Cold and misty tomorrow"));
        cityWeatherList.add(new CityWeather("London", 9.1, 85, "Cloudy", "Foggy tomorrow"));
        cityWeatherList.add(new CityWeather("Los Angeles", 23.2, 50, "Sunny", "Clear skies tomorrow"));
        cityWeatherList.add(new CityWeather("Amsterdam", 11.0, 70, "Partly Cloudy", "Sunny intervals tomorrow"));

        cityWeatherList.add(new CityWeather("Hanoi", 24.3, 75, "Cloudy", "Rain expected tomorrow"));
        cityWeatherList.add(new CityWeather("Ho Chi Minh City", 28.4, 85, "Humid", "Thunderstorms tomorrow"));
        cityWeatherList.add(new CityWeather("Lima", 18.6, 60, "Cloudy", "Cool and overcast tomorrow"));
        cityWeatherList.add(new CityWeather("Santiago", 19.0, 50, "Sunny", "Clear and warm tomorrow"));
        cityWeatherList.add(new CityWeather("Caracas", 27.5, 75, "Partly Cloudy", "Humid conditions tomorrow"));
        cityWeatherList.add(new CityWeather("Bogota", 15.4, 65, "Cloudy", "Cool conditions tomorrow"));
        cityWeatherList.add(new CityWeather("Addis Ababa", 20.2, 70, "Rainy", "Light rain tomorrow"));
        cityWeatherList.add(new CityWeather("Nairobi", 22.0, 60, "Partly Cloudy", "Sunny spells tomorrow"));
        cityWeatherList.add(new CityWeather("Casablanca", 24.1, 50, "Sunny", "Warm and sunny tomorrow"));
        cityWeatherList.add(new CityWeather("Doha", 37.0, 30, "Sunny", "Hot and dry tomorrow"));

        cityWeatherList.add(new CityWeather("Kuwait City", 36.2, 25, "Sunny", "Clear skies tomorrow"));
        cityWeatherList.add(new CityWeather("Muscat", 33.0, 35, "Sunny", "Warm and clear tomorrow"));
        cityWeatherList.add(new CityWeather("Manama", 34.5, 30, "Sunny", "Hot conditions tomorrow"));
        cityWeatherList.add(new CityWeather("Tehran", 21.8, 50, "Partly Cloudy", "Mild and breezy tomorrow"));
        cityWeatherList.add(new CityWeather("Karachi", 29.6, 80, "Humid", "Chance of rain tomorrow"));
        cityWeatherList.add(new CityWeather("Colombo", 27.8, 85, "Rainy", "Thunderstorms expected tomorrow"));
        cityWeatherList.add(new CityWeather("Lagos", 31.2, 70, "Sunny", "Hot and clear tomorrow"));
        cityWeatherList.add(new CityWeather("Accra", 28.4, 65, "Partly Cloudy", "Warm conditions tomorrow"));
        cityWeatherList.add(new CityWeather("Johannesburg", 18.1, 55, "Windy", "Breezy tomorrow"));
        cityWeatherList.add(new CityWeather("Melbourne", 15.2, 65, "Cloudy", "Cool and cloudy tomorrow"));

    }

}

