package OOP.OOPBasics.Encapsulation.Exercises.Task4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Product> productMap = new HashMap<>();
        Map<String, Person> personMap = new LinkedHashMap<>();

        String[] personInput = sc.nextLine().split(";");
        for (String s : personInput) {
            String[] tempArr = s.split("=");
            Person person = new Person(tempArr[0], Double.parseDouble(tempArr[1]));
            personMap.putIfAbsent(person.getName(), person);
        }

        String[] productInput = sc.nextLine().split(";");
        for (String s: productInput) {
            String[] tempArr = s.split("=");
            Product product = new Product(tempArr[0], Double.parseDouble(tempArr[1]));
            productMap.putIfAbsent(product.getName(), product);
        }
    }
}
