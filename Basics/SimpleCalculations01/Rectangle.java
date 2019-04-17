package Java.Basics.SimpleCalculations01;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = Double.parseDouble(sc.nextLine());
        double y1 = Double.parseDouble(sc.nextLine());
        double x2 = Double.parseDouble(sc.nextLine());
        double y2 = Double.parseDouble(sc.nextLine());
        double width = Math.max(x1, x2) - Math.min(x1,x2);
        double height = Math.max(y1,y2) - Math.min(y1,y2);
        double area = (width * height);
        double perimeter = 2 * (width + height);
        System.out.println(area);
        System.out.println(perimeter);


    }
}
