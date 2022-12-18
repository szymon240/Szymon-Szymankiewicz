package pl.poznan.put.content;
public class Temperature implements Unit {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public Temperature(int choice, float value) {
        if (choice == 1) celsius = value;
        if (choice == 2) fahrenheit = value;
        if (choice == 3) kelvin = value;
    }
    @Override
    public void convert(int choice, float value) {
        if (choice == 1) {
            celsius = value;
        }
        if (choice == 3) {
            celsius = value - 273.15;
        }
        if (choice == 2) {
            celsius = (value-32)/1.8;
        }

        fahrenheit = (celsius * 1.8) + 32;
        kelvin = celsius + 273.15;
    }
    @Override
    public void show(int choice) {
        System.out.println("\nConverted Units");
        if (choice == 1){
            System.out.println("Fahrenheit: "+fahrenheit);
            System.out.println("Kelvin: "+kelvin+"\n");
        }
        if (choice == 2){
            System.out.println("Celsius: "+celsius);
            System.out.println("Kelvin: "+kelvin+"\n");
        }
        if (choice == 3) {
            System.out.println("Celsius: "+celsius);
            System.out.println("Fahrenheit: "+fahrenheit+"\n");

        }

    }
}
