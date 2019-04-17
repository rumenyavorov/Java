package Java.Basics.Exam;

import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stadiumSectors = Integer.parseInt(sc.nextLine());
        int stadiumCap = Integer.parseInt(sc.nextLine());
        double ticketPrice = Double.parseDouble(sc.nextLine());

        double allInc = 0;
        double sectorInc = 0;
        double charity = 0;

        allInc = stadiumCap * ticketPrice;
        sectorInc = allInc / stadiumSectors;

        charity = (allInc - (sectorInc * 0.75)) / 8;

        System.out.printf("Total income - %.2f BGN\n", allInc);
        System.out.printf("Money for charity - %.2f BGN", charity);
    }
}
