package pl.poznan.put.content.units;

import pl.poznan.put.content.Unit;

public class Temperature implements Unit {
    private double celsius;
    private double fahrenheit;
    private double kelvin;
    public Temperature(int choice, float value) {
        switch (choice) {
            case 1 -> celsius = value;
            case 2 -> fahrenheit = value;
            case 3 -> kelvin = value;
        }
    }
    @Override
    public void convert(int choice, float value) {
        switch (choice) {
            case 1 -> celsius = value;
            case 3 -> celsius = value - 273.15;
            case 2 -> celsius = (value - 32) / 1.8;
        }

            fahrenheit = (celsius * 1.8) + 32;
            kelvin = celsius + 273.15;
            if (kelvin < 0) throw new IllegalArgumentException("Temperature cannot be that low");
    }
    @Override
    public void show(int choice) {
        System.out.println("\nConverted Units");
        switch (choice) {
            case 1 ->  {
                System.out.println("Fahrenheit: " + fahrenheit);
                System.out.println("Kelvin: " + kelvin + "\n");
            }
            case 2 -> {
                System.out.println("Celsius: " + celsius);
                System.out.println("Kelvin: " + kelvin + "\n");
            }
            case 3 -> {
                System.out.println("Celsius: " + celsius);
                System.out.println("Fahrenheit: " + fahrenheit + "\n");
            }
        }
    }
}
