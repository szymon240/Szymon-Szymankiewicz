package pl.poznan.put.content;
public class Mass implements Unit {
    private double milligram;
    private double gram;
    private double decagram;
    private double kilogram;
    private  double ton;

    public Mass(int choice, float value) {
        if (choice == 1) milligram = value;
        if (choice == 2) gram = value;
        if (choice == 3) decagram = value;
        if (choice == 4) kilogram = value;
        if (choice == 5) ton = value;
    }
    @Override
    public void convert(int choice, float value){
        int milli = 1;
        int grams = 1000;
        int deca = 10000;
        int kilo = 1000000;
        int tons = 1000000000;

        if (choice == 1) {
            milligram = value * milli;
        }
        if (choice == 2) {
            milligram = value * grams;
        }
        if (choice == 3) {
            milligram = value * deca;
        }
        if (choice == 4) {
            milligram = value * kilo;
        }
        if (choice == 5) {
            milligram = value * tons;
        }

        gram = milligram/grams;
        decagram = milligram/deca;
        kilogram = milligram/kilo;
        ton = milligram/tons;
    }
    @Override
    public void show(int choice){
        System.out.println("\nConverted Units");
        if (choice == 1){
            System.out.println("Gram: "+gram);
            System.out.println("Decagram: "+decagram);
            System.out.println("Kilogram: "+kilogram);
            System.out.println("Ton: "+ton+"\n");
        }
        if (choice == 2){
            System.out.println("Milligram: "+milligram);
            System.out.println("Decagram: "+decagram);
            System.out.println("Kilogram: "+kilogram);
            System.out.println("Ton: "+ton+"\n");
        }
        if (choice == 3) {
            System.out.println("Milligram: "+milligram);
            System.out.println("Gram: "+gram);
            System.out.println("Kilogram: "+kilogram);
            System.out.println("Ton: "+ton);
        }
        if (choice == 4) {
            System.out.println("Milligram: "+milligram);
            System.out.println("Gram: "+gram);
            System.out.println("Decagram: "+decagram);
            System.out.println("Ton: "+ton+"\n");
        }
        if (choice == 5) {
            System.out.println("Milligram: "+milligram);
            System.out.println("Gram: "+gram);
            System.out.println("Decagram: "+decagram);
            System.out.println("Kilogram: "+kilogram+"\n");
        }
    }
}
