package Java.Basics.Nested03.Lab;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String year = sc.nextLine();
        int p = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());

        double result = 0;

        if(year.equals("leap")){
            result = (48 - h) * 3.0 / 4;
        }
        System.out.println(result);
    }
}
