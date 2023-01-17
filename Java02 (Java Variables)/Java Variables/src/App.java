
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



        // Arithmetic Operations

        // + 
        int number1 = 20;
        int number2 = 40;

        int total = number1 + number2;

        System.out.println("Total is : " + total);

        // -
        int subtractedValue = number2 - number1;
        System.out.println("Output after subtraction is : " + subtractedValue);

        // /
        int dividedValue = number2 / number1;
        System.out.println("Output after division is : " + dividedValue);

        // /
        int multipliedValue = number2 * number1;
        System.out.println("Output after Multiplication is : " + multipliedValue);

         // %
         int remainder = number2 % number1;
         System.out.println("Output after remainder is : " + remainder);
 
         // ++
        number1++;
        System.out.println("Output after increment is : " + number1);
 
        // --
        number2--;
        System.out.println("Output after decrement is : " + number2);




        
        // Asignment Operations
        int a = 4;

        // a+= 10; // a = a + 10;

        System.out.println(a);


        // a-= 4; // a = a - 10;
        // a/= 4; // a = a / 10;
        // a*= 4; // a = a  * 10;
        // a %= 3;  // a = a % 3;


        // Logical Operators

        // int danielAge = 25;

        // if (danielAge < 18 && danielAge < 60 ) {
        //     System.out.println("You are not eligible for Retirment Funds!");
        // }

        int n1 = 2;
        int n2 = 20;

        if (n1 > 5 && n2 > 15) {
            System.out.println("Both Conditions satisfy!");
        } else {
            System.out.println("Something Wrong!");
        }

        // && Operator
        // true && true --> true
        // true && false -->  false
        // false && true --> false
        // false && false --> false


        // || Operator
        
        
        int danielAge = 100;

        if (danielAge < 18 || danielAge < 60 ) {
            System.out.println("I went in if condition");
        } else {
            System.out.println("I went in the else condition");
        }

        // true || true --> true
        // true || false -->  true
        // false || true --> true
        // false || false --> false


        int a1 = 10;
        int b1 = 11;
        int c1 = 12;

        // Multiple && operations
        if (a1 == 10 && b1 == 11 && c1 == 12) {
            System.out.println("All the conditions satisfy!");
        }



        // Conditional Statements

        int marks = 75;

        // if (marks > 60 && marks <= 70) {
        //     System.out.println("You got a C grade");
        // } else if (marks > 70 && marks <= 80) {
        //     System.out.println("You got a B grade");
        // } else if (marks > 80) {
        //     System.out.println("You got a A grade");
        // } else {
        //     System.out.println("Oops You failed!");
        // }

        // Ternary Operators
        // condition ? Expression 1 (If) : Expression 2 (else)
    
        String output = (marks > 60 && marks <= 70) ? "You got a C grade" : (marks > 70 && marks <= 80) ? "You got a B grade" : (marks > 80) ? "You got a A grade" :"Oops You failed!"; 

        System.out.println(output);


    }
}
