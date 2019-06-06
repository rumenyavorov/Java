package OOP.OOPBasics.Inheritance.Lab.FirstProblems;

public class Animal {
    public void eat(){
        System.out.println("eating. . . ");
    }

    public static void main(String[] args) {
//        Puppy puppy = new Puppy();
//        puppy.eat();
//        puppy.bark();
//        puppy.weep();
// Puppy

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }//main
}//class
