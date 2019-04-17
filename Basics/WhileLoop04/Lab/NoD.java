package Java.Basics.WhileLoop04.Lab;

import java.util.Scanner;

public class NoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int result = 0;

        if(b == 0){
            result = a;
        } else {
            while(b != 0){
                result = b;
                b = a%b;
                a = result;
            }
        }
        System.out.println(result);
    }
}
