package pl.poznan.put.content.units;

import pl.poznan.put.content.Unit;

public class Time implements Unit {
    private double millisecond;
    private double second;
    private double hour;
    private double day;
    private double month;
    private double year;
    public Time(int choice, float value) {
        switch (choice) {
            case 1 -> millisecond = value;
            case 2 -> second = value;
            case 3 -> hour = value;
            case 4 -> day = value;
            case 5 -> month = value;
            case 6 -> year = value;
        }
    }
    @Override
    public void convert(int choice, float value){

        if(value<0) throw new IllegalArgumentException("Time cannot be negative");

        switch (choice) {
            case 1 -> millisecond = value;
            case 2 -> millisecond = value * 1000;
            case 3 -> millisecond = value * 3600000;
            case 4 -> millisecond = value * 1000 * 24 * 3600;
            case 5 -> millisecond = value * 1000 * 24 * 3600 * 30;
            case 6 -> millisecond = value * 1000 * 24 * 3600 * 365;
        }

        second = millisecond/1000;
        hour = millisecond/3600000;
        day = millisecond/(1000*24*3600);
        month = day/30;
        year = month/12;
    }

    @Override
    public void show(int choice) {
        System.out.println("\nConverted Units");
        switch (choice) {
            case 1 -> {
                System.out.println("1.Second: " + second);
                System.out.println("2.Hour: " + hour);
                System.out.println("3.Day: " + day);
                System.out.println("4.Month: " + month);
                System.out.println("5.Year: " + year + "\n");
            }
            case 2 -> {
                System.out.println("1.Millisecond: " + millisecond);
                System.out.println("2.Hour: " + hour);
                System.out.println("3.Day: " + day);
                System.out.println("4.Month: " + month);
                System.out.println("5.Year: " + year + "\n");
            }
            case 3 -> {
                System.out.println("1.Millisecond: " + millisecond);
                System.out.println("2.Second: " + second);
                System.out.println("3.Day: " + day);
                System.out.println("4.Month: " + month);
                System.out.println("5.Year: " + year + "\n");
            }
            case 4 -> {
                System.out.println("1.Millisecond: " + millisecond);
                System.out.println("2.Second: " + second);
                System.out.println("3.Hour: " + hour);
                System.out.println("4.Month: " + month);
                System.out.println("5.Year: " + year + "\n");
            }
            case 5 -> {
                System.out.println("1.Millisecond: " + millisecond);
                System.out.println("2.Second: " + second);
                System.out.println("3.Hour: " + hour);
                System.out.println("4.Day: " + day);
                System.out.println("5.Year: " + year + "\n");
            }
            case 6 -> {
                System.out.println("1.Millisecond: " + millisecond);
                System.out.println("2.Second: " + second);
                System.out.println("3.Hour: " + hour);
                System.out.println("4.Day: " + day);
                System.out.println("5.Month: " + month + "\n");
            }
        }
    }
}
