package Java.Basics.Ifelse02;

import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double exc = Double.parseDouble(sc.nextLine());
        int puzzle = Integer.parseInt(sc.nextLine());
        int doll = Integer.parseInt(sc.nextLine());
        int bear = Integer.parseInt(sc.nextLine());
        int minion = Integer.parseInt(sc.nextLine());
        int truck = Integer.parseInt(sc.nextLine());

        double sum = puzzle * 2.60 + doll * 3 + bear * 4.10 + minion * 8.20 + truck * 2;
        int quantity = puzzle + doll + bear + minion + truck;

        double fp = sum;
        double rent = fp * 0.10;
        double profit = fp - rent;
        double extra = profit - exc;

        if (quantity >= 50) {
            fp = sum * 0.25;
            fp -= fp * 0.25;
            System.out.printf("Yes! %.2f lv left", extra);
        } else {
            extra = exc - profit;
            System.out.printf("Not enough money! %.2f lv needed.", extra);
        }
    }
}
