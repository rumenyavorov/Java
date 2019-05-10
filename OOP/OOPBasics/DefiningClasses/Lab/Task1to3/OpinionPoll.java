package OOP.OOPBasics.DefiningClasses.Lab.Task1to3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> person = new ArrayList<>();

        int lineToPrint = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < lineToPrint; i++) {
            String[] personInput = sc.nextLine().split("\\s+");

            String name = personInput[0];
            int age = Integer.parseInt(personInput[1]);

            Person personCurr = new Person(name, age);

            person.add(personCurr);
        }

        person.stream().filter(p -> p.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(p -> System.out.printf("%s - %d\n",p.getName(), p.getAge()));
    }
}
