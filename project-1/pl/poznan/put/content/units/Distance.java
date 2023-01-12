package pl.poznan.put.content.units;

import pl.poznan.put.content.Unit;

public class Distance implements Unit {
    private double millimeter;
    private double centimeter;
    private double meter;
    private double kilometer;

    public Distance(int choice, float value) {
        switch (choice) {
            case 1 -> millimeter = value;
            case 2 -> centimeter = value;
            case 3 -> meter = value;
            case 4 -> kilometer = value;
        }
    }
    @Override
    public void convert(int choice, float value){

        if (value < 0) throw new IllegalArgumentException("Distance cannot be negative");

        int milli = 1;
        int centi = 10;
        int meters = 1000;
        int kilo = 1000000;

        switch (choice) {
            case 1 -> millimeter = value * milli;
            case 2 -> millimeter = value * centi;
            case 3 -> millimeter = value * meters;
            case 4 -> millimeter = value * kilo;
        }
        centimeter = millimeter/centi;
        meter = millimeter/meters;
        kilometer = millimeter/kilo;
    }

    @Override
    public void show(int choice) {
        System.out.println("\nConverted Units");
        switch (choice) {
            case 1 -> {
                System.out.println("Centimeter: " + centimeter);
                System.out.println("Meter: " + meter);
                System.out.println("Kilometer: " + kilometer + "\n");
            }
            case 2 -> {
                System.out.println("Millimeter: " + millimeter);
                System.out.println("Meter: " + meter);
                System.out.println("Kilometer: " + kilometer + "\n");
            }
            case 3 -> {
                System.out.println("Millimeter: " + millimeter);
                System.out.println("Centimeter: " + centimeter);
                System.out.println("Kilometer: " + kilometer + "\n");
            }
            case 4 -> {
                System.out.println("Millimeter: " + millimeter);
                System.out.println("Centimeter: " + centimeter);
                System.out.println("Meter: " + meter + "\n");
            }
        }
    }
}
