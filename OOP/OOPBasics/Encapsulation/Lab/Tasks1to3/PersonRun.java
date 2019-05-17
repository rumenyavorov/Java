package OOP.OOPBasics.Encapsulation.Lab.Tasks1to3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {
            String[] inputLines = sc.nextLine().split("\\s+");

            list.add(new Person(inputLines[0], inputLines[1], Integer.parseInt(inputLines[2]),
                    Double.parseDouble(inputLines[3])));

        }//for
//        double bonus = Double.parseDouble(sc.nextLine());
//
//        for (Person person : list) {
//            person.increaseSalary(bonus);
//            System.out.println(person.toString());
//        }//for

        Team team = new Team("Minior");

        for (Person person: list) {
            team.addPlayer(person);
        }

        System.out.printf("First team have %d players\n", team.getFirstTeamPlayers().size());
        System.out.printf("Reserve team have %d players", team.getReserveTeamPlayers().size());
    }//main
}//class
