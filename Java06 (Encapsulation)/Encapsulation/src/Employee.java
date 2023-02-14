import Company.Company;

public class Employee {
    
    // These are private variables which are not accessible outside this class directly
    private String name;
    private String employeeID;
    private String employeeEmail;
    private int age;
    private Company company;



    // Default Constructor
    public Employee() {

    }

    public Employee(String name, String employeeID, String employeeEmail, int age, Company company) {
        this.name = name;
        this.employeeEmail = employeeEmail;
        this.employeeID = employeeID;
        this.age = age;
        this.company = company;
    }

    // public Employee(String name) {

    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 4) {
            this.name = "Not a valid Name";
        }

        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void employeeInformation() {
        System.out.println("Employee Name : " + this.getName());
        System.out.println("Employee Email : " + this.getEmployeeEmail());
        System.out.println("Employee ID : " + this.getEmployeeID());
        System.out.println("Employee Age : " + this.getAge());
        System.out.println("Company Name : " + this.getCompany().getName());
        System.out.println("Company Address : " + this.getCompany().getAddress());
        
    }
}
