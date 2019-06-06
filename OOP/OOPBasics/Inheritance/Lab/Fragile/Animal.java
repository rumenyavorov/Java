package OOP.OOPBasics.Inheritance.Lab.Fragile;

import java.util.Collections;
import java.util.List;

public class Animal {
    private List<Food> foodEaten;

    void eat(Food food){
        this.foodEaten.add(food);
    }

    public void eatAll(Food[] foods){
        Collections.addAll(foodEaten, foods);
    }

    public static void main(String[] args) {

    }
}
