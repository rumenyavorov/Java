package Java.TechModule.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while(input.length > 1){
            int[] condensed = new int[input.length - 1];


        }
    }
}
