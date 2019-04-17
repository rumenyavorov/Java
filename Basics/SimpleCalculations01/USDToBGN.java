package Java.Basics.SimpleCalculations01;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usd = Double.parseDouble(sc.nextLine());
        double bgn = usd * 1.79549;

        System.out.printf("%.2f", bgn);

    }
}
