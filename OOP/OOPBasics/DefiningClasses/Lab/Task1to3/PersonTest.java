package OOP.OOPBasics.DefiningClasses.Lab.Task1to3;

import java.lang.reflect.Field;

public class PersonTest {

    private String name;
    private int age;

//    public PersonTest(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);

        Class person = PersonTest.class;
        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);
//
//        PersonTest p1 = new PersonTest("Rumen", 13);
//        PersonTest p2 = new PersonTest("Gosho", 14);
//        PersonTest p3 = new PersonTest("Stamat", 16);
//
//        System.out.printf("First object name is:%s and its age is:%d\n",p1.name ,p1.age);
//        System.out.printf("Second object name is:%s and its age is:%d\n",p2.name ,p2.age);
//        System.out.printf("Third object name is:%s and its age is:%d",p3.name ,p3.age);
    }
}
