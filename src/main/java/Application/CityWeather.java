package Application;

//CityWeather class models basic weather for specific cities including:
//Extends BasicWeather class which contains information about the city name and forecast

public class CityWeather extends BasicWeather {

    //Private instance variables which can be accessed within the CityWeather class
    //Final variables are read-only
    private final double temperature; //Temperature in Celsius
    private final int humidity; //Humidity as a percentage
    private final String description; //Description of current weather conditions

    //Constructor - Initialises the CityWeather object with specified weather details
    public CityWeather(String cityName, double temperature, int humidity, String description, String forecast) {
        super(cityName, forecast);
        this.temperature = temperature;
        this.humidity = humidity;
        this.description = description;
    }

//Getters provide access to private variables of the CityWeather class.
//They allow other classes to retrieve these values while keeping the variables themselves private - Security
//I have also made getters for humidity, description, and forecast, in case needed in the future

    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getDescription() {
        return description;
    }

    //Displays weather data in a readable format
    //Implemented printf in order to align text
    //%s inserts a string, %.2f inserts a double (2dp), %d inserts an integer
    //%% inserts a literal %, %n inserts a new line after the text, \t aligns all the :

    public void displayWeather() {
        System.out.printf("City Name\t: %s%n", getCityName());
        System.out.printf("Temperature\t: %.2fC%n", temperature);
        System.out.printf("Humidity\t: %d%%%n", humidity);
        System.out.printf("Description\t: %s%n", description);
        System.out.printf("Forecast\t: %s%n", getForecast());
        this.displayWeatherGraphics();
    }

    public void displayBasicWeather() {
        System.out.printf("City Name\t: %s%n", getCityName());
        System.out.printf("Forecast\t: %s%n", getForecast());
    }

    public void displayWeatherGraphics() {
        switch (getDescription().toLowerCase()) {
            case "sunny":
                System.out.println("    \\   /");
                System.out.println("     .-.");
                System.out.println(" -- (   ) --");
                System.out.println("     `-`");
                System.out.println("    /   \\");
                break;

            case "cloudy":
            case "partly cloudy":
                System.out.println("     .--.");
                System.out.println("  .-(    ).");
                System.out.println(" (___.__)__)");
                break;

            case "rainy":
                System.out.println("     .--.");
                System.out.println("  .-(    ).");
                System.out.println(" (___.__)__)");
                System.out.println("  ' ' ' ' '");
                System.out.println(" ' ' ' ' '");
                System.out.println("  ' ' ' ' '");
                break;

            case "foggy":
                System.out.println(" _ - _ - _ - ");
                System.out.println("  _ - _ - _  ");
                System.out.println(" _ - _ - _ - ");
                break;

            case "windy":
                System.out.println("      ~ ~ ~ ~ ~");
                System.out.println("  ~ ~ ~ ~ ~ ~ ~");
                System.out.println("~ ~ ~ ~ ~ ~ ~ ~");
                break;

            case "snowy":
                System.out.println("    *    *  *  *");
                System.out.println("  *  *  *  *  *");
                System.out.println("    *  *  *  *");
                System.out.println("  *  *  *  *  *");
                break;

            case "humid":
                System.out.println("  ~ ~ ~ ~ ~");
                System.out.println(" ~         ~");
                System.out.println("~           ~");
                System.out.println(" ~         ~");
                System.out.println("  ~ ~ ~ ~ ~");
                break;

            default:
                System.out.println("No graphics available for this weather.");
                break;
        }
    }

}
