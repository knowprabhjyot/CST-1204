package Animal;

public class Cat extends Animal {

    private boolean isFriendly;
    
    // Default Constructor
    public Cat() {
        super("MC", 4);
    }

    // Parameterized
    public Cat(String name, int numberOfLegs, boolean isFriendly) {
        super(name, numberOfLegs);
        this.isFriendly = isFriendly;
    }

    @Override
    public void speaks() {
        System.out.println("Meow Meow");
    }
}
