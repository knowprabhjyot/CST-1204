import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Employee.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        
        System.out.println("====================================");
        System.out.println("Welcome to Employee Management!");
        System.out.println("====================================");

        showOptions();
    }

    public static void showOptions() {
        Scanner sc = new Scanner(System.in);
        String option = "0";
        List<Employee> employeeList = new ArrayList<>();

        do {
            System.out.println("====================================");
            System.out.println("1. Show all Employees");
            System.out.println("2. Add An Employee");
            System.out.println("3. EXIT");
            System.out.println("====================================");

            System.out.println(" Please choose an option : ");

            option = sc.next();

            System.out.println(); // Move the control to next line!

            System.out.println(option + "OPTION");
            switch (option) {
                case "1": 
                    System.out.println("You chose to show all employees!");
                    showAllEmployeeDetails(employeeList);
                    break;
                case "2":
                    System.out.println("You chose to add  employees!");
                    System.out.println("====================================");

                    System.out.println("====================================");
                    Employee newEmployee = new Employee();
                    newEmployee = enterEmployeeDetails();

                    employeeList.add(newEmployee);
                    
                    break;
                case "3":
                    System.out.println("GOOD BYE!");
                    sc.close();
                    break;
                default:
                    System.out.println("I am confused!");
                    break;

            }


        } while (option != "3"); 

        System.out.println(" THankyou for using our platform!");
    }

    public static Employee enterEmployeeDetails() {
        Scanner sc2 = new Scanner(System.in);
        String name = "";
        String age = "";
        String email = "";
        int salary = 0;

        System.out.println("Enter Employee name : ");
        name = sc2.next();

        System.out.println("Enter Employee Email : ");
        email = sc2.next();

        System.out.println("Enter Employee Age : ");
        age = sc2.next();

        System.out.println("Enter Employee Salary : ");
        salary = sc2.nextInt();

        Employee newEmployee = new Employee(name, email, age, salary);

        return newEmployee;

    }

    public static void showAllEmployeeDetails(List<Employee> employeeList) {
        for (Employee employee: employeeList) {

            System.out.println("***************************");

            employee.getEmployeeInfo();

            System.out.println("***************************");
        }
    }
}

