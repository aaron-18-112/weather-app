package MMU;

public class BasicWeather {

    private final String cityName;
    private final String forecast;

    public BasicWeather(String cityName, String forecast) {
        this.cityName = cityName;
        this.forecast = forecast;
    }

    public String getCityName() {
        return cityName;
    }

    public String getForecast() {
        return forecast;
    }

}
