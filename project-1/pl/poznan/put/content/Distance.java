package pl.poznan.put.content;
public class Distance implements Unit {
    private double millimeter;
    private double centimeter;
    private double meter;
    private double kilometer;

    public Distance(int choice, float value) {
        if (choice == 1) millimeter = value;
        if (choice == 2) centimeter = value;
        if (choice == 3) meter = value;
        if (choice == 4) kilometer = value;
    }
    @Override
    public void convert(int choice, float value){
        int milli = 1;
        int centi = 10;
        int meters = 1000;
        int kilo = 1000000;

        if (choice == 1) {
            millimeter = value * milli;
        }
        if (choice == 2) {
            millimeter = value * centi;
        }
        if (choice == 3) {
            millimeter = value * meters;
        }
        if (choice == 4) {
            millimeter = value * kilo;
        }

        centimeter = millimeter/centi;
        meter = millimeter/meters;
        kilometer = millimeter/kilo;
    }

    @Override
    public void show(int choice) {
        System.out.println("\nConverted Units");
        if (choice == 1){
            System.out.println("Centimeter: "+centimeter);
            System.out.println("Meter: "+meter);
            System.out.println("Kilometer: "+kilometer+"\n");
        }
        if (choice == 2){
            System.out.println("Millimeter: "+millimeter);
            System.out.println("Meter: "+meter);
            System.out.println("Kilometer: "+kilometer+"\n");
        }
        if (choice == 3) {
            System.out.println("Millimeter: "+millimeter);
            System.out.println("Centimeter: "+centimeter);
            System.out.println("Kilometer: "+kilometer+"\n");
        }
        if (choice == 4) {
            System.out.println("Millimeter: "+millimeter);
            System.out.println("Centimeter: "+centimeter);
            System.out.println("Meter: "+meter+"\n");
        }
    }
}
