package Java.Basics.Ifelse02.Lab;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        second += 15;

        if(second >= 60){
            first += 1;

        }
    }
}
