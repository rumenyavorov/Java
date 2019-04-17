package Java.Basics.Ifelse02;

import java.util.Scanner;

public class GeoType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String shape = sc.nextLine();
        double area = 0.0;

        if(shape.equals("square")){
            double side = Double.parseDouble(sc.nextLine());
            area = side * side;
        } else if(shape.equals("rectangle")){
            double sideA = Double.parseDouble(sc.nextLine());
            double sideB = Double.parseDouble(sc.nextLine());
            area = sideA * sideB;
        } else if(shape.equals("circle")){
            double rad = Double.parseDouble(sc.nextLine());
            area = Math.PI * rad * rad;
        } else if(shape.equals("triangle")){
            double len = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());
            area = len * h / 2;
        }
        System.out.printf("%.3f", area);
    }
}
