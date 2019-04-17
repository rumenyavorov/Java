package Java.Basics.Ifelse02.Lab;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second;
        second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());

        int sum = first + second + third;
        int mins = 0;

        if(sum <= 59){
            mins = 0;
            if(sum < 10){
                System.out.println(mins + ":0" + sum);
            } else {
                System.out.println(mins + ":" + sum);
            }

        } else if(sum >= 60 && sum <= 119){
            mins += 1;
            sum -= 60;
            if(sum < 10){
                System.out.println(mins + ":0" + sum);
            } else {
                System.out.println(mins + ":" + sum);
            }

        } else if(sum >= 119 && sum <= 179){
            mins += 2;
            sum -= 120;
            if(sum < 10){
                System.out.println(mins + ":0" + sum);
            } else {
                System.out.println(mins + ":" + sum);
            }

        }
    }
}
