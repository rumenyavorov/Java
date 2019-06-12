package OOP.OOPBasics.Polimorphism.Exercise.Vehicles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] carInput = sc.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]));

        String[] truckInput = sc.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]));

        int n = Integer.parseInt(sc.nextLine());
        try {
            for (int i = 0; i < n; i++) {
                String[] tokens = sc.nextLine().split("\\s+");
                DecimalFormat decFor = new DecimalFormat("0.##");

                if (tokens[0].equals("Drive")) {
                    if (tokens[1].equals("Car")) {
                        car.drive(Double.parseDouble(tokens[2]));
                        System.out.printf("Car travelled %s km\n", decFor.format(tokens[2]));
                    } else if (tokens[1].equals("Truck")) {
                        truck.drive(Double.parseDouble(tokens[2]));
                    }
                } else if (tokens[0].equals("Refuel")) {
                    if (tokens[1].equals("Car")) {
                        car.refuel(Double.parseDouble(tokens[2]));
                    } else if (tokens[1].equals("Truck")) {
                        truck.refuel(Double.parseDouble(tokens[2]));
                    }
                }
            }
        } catch (IllegalArgumentException e){
            e.getMessage();
        }
        System.out.println();
    }
}//TODO:NOT DONE
