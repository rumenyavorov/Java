package Java.Basics.Nested03.Lab;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fl = sc.nextLine();
        int qu = Integer.parseInt(sc.nextLine());
        int mo = Integer.parseInt(sc.nextLine());

        double result;
        double le;

        switch (fl) {
            case "Roses":
                result = qu * 5;
                if (mo > result) {
                    le = mo - result;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", qu, fl, le);
                } else if (result > mo) {
                    le = result - mo;
                    System.out.printf("Not enough money, you need %.2f leva more.", le);
                }
                break;
            case "Dahlias":
                result = qu * 3.80;
                if (mo > result) {
                    le = mo - result;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", qu, fl, le);
                } else if (result > mo) {
                    le = result - mo;
                    System.out.printf("Not enough money, you need %.2f leva more.", le);
                }
                break;
            case "Tulips":
                result = qu * 2.80;
                if (mo > result) {
                    le = mo - result;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", qu, fl, le);
                } else if (result > mo) {
                    le = result - mo;
                    System.out.printf("Not enough money, you need %.2f leva more.", le);
                }
                break;
            case "Narcissus":
                result = qu * 3;
                if (mo > result) {
                    le = mo - result;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", qu, fl, le);
                } else if (result > mo) {
                    le = result - mo;
                    System.out.printf("Not enough money, you need %.2f leva more.", le);
                }
                break;
            case "Gladiolus":
                result = 2.50;
                if (mo > result) {
                    le = mo - result;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", qu, fl, le);
                } else if (result > mo) {
                    le = result - mo;
                    System.out.printf("Not enough money, you need %.2f leva more.", le);
                }
                break;
        }
    }
}
