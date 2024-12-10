package Application;

// BasicWeather class displays the city name and forecast

public class BasicWeather {

    private final String cityName;
    private final String forecast;

    // Constructor
    public BasicWeather(String cityName, String forecast) {
        this.cityName = cityName;
        this.forecast = forecast;
    }

    // Getters
    public String getCityName() {
        return cityName;
    }

    public String getForecast() {
        return forecast;
    }

}
