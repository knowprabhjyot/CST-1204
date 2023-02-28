public class App {
    public static void main(String[] args) throws Exception {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }

    public static void checkAge(int age) throws ArithmeticException, NullPointerException, IndexOutOfBoundsException {
        if (age < 18) {
            throw new ArithmeticException("Age must be greater than 18");
        } else {
            System.out.println("Age is accepted");
        }
    }
}
