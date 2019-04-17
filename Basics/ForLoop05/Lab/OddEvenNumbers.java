package Java.Basics.ForLoop05.Lab;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i < n; i++){
            int currNumb = Integer.parseInt(sc.nextLine());
            if(i % 2 == 0){
                evenSum += currNumb;
            } else {
                oddSum += currNumb;
            }
        }

    }
}
