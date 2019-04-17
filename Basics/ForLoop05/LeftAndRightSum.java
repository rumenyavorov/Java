package Java.Basics.ForLoop05;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double sum = 0;

        int leftSum = 0;
        int rightSum = 0;
        for(int i = 1; i <= n; i++){
            leftSum += Integer.parseInt(sc.nextLine());
            for(int j = 3; j <= n; j++){
                rightSum += Integer.parseInt(sc.nextLine());
            }
        }

        if(leftSum == rightSum){
            System.out.println("Yes, sum = " + leftSum);
        } else {
            int diff = Math.abs(rightSum - leftSum);
            System.out.println("No, diff = " + diff);
        }
    }
}
