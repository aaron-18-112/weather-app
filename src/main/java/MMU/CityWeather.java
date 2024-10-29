package MMU;

public class CityWeather {

    //Private instance variables which can be accessed within the CityWeather class
    private String cityName;
    private double temperature;
    private int humidity;
    private String description;
    private String forecast;

    //Constructor
    public CityWeather(String cityName, double temperature, int humidity, String description, String forecast) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.description = description;
        this.forecast = forecast;
    }


    public String getCityName() {
        return cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getDescription() {
        return description;
    }

    public String getForecast() {
        return forecast;
    }

    public void displayWeather() {
        System.out.println("City Name: " + cityName);
        System.out.println("Temperature: " + temperature + "C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Description: " + description);
        System.out.println("Forecast: " + forecast);
    }
}
