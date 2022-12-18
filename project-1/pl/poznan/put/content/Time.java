package pl.poznan.put.content;
public class Time implements Unit {
    private double millisecond;
    private double second;
    private double hour;
    private double day;
    private double month;
    private double year;

    public Time(int choice, float value) {
        if (choice == 1) millisecond = value;
        if (choice == 2) second = value;
        if (choice == 3) hour = value;
        if (choice == 4) day = value;
        if (choice == 5) month = value;
        if (choice == 6) year = value;
    }
    @Override
    public void convert(int choice, float value){

        if (choice == 1) {
            millisecond = value;
        }
        if (choice == 2) {
            millisecond = value*1000;
        }
        if (choice == 3) {
            millisecond = value*3600000;
        }
        if (choice == 4) {
            millisecond = value*1000*24*3600;
        }
        if (choice == 5) {
            millisecond = value*1000*24*3600*30;
        }
        if (choice == 6) {
            millisecond = value*1000*24*3600*365;
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
        if(choice == 1) {
            System.out.println("1.Second: "+second);
            System.out.println("2.Hour: "+hour);
            System.out.println("3.Day: "+day);
            System.out.println("4.Month: "+month);
            System.out.println("5.Year: "+year+"\n");
        }
        if(choice == 2) {
            System.out.println("1.Millisecond: "+millisecond);
            System.out.println("2.Hour: "+hour);
            System.out.println("3.Day: "+day);
            System.out.println("4.Month: "+month);
            System.out.println("5.Year: "+year+"\n");
        }
        if(choice == 3) {
            System.out.println("1.Millisecond: "+millisecond);
            System.out.println("2.Second: "+second);
            System.out.println("3.Day: "+day);
            System.out.println("4.Month: "+month);
            System.out.println("5.Year: "+year+"\n");
        }
        if(choice == 4) {
            System.out.println("1.Millisecond: "+millisecond);
            System.out.println("2.Second: "+second);
            System.out.println("3.Hour: "+hour);
            System.out.println("4.Month: "+month);
            System.out.println("5.Year: "+year+"\n");
        }
        if(choice == 5) {
            System.out.println("1.Millisecond: "+millisecond);
            System.out.println("2.Second: "+second);
            System.out.println("3.Hour: "+hour);
            System.out.println("4.Day: "+day);
            System.out.println("5.Year: "+year+"\n");
        }
        if(choice == 6) {
            System.out.println("1.Millisecond: "+millisecond);
            System.out.println("2.Second: "+second);
            System.out.println("3.Hour: "+hour);
            System.out.println("4.Day: "+day);
            System.out.println("5.Month: "+month+"\n");
        }
    }
}
