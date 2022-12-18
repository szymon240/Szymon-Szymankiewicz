import pl.poznan.put.content.*;
import java.util.Scanner;
public class Main {

    static void menuTemp() {
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

                Temperature tempObj = new Temperature(choiceTemp, valueTemp);
                tempObj.convert(choiceTemp, valueTemp);
                tempObj.show(choiceTemp);
                }
            else {
                System.out.println("Invalid menu option. Please enter number from 1 to 3!");
            }
            if((choiceTemp<4) && (choiceTemp>0)) break;
        }
    }

    static void menuMass() {
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

                Mass massObj = new Mass(choiceMass, valueMass);
                massObj.convert(choiceMass, valueMass);
                massObj.show(choiceMass);
                }
            else {
                System.out.println("Invalid menu option. Please enter number from 1 to 7!");
            }
            if((choiceMass<8) && (choiceMass>0)) break;
        }
    }

    static void menuDistance() {
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

                Distance distanceObj = new Distance(choiceDistance, valueDistance);
                distanceObj.convert(choiceDistance, valueDistance);
                distanceObj.show(choiceDistance);
            }
            else {
                System.out.println("Invalid menu option. Please enter number from 1 to 4!");
            }
            if((choiceDistance<5) && (choiceDistance>0)) break;
        }
    }

    static void menuSpeed() {
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

                Speed speedObj = new Speed(choiceSpeed, valueSpeed);
                speedObj.convert(choiceSpeed, valueSpeed);
                speedObj.show(choiceSpeed);
            }
            else {
                System.out.println("Invalid menu option. Please enter number from 1 to 4!");
            }
            if((choiceSpeed<5) && (choiceSpeed>0)) break;
        }
    }

    static void menuTime() {
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

                Time timeObj = new Time(choiceTime, valueTime);
                timeObj.convert(choiceTime, valueTime);
                timeObj.show(choiceTime);
            }
            else {
                System.out.println("Invalid menu option. Please enter number from 1 to 6!");
            }
            if((choiceTime<7) && (choiceTime>0)) break;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("---Unit Converter---");
            System.out.println("Choose type of unit to convert: ");
            System.out.println("1. Temperature");
            System.out.println("2. Mass");
            System.out.println("3. Distance");
            System.out.println("4. Speed");
            System.out.println("5. Time");
            System.out.println("6. Exit\n");
            System.out.println("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> menuTemp();
                case "2" -> menuMass();
                case "3" -> menuDistance();
                case "4" -> menuSpeed();
                case "5" -> menuTime();
                case "6" -> {
                    System.out.println("Exiting program...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid menu option. Please try again");
            }
        }
    }
}
