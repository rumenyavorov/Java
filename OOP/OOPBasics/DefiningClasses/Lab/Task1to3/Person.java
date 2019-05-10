package OOP.OOPBasics.DefiningClasses.Lab.Task1to3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Person{
    private String name;
    private int age;

    public Person(){
        this.name = "No name";
        this.age = 1;
    }

    public Person(int age){
        this.name = "No name";
        this.age = age;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Scanner sc = new Scanner(System.in);
//
//        String inputName = sc.nextLine();
//        int inputAge = Integer.parseInt(sc.nextLine());

//        Person pc1 = new Person();
//        Person pc2 = new Person(inputAge);
//        Person pc3 = new Person(inputName, inputAge);

//        System.out.printf("%s %d\n",pc1.getName(), pc1.getAge());
//        System.out.printf("%s %d\n", pc2.getName(), pc2.getAge());
//        System.out.printf("%s %d", pc3.getName(), pc3.getAge());

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        Class<?> personClass = Person.class;
        Constructor emptyCtor = personClass.getDeclaredConstructor();
        Constructor ageCtor = personClass.getDeclaredConstructor(int.class);
        Constructor nameAgeCtor = personClass
                .getDeclaredConstructor(String.class, int.class);
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        Person basePerson = (Person) emptyCtor.newInstance();
        Person personWithAge = (Person) ageCtor.newInstance(age);
        Person personFull = (Person) nameAgeCtor.newInstance(name, age);
        Person pc1 = new Person();
        Person pc2 = new Person(age);
        Person pc3 = new Person(name, age);
        System.out.printf("%s %d\n", basePerson.getName(), basePerson.getAge());
        System.out.printf("%s %d\n", personWithAge.getName(), personWithAge.getAge());
        System.out.printf("%s %d\n", personFull.getName(), personFull.getAge());
    }
}
