package OOP.OOPBasics.Polimorphism.Exercise.WildFarm;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    public Cat(String animalType, String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.setBreed(breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public String toString() {
        String animalType = this.getClass().getSimpleName();
        return String.format("%s [%s, %s, %s, %s, %d]", animalType, this.getAnimalName(), this.getBreed(), format.format(this.getAnimalWeight()), this.getLivingRegion(), this.getFoodEaten());
    }
}
