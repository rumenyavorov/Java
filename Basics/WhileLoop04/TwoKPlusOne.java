package Java.Basics.WhileLoop04;

import java.util.Scanner;

public class TwoKPlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int k = 1;

        while(k <= n){
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
