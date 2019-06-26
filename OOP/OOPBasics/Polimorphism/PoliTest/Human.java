package OOP.OOPBasics.Polimorphism.PoliTest;

public class Human {
    public void consume(Food x){
        x.eat();
        System.out.printf("human consumed %s\n", x.toString());
    }

}
