package Java.Basics.SimpleCalculations01;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = Double.parseDouble(sc.nextLine());

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
