public class Coffee {
    private String coffeeName;
    private int numberOfExpressoShots;
    private double totalPrice;

    public Coffee(String coffeeName, int numberOfExpressoShots) {
        this.coffeeName = coffeeName;
        this.numberOfExpressoShots = numberOfExpressoShots;
        this.totalPrice = (double) numberOfExpressoShots; // this means for 1 shot its 1 $
    }

    public void addExpressoShots() {
        this.numberOfExpressoShots++;
        this.totalPrice += 1;
    }

    public void removeExpressoShots() throws MyCustomException {

        if (this.totalPrice < 0) {
            throw new MyCustomException("Negative Balance");
        }

        this.numberOfExpressoShots--;
        this.totalPrice -= 1;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public int getNumberOfExpressoShots() {
        return numberOfExpressoShots;
    }

    public void setNumberOfExpressoShots(int numberOfExpressoShots) {
        this.numberOfExpressoShots = numberOfExpressoShots;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
