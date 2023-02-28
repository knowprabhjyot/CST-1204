public class App {
    public static void main(String[] args) throws Exception {
        Coffee myPersonalizedCoffee= new Coffee("Latte", 2);
        // myPersonalizedCoffee.addExpressoShots();

        try {
            myPersonalizedCoffee.removeExpressoShots();
            myPersonalizedCoffee.removeExpressoShots();
            myPersonalizedCoffee.removeExpressoShots();
            myPersonalizedCoffee.removeExpressoShots();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println(myPersonalizedCoffee.getTotalPrice());
    }
}
