package Java.Basics.WhileLoop04;

import java.util.Scanner;

public class Graduate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int counter = 1;
        double sum = 0;
        while(counter <= 12){
            String string;
            double grade = Double.parseDouble(sc.nextLine());
            if(grade >= 4.00){
                sum += grade;
                counter++;
            }
        }
        double average = sum /12;
        System.out.printf("%s graduated. Average grade: %.2f", name , average);
    }
}
