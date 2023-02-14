import Company.Company;

public class App {
    public static void main(String[] args) throws Exception {
       
        Company VCC = new Company("Vancouver Community College", "Vancouver Downtown", 2000 );

        Employee Prabh = new Employee("Prabh", "12345", "pgambhir@vcc.ca", 28, VCC);

        Prabh.employeeInformation();
    }
}
