package Java.TechModule.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while(input.length > 1){
            int[] condensed = new int[input.length - 1];
            for(int i = 0; i < condensed.length;i++){
                condensed[i] = input[i] + input[i + 1];
            }
            input = condensed;
        }
        System.out.println(input[0]);
        System.out.println("deiba");
    }
}
