package Application;

public class TemperatureConversion {

    public double celsiusToFahrenheit(double celsius) {
        double roundedCelsius = Math.round(celsius * 100.00) / 100.00; //Rounds the temperature to 2dp
        return (roundedCelsius * 9.0 / 5) + 32; //Conversion from Celsius to Fahrenheit
    }

}
