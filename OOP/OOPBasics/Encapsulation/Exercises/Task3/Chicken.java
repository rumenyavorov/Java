package OOP.OOPBasics.Encapsulation.Exercises.Task3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Chicken {
    private String name;
    private int age;
    private double perDay;

    public Chicken(String name, int age){
        setName(name);
        setAge(age);
        setPerDay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){ // || name.equals("") || name.equals("\\s+"
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 15){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    public double getPerDay() {
        return perDay;
    }

    public void setPerDay() {
        if(this.age < 6){
            this.perDay = 2;
        } else if (age <= 12){
            this.perDay = 1;
        } else {
            this.perDay = 0.75;
        }
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.##");

        return String.format("Chicken %s (age %d) can produce %s eggs per day.", this.name, this.age, format.format(this.perDay));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        try {
            Chicken chk = new Chicken(name, age);

            System.out.println(chk.toString());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
