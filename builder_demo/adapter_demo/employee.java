package builder_demo.adapter_demo;

import java.util.Date;

public class employee {
    int employeeId;
    String name;
    Date dateOfBirth;
    long salary;
    // constructor
    public employee(int employeeId, String name, Date dateOfBirth, long salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public Date getdateOfBirth() {
        return dateOfBirth;
    }

    public void setdateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
