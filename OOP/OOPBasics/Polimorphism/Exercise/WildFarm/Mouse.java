package OOP.OOPBasics.Polimorphism.Exercise.WildFarm;

public class Mouse extends Mammal{
    public Mouse(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAA");
    }

    @Override
    public void eat(Food food) {

    }
}
