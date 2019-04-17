package Java.Basics.SimpleCalculations01;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());

        int totalVolume = length * width * height;
        double realLitres = totalVolume * 0.001;
        double procent = percent * 0.01;
        double finalVal = realLitres * (1 - procent);
        System.out.printf("%.3f", finalVal);
    }
}
