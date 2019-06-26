package OOP.OOPBasics.Polimorphism.Exercise.VehiclesExtension;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static final double AIR_CONDITIONER_ON = 1.4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] carInput = sc.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]), Double.parseDouble(carInput[3]));

        String[] truckInput = sc.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]), Double.parseDouble(truckInput[3]));

        String[] busInput = sc.nextLine().split("\\s+");
        Vehicle bus = new Bus(Double.parseDouble(busInput[1]), Double.parseDouble(busInput[2]) + AIR_CONDITIONER_ON, Double.parseDouble(busInput[3]));

        NumberFormat decFor = new DecimalFormat("0.##");

        System.out.println();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            try {
                String[] tokens = sc.nextLine().split("\\s+");
                if(Double.parseDouble(tokens[2]) < 1){
                    throw new IllegalArgumentException("Fuel must be a positive number");
                }

                if (tokens[0].equals("Drive")) {
                    if (tokens[1].equals("Car")) {
                        car.drive(Double.parseDouble(tokens[2]));
                        System.out.printf("Car travelled %s km\n", decFor.format(Double.parseDouble(tokens[2])));
                    } else if (tokens[1].equals("Truck")) {
                        truck.drive(Double.parseDouble(tokens[2]));
                        System.out.printf("Truck travelled %s km\n", decFor.format(Double.parseDouble(tokens[2])));
                    } else if(tokens[1].equals("Bus")){
                        bus.drive(Double.parseDouble(tokens[2]));
                        System.out.printf("Bus travelled %s km\n", decFor.format(Double.parseDouble(tokens[2])));
                    }
                } else if (tokens[0].equals("Refuel")) {
                    if (tokens[1].equals("Car")) {
                        car.refuel(Double.parseDouble(tokens[2]));
                    } else if (tokens[1].equals("Truck")) {
                        truck.refuel(Double.parseDouble(tokens[2]));
                    } else if(tokens[1].equals("Bus")){
                        bus.refuel(Double.parseDouble(tokens[2]));
                    }
                } else if(tokens[0].equals("DriveEmpty")){
                    if(tokens[1].equals("Bus")){
                        bus.drive(Double.parseDouble(tokens[2]) - AIR_CONDITIONER_ON);
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("Car: %.2f\n" , car.getFuelQuantity());
        System.out.printf("Truck: %.2f\n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());
    }
}//TODO:not done!