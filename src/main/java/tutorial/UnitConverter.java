package tutorial;

import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {


        final double INCH = 0.394;
        final double METER = 0.01;
        final double KILOMETER = 0.00001;

        Scanner in = new Scanner(System.in);


        System.out.print("Enter length in centimeters : ");
        double cm = in.nextDouble();


        double inch = cm * INCH;
        double m = cm * METER;
        double km = cm * KILOMETER;


        System.out.println(cm + " cm is equal to " + inch + " inches.");
        System.out.println(cm + " cm is equal to " + m + " meters.");
        System.out.println(cm + " cm is equal to " + inch + " kilometers.");
    }
}
