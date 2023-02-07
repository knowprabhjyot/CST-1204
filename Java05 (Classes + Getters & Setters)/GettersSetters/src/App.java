import Car.Car;

public class App {
    public static void main(String[] args) throws Exception {
      
        Car bmw = new Car();
        bmw.getCarInformation();

        Car ford = new Car("Explore", "Ford", 2022, 0, "Prabh", true);

        System.out.println("******************************");

        ford.setDriverName("Daniel");
        
        ford.getCarInformation();
    }
}
