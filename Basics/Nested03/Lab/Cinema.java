package Java.Basics.Nested03.Lab;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String proj = sc.nextLine();
        int r = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        double price = 0;
        if(proj.equals("Premiere")){
            price = r * c * 12.00;
        } else if(proj.equals("Normal")){
            price = r * c * 7.50;
        } else if(proj.equals("Discount")){
            price = r * c * 5.00;
        }
        System.out.printf("%.2f leva", price);
    }
}
