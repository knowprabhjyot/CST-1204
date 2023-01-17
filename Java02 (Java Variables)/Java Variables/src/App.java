
// Classes are blueprints, which wrap your entire code
// Public means accessible to all
// App means name of the class, for example it can also be People
public class App {

    // Method whose name is main
    // It is also of type public, which means accessible to all
    // void , this void means this method doesn't return anything
    // Exception its a situation which gets executed when your program breaks
    public static void main(String[] args) throws Exception {

        // This is for printing on the consoles, just like console.log in javascript
        System.out.println("Hello, World!");

        // This variable is of type string
        String userName = "Prabh";


        // This variable is of type integer
        int age = 28;

        // We are concatenating strings
        System.out.println(userName + " is " + age + " years old");


        boolean isCool = true;


        //  Implicit TypeCasting
        short num = 20;

        int num2 = num;

        System.out.println(num2);

        //  Explicit TypeCasting
        int num3 = 40;

        // short num4 = num3; // This will give error of Mismatch

        // We can fix it by doing typecasting explicitly
        short num4 = (short) num3;

        System.out.println(num4);

    }
}
