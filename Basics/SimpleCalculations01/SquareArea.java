package Java.Basics.SimpleCalculations01;

import java.util.*;

public class SquareArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = Integer.parseInt(sc.nextLine());
        int area = a * a;
        System.out.println("Square = " + area);
    }
}
