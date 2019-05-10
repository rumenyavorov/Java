package OOP.OOPBasics.DefiningClasses.Lab;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String department;
    private List<Employee> empl;

    public Department(String dep){
        this.setDepartment(dep);
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Employee> getEmpl() {
        return empl;
    }

    public void setEmpl(List<Employee> empl) {
        this.empl = empl;
    }
}
