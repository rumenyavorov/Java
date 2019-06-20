package OOP.OOPBasics.Polimorphism.Exercise.VehiclesExtension;

public class Car extends Vehicle {
    private static final double AIR_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + AIR_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double fuel) {
        if(fuel > getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        } else if(fuel < getTankCapacity()) {
            super.setFuelQuantity(super.getFuelQuantity() + fuel);
        }
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = super.getFuelConsumption() * distance;
        if (fuelNeeded > super.getFuelQuantity()) {
            throw new IllegalArgumentException("Car needs refueling");
        }
        super.setFuelQuantity(super.getFuelQuantity() - fuelNeeded);
    }
}