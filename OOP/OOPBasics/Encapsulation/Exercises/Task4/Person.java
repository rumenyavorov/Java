package OOP.OOPBasics.Encapsulation.Exercises.Task4;

import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> bagOfProducts;

    public Person(String name, double money){
        setName(name);
        setMoney(money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Product> getBagOfProducts() {
        return bagOfProducts;
    }

    public void setBagOfProducts(List<Product> bagOfProducts) {
        this.bagOfProducts = bagOfProducts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", bagOfProducts=" + bagOfProducts +
                '}';
    }
}
