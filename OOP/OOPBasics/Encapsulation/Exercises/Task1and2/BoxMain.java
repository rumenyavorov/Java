package OOP.OOPBasics.Encapsulation.Exercises.Task1and2;

import java.util.Scanner;

public class BoxMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());

        try {
            Box box = new Box(length, width, height);

            System.out.printf("Surface Area - %.2f\n", box.surfaceArea());
            System.out.printf("Lateral Surface Area - %.2f\n", box.lateralSurfaceArea());
            System.out.printf("Volume - %.2f", box.volume());

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
