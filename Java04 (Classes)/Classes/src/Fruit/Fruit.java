package Fruit;

public class Fruit {
    // FIELDS/PROPERTIES OF A FRUIT
    public String color; // Default value is null
    public  String name; // default value is null
    public  boolean hasSkin; // default value false
    public int weight; // default value 0
    public  boolean isTasy; // default value false

    // METHODS IN FRUIT CLASS

    // Default Constructor where there are no parameters
    public Fruit() {

    }

    // Parametrized Constructor
    public Fruit(String name, String color, boolean hasSkin, int weight, boolean isTasy) {
        this.name = name;
        this.color = color;
        this.hasSkin = hasSkin;
        this.weight = weight;
        this.isTasy = isTasy;
    }

    public void eat() {
        System.out.println("Eating....");
    }

    public void removeSkin() {
        System.out.println("Peeling the fruit... removed!!");
    }
}
