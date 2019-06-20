package OOP.OOPBasics.Polimorphism.Exercise.VehiclesExtension;

public class Truck extends Vehicle {
    private static final double AIR_CONSUMPTION = 1.6;
    private static final double REFUEL_EFFICIENCY = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity){
        super(fuelQuantity, fuelConsumption + AIR_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double fuel) {
        if(fuel > getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        } else if(fuel < getTankCapacity()) {
            super.setFuelQuantity(super.getFuelQuantity() + fuel * REFUEL_EFFICIENCY);
        }
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = super.getFuelConsumption() * distance;
        if(fuelNeeded > super.getFuelQuantity()){
            throw new IllegalArgumentException("Truck needs refueling");
        }
        super.setFuelQuantity(super.getFuelQuantity() - fuelNeeded);
    }
}

