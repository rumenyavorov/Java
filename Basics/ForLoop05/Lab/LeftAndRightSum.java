package Java.Basics.ForLoop05.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 1; i <= n * 2;i++){
            int currentNum = Integer.parseInt(sc.nextLine());
            if(i <= n){
                leftSum += currentNum;
            } else {
                rightSum += currentNum;
            }
        }
        if(leftSum == rightSum){
            System.out.printf("Yes, sum = %d", leftSum);
        } else{
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}
