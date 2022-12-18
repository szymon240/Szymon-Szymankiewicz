package pl.poznan.put.content;
public class Speed implements Unit {
    private double mps;
    private double mph;
    private double kps;
    private double kph;

    public Speed(int choice, float value) {
        if (choice == 1) mps = value;
        if (choice == 2) mph = value;
        if (choice == 3) kps = value;
        if (choice == 4) kph = value;
    }
    @Override
    public void convert(int choice, float value){

        if (choice == 1) {
            mps = value;
        }
        if (choice == 2) {
            mps = value/3600;
        }
        if (choice == 3) {
            mps = value * 1000;
        }
        if (choice == 4) {
            mps = value * 1000/3600;
        }

        mph = mps * 3600;
        kps = mps/1000 ;
        kph = mps *3600/1000 ;
    }

    @Override
    public void show(int choice) {
        System.out.println("\nConverted Units");
        if (choice == 1){
            System.out.println("1.Meters per hour: "+mph);
            System.out.println("2.Kilometers per second: "+kps);
            System.out.println("3.Kilometers per hour: "+kph+"\n");
        }
        if (choice == 2){
            System.out.println("1.Meters per second: "+mps);
            System.out.println("2.Kilometers per second: "+kps);
            System.out.println("3.Kilometers per hour: "+kph+"\n");
        }
        if (choice == 3) {
            System.out.println("1.Meters per second: "+mps);
            System.out.println("2.Meters per hour: "+mph);
            System.out.println("3.Kilometers per hour: "+kph+"\n");
        }
        if (choice == 4) {
            System.out.println("1.Meters per second: "+mps);
            System.out.println("2.Meters per hour: "+mph);
            System.out.println("3.Kilometers per second: "+kps+"\n");
        }
    }
}
