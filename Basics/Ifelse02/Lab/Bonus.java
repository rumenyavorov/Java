package Java.Basics.Ifelse02.Lab;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        double bonus = 0;

        if(input <= 100){
            bonus += 5;
        } else if(input > 100){
            bonus = input * 0.2;
        } else if(input > 1000){
            bonus = input * 0.1;
        }

        if(input%2==0){
            bonus += 1;
        } else if(input%5==0){
            bonus += 2;
        }
        System.out.printf("%f%n%f", bonus, bonus+input);

        int eb = 0;

    }
}
