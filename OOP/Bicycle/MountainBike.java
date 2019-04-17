package Java.OOP.Bicycle;

public class MountainBike extends Bicycle{
    //new fields and methods defining
    //a mountain bike would go here
    interface Bicycle {
        //wheel revolutions per minute
        void changeCadence(int newValue);

        void changeGear(int newValue);

        void speedUp(int increment);

        void applyBrakes(int decrement);
    }
}
