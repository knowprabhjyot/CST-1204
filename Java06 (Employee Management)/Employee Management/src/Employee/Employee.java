package Employee;

import java.util.UUID;

public class Employee {

    private String name;
    private String email;
    private String age;
    private int salary;
    private String employeeID;

   
    public Employee() {
        this.name = "John Doe";
        this.email = "Johndoe@gmail.com";
        this.age = "30";
        this.salary = 100000;
        // This is Unique ID provided for every Employee
        this.employeeID = UUID.randomUUID().toString();
    }
    
    public Employee(String name, String email, String age, int salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
        // This is Unique ID provided for every Employee
        this.employeeID = UUID.randomUUID().toString();

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getEmployeeInfo() {
        System.out.println("Employee Name : " + this.getName());
        System.out.println("Employee Email : " + this.getEmail());
        System.out.println("Employee Salary : " + this.getSalary());
        System.out.println("Employee Age : " + this.getAge());
        System.out.println("Employee ID : " + this.getEmployeeID());
    }
}
