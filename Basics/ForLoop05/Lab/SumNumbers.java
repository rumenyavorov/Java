package Java.Basics.ForLoop05.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n;i++){
            int sn = Integer.parseInt(sc.nextLine());
            sum += sn;
        }
        System.out.println(sum);
    }
}
