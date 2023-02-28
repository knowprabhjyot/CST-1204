import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please enter your age : ");
            int userAge = sc.nextInt();

            System.out.println("Your age is " + userAge);
        } catch (InputMismatchException e) {
            System.out.println("You entered an incorrect input");
        } catch (NullPointerException e) {
            System.out.println("There was a null pointer exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There was a Array out of bound exception");
        } catch (Exception e) {
            System.out.println("Oops there was an error, please try again");
        }

    }
}
