package Java.TechModule.Arrays.Lab;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(sc.nextLine());
            numbers[i] = number;
        }

        for(int i = numbers.length - 1; i>= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
