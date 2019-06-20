package OOP.OOPBasics.Polimorphism.Exercise.VehiclesExtension;

public class Car extends Vehicle {
    private static final double AIR_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AIR_CONSUMPTION);
    }

    @Override
    public void refuel(double fuel) {
        super.setFuelQuantity(super.getFuelQuantity() + fuel);
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