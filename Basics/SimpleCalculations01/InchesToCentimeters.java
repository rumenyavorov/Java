package Java.Basics.SimpleCalculations01;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inches: ");
        double inches = Double.parseDouble(sc.nextLine());
        double centimeters = inches * 2.54;
        System.out.println("Centimeters = " + centimeters);
    }
}
