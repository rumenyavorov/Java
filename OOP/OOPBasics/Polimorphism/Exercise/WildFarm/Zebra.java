package OOP.OOPBasics.Polimorphism.Exercise.WildFarm;

public class Zebra extends Mammal{

    public Zebra(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Vegetable){
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        } else {
            throw new IllegalArgumentException("Zebras are not eating that type of food");
        }
    }
}
