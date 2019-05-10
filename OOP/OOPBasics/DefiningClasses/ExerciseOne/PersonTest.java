package OOP.OOPBasics.DefiningClasses.ExerciseOne;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    private String name;
    private int age;
    private List<BankAccount> accounts;

    public PersonTest(String name, int age){
        this.name = name;
        this.age = age;
        this.accounts = new ArrayList<>();
    }

    public PersonTest(String name, int age, List<BankAccount> accs){
        this.name = name;
        this.age = age;
        this.accounts = accs;
    }

    public double getBalance(){
        return this.accounts.stream().mapToDouble(e -> e.getBalance()).sum();
    }
}
