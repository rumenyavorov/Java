package OOP.OOPBasics.Encapsulation.Exercises.Task4;

import java.util.HashMap;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost){
        setName(name);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
