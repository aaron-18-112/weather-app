package MMU;

public class TemperatureConversion {

    public static double celsiusToFahrenheit(double celsius) {
        double roundedCelsius = Math.round(celsius * 100.00) / 100.00;
        return (roundedCelsius * 9.0 / 5) + 32;
    }

}
