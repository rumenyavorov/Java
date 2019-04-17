package Java.Basics.SimpleCalculations01;

import java.util.Scanner;

public class RadiantToDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rad = Double.parseDouble(sc.nextLine());
        double degrees = Math.round((180 / Math.PI) * rad);

        System.out.printf("%.2f", degrees);
    }
}
