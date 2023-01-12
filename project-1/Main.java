import pl.poznan.put.content.*;
import java.util.Scanner;
public class Main {
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
                case "1" -> Menu.menuTemp();
                case "2" -> Menu.menuMass();
                case "3" -> Menu.menuDistance();
                case "4" -> Menu.menuSpeed();
                case "5" -> Menu.menuTime();
                case "6" -> {
                    System.out.println("Exiting program...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid menu option. Please try again");
            }
        }
    }
}
