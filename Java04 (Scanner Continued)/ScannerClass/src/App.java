import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner is a class
        Scanner sc = new Scanner(System.in);

        // INPUT AS INTEGER **************

        // System.out.println("Please enter your age to check eligibility for clubbing ? ");

        // int age = sc.nextInt();

        // if (age > 21) {
        //     System.out.println("You are eligible!");
        // } else {
        //     System.out.println("You are not eligible!");

        // }


        // INPUT AS A STRING **************

        // System.out.println("Please enter your Full Name!");
        // // String fullName = sc.next();
        // String fullName = sc.nextLine();

        // if (fullName.length() < 5) {
        //     System.out.println("Please enter your full name bigger than 5 characters : " + fullName);
        // } else {
        //     System.out.println("You entered the right name! : " + fullName);
        // }



        // STRING FORMATTING *****************************


        // System.out.println(Math.PI);
        // System.out.printf("%10.1f", Math.PI);


        // _ _ _ _ _ _ _ _ 3 . 1

        // System.out.printf("%6.1f", 20.402020);

        System.out.printf("%3d%20d", 100, 200);

        System.out.println();
        // With  a negative flag

        System.out.printf("%-20.2f", Math.PI);
    }
}
