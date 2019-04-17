package Java.TechModule.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr2.length; i++){
                if(arr[i] == (arr2[j])){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
