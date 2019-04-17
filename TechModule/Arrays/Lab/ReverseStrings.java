package Java.TechModule.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        for(int i = 0; i < arr.length / 2;i++){
            String oldArr = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = oldArr;
        }
        System.out.println(String.join(" ", arr));
    }
}
