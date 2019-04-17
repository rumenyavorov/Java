package Java.Basics.ForLoop05;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            int num = Integer.parseInt(sc.nextLine());
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
