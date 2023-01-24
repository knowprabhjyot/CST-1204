
// import java.util.Scanner;
// import java.util.Random;

import java.util.*; // By writing * you are saying import all the classes inside the util package.

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in); // System.in is a way to convey that we want to take an input using input sttream


        // System.in --> This means we are trying to take input from outside the program
        // System.out --> This means we are trying to give output from inside the program

        // System.out.println("Please enter your name : ");

        // String userName = sc.next(); // It is used to take an input from the user in the form of strings


        // System.out.println("Please enter your age : ");

        // int userAge = sc.nextInt(); // Nextint is used for storing integer values
        // System.out.println("You entered your name as : " + userName + " and your age is : " + userAge);


        Random random = new Random(); // This is providing us an instance or an object which is coming from Random Class, 

        int randomNumber = random.nextInt(20); // Here you can pass a upper bound uptil which the random number will be produced

        double randomNumberDouble = random.nextDouble(25); // This will produce a double value randomly

        System.out.println(randomNumber);

        System.out.println(randomNumberDouble);


    }
}
