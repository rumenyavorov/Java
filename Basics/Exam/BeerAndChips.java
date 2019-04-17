package Java.Basics.Exam;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double budget = Double.parseDouble(sc.nextLine());
        int beerQuantity = Integer.parseInt(sc.nextLine());
        int chipsQuantity = Integer.parseInt(sc.nextLine());

        double beersSum = 0;
        double chipsSum = 0;
        double oneChips = 0;
        double sum = 0;

        beersSum = 1.20 * beerQuantity;
        oneChips = beersSum * 0.45;
        chipsSum = Math.ceil(oneChips * chipsQuantity);
        sum = beersSum + chipsSum;


        if(sum <= budget){
            double leftOver = budget - sum;
            System.out.printf("%s bought a snack and has %.2f leva left.", name,leftOver);
        } else if(budget < sum){
            double leftOver = sum - budget;
            System.out.printf("%s needs %.2f more leva!", name, leftOver);
        }
    }
}
