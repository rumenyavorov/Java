package Java.Basics.Ifelse02;

import java.util.Scanner;

public class SameThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        if(a == b && b == c){
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }
}
