package OOP.OOPBasics.Polimorphism.Exercise.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    protected static final DecimalFormat format = new DecimalFormat("#.##");

    private String livingRegion;

    public Mammal(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.setLivingRegion(livingRegion);
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        String animalType = this.getClass().getSimpleName();
        return String.format("%s [%s, %s, %s, %d]", animalType, this.getAnimalName(), format.format(this.getAnimalWeight()), this.getLivingRegion(), this.getFoodEaten());
    }
}
