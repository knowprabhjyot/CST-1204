package Car;

public class Car {
    
    public String model;
    public String make;
    public int year;
    public int speed;
    public boolean isSedan;

    // Default Constructor
    public Car() {

    }


    // Parameterized Constructor
    public Car(String model, String make, int year, int speed, boolean isSedan) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.speed = speed;
        this.isSedan = isSedan;
    }

    public void accelerate() {
        this.speed += 10;
    }

    public void pullHandbrake() {
        System.out.println("Pulling Handbrake....! Wufff!");
        this.speed = 0;
    }

    public void deAccelerate() {
        this.speed -= 10;
    }



}
