package OOP.OOPBasics.Inheritance.Exercises.Problem1;

public class Person {
    private String name;
    private int age;

    protected Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        if(name.length() < 3){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 1){
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge());
    }
}
