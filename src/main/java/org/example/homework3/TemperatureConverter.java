package org.example.homework3;

public class TemperatureConverter {
    public static void main(String[] args) {
        float celsiusDegrees = 36.6F;

        float fahrenheitDegrees = (celsiusDegrees * 9/5) + 32;
        float kelvinDegrees = (float) (celsiusDegrees + 273.15);

        System.out.println("Degrees Celsius in Fahrenheit: " + fahrenheitDegrees);

        System.out.println("Degrees Celsius in Kelvin: " + kelvinDegrees);
    }
}