package Java.Basics.Ifelse02;

import java.util.Scanner;

public class ExcellentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if (grade >= 5.50){
            System.out.println("Excellent");
        }
    }
}
