package MMU;

public class TemperatureConversion {

    private double fahrenheit;
    private double celsius;

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double roundedCelsius = Math.round(celsius * 100.00) / 100.00;
        return (roundedCelsius * 9.0 / 5) + 32;
    }
}
