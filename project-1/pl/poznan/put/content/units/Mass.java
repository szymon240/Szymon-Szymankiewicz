package pl.poznan.put.content.units;

import pl.poznan.put.content.Unit;

public class Mass implements Unit {
    private double milligram;
    private double gram;
    private double decagram;
    private double kilogram;
    private  double ton;

    public Mass(int choice, float value) {
        switch (choice) {
            case 1 -> milligram = value;
            case 2 -> gram = value;
            case 3 -> decagram = value;
            case 4 -> kilogram = value;
            case 5 -> ton = value;
        }
    }
    @Override
    public void convert(int choice, float value){

        if (value < 0) throw new IllegalArgumentException("Mass cannot be negative");

        int milli = 1;
        int grams = 1000;
        int deca = 10000;
        int kilo = 1000000;
        int tons = 1000000000;
        switch (choice) {
            case 1 -> milligram = value * milli;
            case 2 -> milligram = value * grams;
            case 3 -> milligram = value * deca;
            case 4 -> milligram = value * kilo;
            case 5 -> milligram = value * tons;
        }

        gram = milligram/grams;
        decagram = milligram/deca;
        kilogram = milligram/kilo;
        ton = milligram/tons;
    }
    @Override
    public void show(int choice){
        System.out.println("\nConverted Units");
        switch (choice) {
            case 1 -> {
                System.out.println("Gram: " + gram);
                System.out.println("Decagram: " + decagram);
                System.out.println("Kilogram: " + kilogram);
                System.out.println("Ton: " + ton + "\n");
            }
            case 2 -> {
                System.out.println("Milligram: " + milligram);
                System.out.println("Decagram: " + decagram);
                System.out.println("Kilogram: " + kilogram);
                System.out.println("Ton: " + ton + "\n");
            }
            case 3 -> {
                System.out.println("Milligram: " + milligram);
                System.out.println("Gram: " + gram);
                System.out.println("Kilogram: " + kilogram);
                System.out.println("Ton: " + ton);
            }
            case 4 -> {
                System.out.println("Milligram: " + milligram);
                System.out.println("Gram: " + gram);
                System.out.println("Decagram: " + decagram);
                System.out.println("Ton: " + ton + "\n");
            }
            case 5 -> {
                System.out.println("Milligram: " + milligram);
                System.out.println("Gram: " + gram);
                System.out.println("Decagram: " + decagram);
                System.out.println("Kilogram: " + kilogram + "\n");
            }
        }
    }
}
