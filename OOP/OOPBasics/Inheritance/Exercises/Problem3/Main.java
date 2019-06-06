package OOP.OOPBasics.Inheritance.Exercises.Problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        try(BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))){
            while(true){
                String[] tokens = sc.readLine().trim().split("\\s+");
                switch (tokens.length){
                    case 3:
                        String firstName = tokens[0];
                        String lastName = tokens[1];
                        String facultyNumber = tokens[2];
                        System.out.println(new Student(firstName, lastName, facultyNumber).getInfo());
                        break;
                    case 4:
                        firstName = tokens[0];
                        lastName = tokens[1];
                        double salary = Double.parseDouble(tokens[2]);
                        double hoursPerDay = Double.parseDouble(tokens[3]);
                        System.out.println(new Worker(firstName, lastName, salary, hoursPerDay).getInfo());
                        break;
                    default:
                        break;
                }
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
