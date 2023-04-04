package Animal;

// Inheritance here done using extends
public class Dog extends Animal {

    private int lifeSpan;

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    // Parametrized Constructors
    public Dog(String name, int numberOfLegs, int lifeSpan) {
        super(name, numberOfLegs);
        this.lifeSpan = lifeSpan;
    }

    // Defaul Constructor
    public Dog() {
        super("Ja", 2);
        this.lifeSpan = 15;
    }

    @Override
    public void speaks() {
        System.out.println("Wuff Wuff");
    }
}
