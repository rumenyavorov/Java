package OOP.OOPBasics.Polimorphism.Exercise.VehiclesExtension;

public class Bus extends Vehicle{

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity){
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void refuel(double fuel) {
        if(fuel > getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        } else if(fuel < getTankCapacity()){
            super.setFuelQuantity(super.getFuelQuantity() + fuel);
        }

    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = super.getFuelConsumption() * distance;
        if(fuelNeeded > super.getFuelQuantity()){
            throw new IllegalArgumentException("Bus needs refueling");
        }
        super.setFuelQuantity(super.getFuelQuantity() - fuelNeeded);
    }


}
