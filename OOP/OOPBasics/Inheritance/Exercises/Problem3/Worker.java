package OOP.OOPBasics.Inheritance.Exercises.Problem3;

public class Worker extends Human{
    private double salary;
    private double hoursPerDay;

    public Worker(String firstName, String lastName, double salary, double hoursPerDay) {
        super(firstName, lastName);
        this.setSalary(salary);
        this.setHoursPerDay(hoursPerDay);
    }

    private double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        if(salary < 10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.salary = salary;
    }

    private double getHoursPerDay() {
        return hoursPerDay;
    }

    private void setHoursPerDay(double hoursPerDay) {
        if(hoursPerDay < 1 || hoursPerDay > 12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hoursPerDay = hoursPerDay;
    }

    private double getSalaryPerHour(){
        return this.salary / this.hoursPerDay / 7d;
    }

    @Override
    protected void setLastName(String lastName){
        if(lastName.trim().length() < 4){
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    @Override
    protected String getInfo(){
        return String.format("%s%nSalary: %.2f%nHours Per day: %.2f%nSalary per hour: %.2f",
                super.getInfo(), this.salary, this.hoursPerDay, this.getSalaryPerHour());
    }
}
