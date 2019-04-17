package Java.Basics.WhileLoop04;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numb = Integer.parseInt(sc.nextLine());
        while(numb < 1 || numb > 100){
            System.out.println("Invalid number");
            numb = Integer.parseInt(sc.nextLine());
        }
        System.out.println("The nubmer is: " + numb);
    }
}
