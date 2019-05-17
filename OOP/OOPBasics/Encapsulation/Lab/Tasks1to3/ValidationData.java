package OOP.OOPBasics.Encapsulation.Lab.Tasks1to3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidationData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputLines = sc.nextLine().split(" ");

            try {
                personList.add(new Person(inputLines[0], inputLines[1], Integer.parseInt(inputLines[2]),
                        Double.parseDouble(inputLines[3])));

            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        double bonus = Double.parseDouble(sc.nextLine());

        for (Person person : personList) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
