public class App {
    public static void main(String[] args) throws Exception {

        // While Loop!

        // int num = 5;

        // while(num > 0) {
        // System.out.println("Hi!");
        // num--;
        // }

        // int num = 0;
        // while(num != 5) {
        // System.out.println(num);
        // num++;
        // }

        // String val = "";

        // while(val.length() != 10) {
        // System.out.println(val);
        // val += "*";
        // }

        String v = "";
        while (true) {
            if (v.equals("qqq")) {
                break;
            }

            v += "q";
            System.out.println("Hi!");
        }

        // Do While Loop

        // int count = 2;
        // do {
        // System.out.println(count);
        // count--;
        // } while(count >= 3);

        // For Loops
        int value1 = 10;

        for (int i = 0; i < value1; i++) {

            if (i == 4) {

                // This will skip the iteration
                continue;
            }
            System.out.println(i);
        }

        // For Each loop Java

        // let numbers1 = [ 1,2,3,4,5,6,7,8];

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };

        for (int num : numbers) {
            System.out.println("Hi --> " + num);
        }



        // Nested Loops

        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                System.out.println(i + " " + j);
            }
        }




        // Star Patterns Using Loops

        // Triangle pattern from stars 1
        int row = 10;
        for (int i = 0 ; i < row; i++) { // i =  2
            for (int j = 0; j <= i; j++) {  // j = 4
                System.out.print("*"); // *
            }
            System.out.println();
        }



        
        // Triangle pattern from stars Pyramid

        // Outer Loop
        for (int i = 0 ; i < row ; i++) {

            // Spaces
            for (int j = row - i; j > 1 ; j--) {
                System.out.print(" ");
            }   

            for (int j = 0 ; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        

    }

}
