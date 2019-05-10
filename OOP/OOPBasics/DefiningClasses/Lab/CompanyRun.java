package OOP.OOPBasics.DefiningClasses.Lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Department> record = new HashMap<>();

        int lines = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] personInfo = sc.nextLine().split("\\s+");

            String name = personInfo[0];
            double salary = Double.parseDouble(personInfo[1]);
            String position = personInfo[2];
            String department = personInfo[3];

            String email = "n/a";
            int age = -1;

            Employee emp = new Employee(name, salary, position, department, email, age);


        }
    }
}
