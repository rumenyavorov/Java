package Java.Basics.SimpleCalculations01;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = Double.parseDouble(sc.nextLine());

        double result = (c * 9) / 5 + 32;
        System.out.printf("%.2f", result);
    }
}
