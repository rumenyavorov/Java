package Java.Basics.ForLoop05;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            int num = Integer.parseInt(sc.nextLine());
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
