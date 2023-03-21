import java.util.List;
import java.util.Scanner;

import controller.UserController;
import dao.UserDAO;
import dto.User;

public class App {
    public static void main(String[] args) throws Exception {
        showUserMenu();
    }

    public static void showUserMenu() {
        Scanner sc = new Scanner(System.in);
        UserController userController = new UserController();

        String userSelected = "";

        do {
            System.out.println("**************************************");
            System.out.println("1: Register a user");
            System.out.println("2: Get All Users");
            System.out.println("3: Delete a User");
            System.out.println("4: Update a user");
            System.out.println("5: EXIT");
            System.out.println("**************************************");

            userSelected = sc.nextLine();

            switch (userSelected) {
                case "1":
                System.out.println("Enter User Name: ");
                String userName = sc.nextLine();

                System.out.println("Enter User Email: ");
                String userEmail = sc.nextLine();

                System.out.println("Enter User Password: ");
                String userPassword = sc.nextLine();

                System.out.println("Enter User age: ");
                int userAge = sc.nextInt();

                User user = new User(userName, userEmail, userPassword, userAge);
                userController.insert(user);
                break;

                case "2": 
                System.out.println("---------------------");
                displayUserList(userController.getUserList());
                System.out.println("---------------------");
                break;

                case "3":

                System.out.println("---------------------");
                displayUserList(userController.getUserList());
                System.out.println("---------------------");
                
                System.out.println("Enter User Id you want to delete : ");
                int id = sc.nextInt();
                userController.delete(id);

                System.out.println("------AFTER DELETING---------");
                displayUserList(userController.getUserList());
                System.out.println("---------------------");


                // ASSIGNMENT IS
                // Implemenet USER BY ID
                // Implement Update User
                // Implement getUserBasedByIDandPassword
            }
        } while (!userSelected.equals("5")); 
        sc.close();
    }


 public static void displayUserList(List<User> users) {
    for (User user: users) {
        user.getUserInfo();
    }
 }
}
