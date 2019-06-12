package OOP.OOPBasics.Polimorphism.Exercise.Vehicles;

public class Truck extends Vehicle{
    private static final double AIR_CONSUMPTION = 1.6;
    private static final double REFUEL_EFFICIENCY = 0.9;

    public Truck(double fuelQuantity, double fuelConsumption){
        super(fuelQuantity, fuelConsumption + AIR_CONSUMPTION);
    }

    @Override
    public void refuel(double fuel) {
        super.setFuelQuantity(super.getFuelQuantity() + fuel * REFUEL_EFFICIENCY);
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
