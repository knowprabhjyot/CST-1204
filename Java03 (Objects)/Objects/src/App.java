

// Java imports the packages by default like Java.lang


import java.lang.String; // This is already done by java compiler, so we don;t have to do it everytime

public class App {
    public static void main(String[] args) throws Exception {
     
        // New keyword will create an instance
        String str = new String("Hello World!");

        System.out.println(str.length());

        System.out.println(str);


        //***********************  SOME STRING METHODS ************************


        // EQUALS *****

        String student1Name = new String("Daniel");
        String student2Name = new String("Daniel");

        System.out.println(student1Name.equals(student2Name)); // For Comparison


        if (student1Name.equals(student2Name)) {
            System.out.println("Both of the students have similar name!");
        } else {
            System.out.println("Both of them Don't have a similar name");
        }



        // INDEX OF ********

        System.out.println(student1Name.indexOf("Dan")); // 0

        System.out.println(student1Name.indexOf("ni")); // 2

        System.out.println(student1Name.indexOf("l")); // 5

        System.out.println(student1Name.indexOf("mike")); // -1

        System.out.println(student1Name.indexOf("Daniel")); // 0

        // Note - When we are talking about indexes, and if that value doesn't exist, or the index doesn't exist , the output for index is always is going to be -1

        
       // To Upper Case  & Lower Case********

       String name  = new String("Prabh");

       String nameInCaps  = new String("PRABH");

       System.out.println(name.toUpperCase()); // prabh --> PRABH

       System.out.println(nameInCaps.toLowerCase()); // PRABH --> prabh


        //  TRIM ********
        
       String college = new String("         VCC      ");

       System.out.println( "My college is : " +  college.trim() + " which is in Vancouver"); // Trim, it removes the unecessary spaces that are used




       // SubString ***********

       String fruit = new String("Mangoes");

       String extractedFruit = fruit.substring(2, 4); //  So here 4th index value won't be included, however endIndex - 1 is included which is 3
       System.out.println(extractedFruit); // ng
       

       System.out.println(fruit); 

       // Strings are Immutable as well.
    }
}
