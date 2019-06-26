package OOP.OOPBasics.Polimorphism.Exercise.WildFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while(!"End".equals(line = sc.readLine())) {
            //read input
            String[] animalInfo = line.split("\\s+");
            String[] mealInfo = sc.readLine().split("\\s+");

            switch(animalInfo[0]) {
                case "Cat":
                    Animal cat = new Cat(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3], animalInfo[4]);
                    cat.makeSound();
                    System.out.println(cat.toString());
                    break;
                case "Tiger":
                    Animal tiger = new Tiger(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]);
                    tiger.makeSound();
                    System.out.println(tiger.toString());
                    break;
                case "Zebra":
                    Animal zebra = new Zebra(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]);
                    zebra.makeSound();
                    System.out.println(zebra.toString());
                    break;
                case "Mouse":
                    Animal mouse = new Mouse(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]);
                    mouse.makeSound();
                    System.out.println(mouse.toString());
            }
        }
    }
}
