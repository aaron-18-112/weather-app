package MMU;

public class TemperatureConversion {

    private double fahrenheit;
    private double celsius;

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5) + 32;
    }
}
