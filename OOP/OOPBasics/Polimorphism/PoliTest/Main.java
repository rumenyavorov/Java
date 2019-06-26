package OOP.OOPBasics.Polimorphism.PoliTest;

public class Main {

    public static void main(String[] args) {

        Food apple = new Apple();
        Food pizza = new Pizza();

        Human hum = new Human();

        apple.eat();
        pizza.eat();

        hum.consume(apple);
        hum.consume(pizza);

    }
}
