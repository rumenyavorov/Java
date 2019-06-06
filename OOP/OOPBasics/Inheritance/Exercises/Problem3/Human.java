package OOP.OOPBasics.Inheritance.Exercises.Problem3;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        if(firstName.trim().length() < 4){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        firstName = firstName.trim();
        if(!Character.isUpperCase(firstName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument:firstName");
        }
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        if(lastName.trim().length() < 3){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: lastName");
        }
        lastName = lastName.trim();
        if(!Character.isUpperCase(lastName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        this.lastName = lastName;
    }

    protected String getInfo() {
        return String.format("First Name: %s\nLast Name: %s", this.firstName, this.lastName);
    }
}
