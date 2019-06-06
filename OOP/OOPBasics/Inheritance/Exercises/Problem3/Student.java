package OOP.OOPBasics.Inheritance.Exercises.Problem3;

public class Student extends Human{
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private String getFacultyNumber() {
        return facultyNumber;
    }

    private void setFacultyNumber(String facultyNumber) {
        if(facultyNumber.trim().length() < 5 || facultyNumber.trim().length() > 10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String getInfo(){
        return String.format("Faculty number: %S", this.facultyNumber);
    }
}
