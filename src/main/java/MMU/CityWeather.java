package MMU;

//CityWeather class models basic weather for specific cities including:
//city name, temperature, humidity, weather descriptions and forecast

public class CityWeather {

    //Private instance variables which can be accessed within the CityWeather class
    private final String cityName; //Name of the city
    private final double temperature; //Temperature in Celsius
    private final int humidity; //Humidity as a percentage
    private final String description; //Description of current weather conditions
    private final String forecast; //Forecast of the weather tomorrow

    //Constructor - Initialises the CityWeather object with specified weather details
    public CityWeather(String cityName, double temperature, int humidity, String description, String forecast) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.description = description;
        this.forecast = forecast;
    }

//Getters provide access to private variables of the CityWeather class.
//They allow other classes to retrieve these values while keeping the variables themselves private - Security

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

    //Displays weather data in a readable format
    //Implemented printf in order to align text
    //%s inserts a string, %.2f inserts a double (2dp), %d inserts an integer
    //%% inserts a literal %, %n inserts a new line after the text, \t aligns all the :

    public void displayWeather() {
        System.out.printf("City Name\t: %s%n", cityName);
        System.out.printf("Temperature\t: %.2fC%n", temperature);
        System.out.printf("Humidity\t: %d%%%n", humidity);
        System.out.printf("Description\t: %s%n", description);
        System.out.printf("Forecast\t: %s%n", forecast);
    }
}
