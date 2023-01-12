package pl.poznan.put.content;

import pl.poznan.put.content.units.*;

import java.util.Scanner;

public class Menu {
    public static void menuTemp() {
        Scanner scannerTemp = new Scanner(System.in);
        Scanner scannerValueTemp = new Scanner(System.in);
        scanTemp(scannerTemp, scannerValueTemp);
    }

    private static void scanTemp(Scanner scannerTemp, Scanner scannerValueTemp) {

        while(true){

            System.out.println("Chose a unit to convert: ");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("Enter your choice: ");

            int choiceTemp = scannerTemp.nextInt();

            if((choiceTemp<4) && (choiceTemp>0)) {
                System.out.println("Insert value to convert: ");
                float valueTemp = scannerValueTemp.nextFloat();

                try {
                    Temperature tempObj = new Temperature(choiceTemp, valueTemp);
                    tempObj.convert(choiceTemp, valueTemp);
                    tempObj.show(choiceTemp);
                } catch(Exception e){
                    System.out.println(e);
                }
            }
            else {
                System.out.println("Invalid menu option. Please enter number from 1 to 3!");
            }
            if((choiceTemp<4) && (choiceTemp>0)) break;
        }
    }

    public static void menuMass() {
        Scanner scannerMass = new Scanner(System.in);
        Scanner scannerValueMass = new Scanner(System.in);
        scanMass(scannerMass, scannerValueMass);
    }

    private static void scanMass(Scanner scannerMass, Scanner scannerValueMass) {

        while(true){

            System.out.println("Chose a unit to convert: ");
            System.out.println("1. Milligram");
            System.out.println("2. Gram");
            System.out.println("3. Decagram");
            System.out.println("4. Kilogram");
            System.out.println("5. Ton");
            System.out.println("Enter your choice: ");

            int choiceMass = scannerMass.nextInt();

            if((choiceMass<8) && (choiceMass>0)) {
                System.out.println("Insert value to convert: ");
                float valueMass = scannerValueMass.nextFloat();

                try {
                Mass massObj = new Mass(choiceMass, valueMass);
                massObj.convert(choiceMass, valueMass);
                massObj.show(choiceMass);
            } catch(Exception e){
                System.out.println(e);
            }
            }
            else {
                System.out.println("Invalid menu option. Please enter number from 1 to 7!");
            }
            if((choiceMass<8) && (choiceMass>0)) break;
        }
    }

    public static void menuDistance() {
        Scanner scannerDistance = new Scanner(System.in);
        Scanner scannerValueDistance = new Scanner(System.in);
        scanDistance(scannerDistance, scannerValueDistance);
    }

    private static void scanDistance(Scanner scannerDistance, Scanner scannerValueDistance) {

        while(true){

            System.out.println("Chose a unit to convert: ");
            System.out.println("1. Millimeter");
            System.out.println("2. Centimeter");
            System.out.println("3. Meter");
            System.out.println("4. Kilometer");
            System.out.println("Enter your choice: ");

            int choiceDistance = scannerDistance.nextInt();

            if((choiceDistance<5) && (choiceDistance>0)) {
                System.out.println("Insert value to convert: ");
                float valueDistance = scannerValueDistance.nextFloat();

                try {
                Distance distanceObj = new Distance(choiceDistance, valueDistance);
                distanceObj.convert(choiceDistance, valueDistance);
                distanceObj.show(choiceDistance);
            } catch(Exception e){
                System.out.println(e);
            }
            }
            else {
                System.out.println("Invalid menu option. Please enter number from 1 to 4!");
            }
            if((choiceDistance<5) && (choiceDistance>0)) break;
        }
    }

    public static void menuSpeed() {
        Scanner scannerSpeed = new Scanner(System.in);
        Scanner scannerValueSpeed = new Scanner(System.in);
        scanSpeed(scannerSpeed, scannerValueSpeed);
    }

    private static void scanSpeed(Scanner scannerSpeed, Scanner scannerValueSpeed) {

        while(true){

            System.out.println("Chose a unit to convert: ");
            System.out.println("1. Meters per second");
            System.out.println("2. Meters per hour");
            System.out.println("3. Kilometers per second");
            System.out.println("4. Kilometers per hour");
            System.out.println("Enter your choice: ");

            int choiceSpeed = scannerSpeed.nextInt();

            if((choiceSpeed<5) && (choiceSpeed>0)) {
                System.out.println("Insert value to convert: ");
                float valueSpeed = scannerValueSpeed.nextFloat();

                try {
                Speed speedObj = new Speed(choiceSpeed, valueSpeed);
                speedObj.convert(choiceSpeed, valueSpeed);
                speedObj.show(choiceSpeed);
            } catch(Exception e){
                System.out.println(e);
            }
            }
            else {
                System.out.println("Invalid menu option. Please enter number from 1 to 4!");
            }
            if((choiceSpeed<5) && (choiceSpeed>0)) break;
        }
    }

    public static void menuTime() {
        Scanner scannerTime = new Scanner(System.in);
        Scanner scannerValueTime = new Scanner(System.in);
        scanTime(scannerTime, scannerValueTime);
    }

    private static void scanTime(Scanner scannerTime, Scanner scannerValueTime) {

        while(true){

            System.out.println("Chose a unit to convert: ");
            System.out.println("1. Millisecond");
            System.out.println("2. Second");
            System.out.println("3. Hour");
            System.out.println("4. Day");
            System.out.println("5. Month");
            System.out.println("6. Year");
            System.out.println("Enter your choice: ");

            int choiceTime = scannerTime.nextInt();

            if((choiceTime<7) && (choiceTime>0)) {
                System.out.println("Insert value to convert: ");
                float valueTime = scannerValueTime.nextFloat();

                try {
                    Time timeObj = new Time(choiceTime, valueTime);
                    timeObj.convert(choiceTime, valueTime);
                    timeObj.show(choiceTime);
                } catch(Exception e){
                    System.out.println(e);
                }
            }
            else {
                System.out.println("Invalid menu option. Please enter number from 1 to 6!");
            }
            if((choiceTime<7) && (choiceTime>0)) break;
        }
    }

}
