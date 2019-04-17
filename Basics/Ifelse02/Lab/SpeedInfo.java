package Java.Basics.Ifelse02.Lab;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double input = Double.parseDouble(sc.nextLine());

        if(input <= 10){
            System.out.println("slow");
        } else if(input > 10 && input <= 50){
            System.out.println("average");
        } else if(input > 50 && input <= 150){
            System.out.println("fast");
        } else if(input > 150 && input <= 1000){
            System.out.println("ultra fast");
        } else if(input > 1000){
            System.out.println("extremely fast");
        }
    }
}

