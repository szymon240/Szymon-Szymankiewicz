package pl.poznan.put.content.units;

import pl.poznan.put.content.Unit;

public class Speed implements Unit {
    private double mps;
    private double mph;
    private double kps;
    private double kph;

    public Speed(int choice, float value) {
        switch (choice) {
            case 1 -> mps = value;
            case 2 -> mph = value;
            case 3 -> kps = value;
            case 4 -> kph = value;
        }
    }
    @Override
    public void convert(int choice, float value){

        if (value < 0) throw new IllegalArgumentException("Speed cannot be negative");


        switch (choice) {
            case 1 -> mps = value;
            case 2 -> mps = value / 3600;
            case 3 -> mps = value * 1000;
            case 4 -> mps = value * 1000 / 3600;
        }
        mph = mps * 3600;
        kps = mps/1000 ;
        kph = mps *3600/1000 ;
    }

    @Override
    public void show(int choice) {
        System.out.println("\nConverted Units");
        switch (choice) {
            case 1 -> {
                System.out.println("1.Meters per hour: " + mph);
                System.out.println("2.Kilometers per second: " + kps);
                System.out.println("3.Kilometers per hour: " + kph + "\n");
            }
            case 2 -> {
                System.out.println("1.Meters per second: " + mps);
                System.out.println("2.Kilometers per second: " + kps);
                System.out.println("3.Kilometers per hour: " + kph + "\n");
            }
            case 3 -> {
                System.out.println("1.Meters per second: " + mps);
                System.out.println("2.Meters per hour: " + mph);
                System.out.println("3.Kilometers per hour: " + kph + "\n");
            }
            case 4 -> {
                System.out.println("1.Meters per second: " + mps);
                System.out.println("2.Meters per hour: " + mph);
                System.out.println("3.Kilometers per second: " + kps + "\n");
            }
        }
    }
}
