public class App {
    public static void main(String[] args) throws Exception {

        // Array Out Of Bound Exception
        try {
            int numberArray[] = { 20, 40, 60, 80, 100 };
            System.out.println(numberArray[20]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println(e);
            System.out.println("My friend you are trying to access an element outside length");
        } catch (Exception e) {
            System.out.println("Oh jeez, i think there is another type of error");
        } finally {
            System.out.println("I will always work, even if there is error or not");
        }

    }
}
