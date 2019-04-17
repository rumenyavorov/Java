package Java.TechModule.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int maxLength = 5;
        for(int i = 0; i < maxLength; i++){
            sum += firstArr[i];
            if(firstArr[i] != secondArr[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            } else {
                System.out.println("a");
            }
        }

    }
}
