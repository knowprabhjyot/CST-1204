import Car.Car;
import Fruit.Fruit;
import Square.Square;

public class App {
    public static void main(String[] args) throws Exception {
       // Make use of New keyword!

       Fruit apple = new Fruit(); // So here the default Constructor is being used.

      // Here the parameterized constructor is used.
       Fruit mango = new Fruit("Mango", "yellow", true, 200, true);

       Square square1 = new Square(20);

       System.out.println("Area of Square : " + square1.getArea());
       System.out.println("Parameter of Square : " + square1.getParameter());


       // apple here is an object which we created from Fruit Class

       // So we are calling the method here after creating an instance
       apple.removeSkin();
       
       apple.eat();

       mango.eat();

       System.out.println(apple.name);
       System.out.println(mango.color); // The value will be different


       Car ferrari = new Car("Ferrari123", "Ferarri", 2022, 0, true);

       System.out.println("Current Speed Before acceleration : " + ferrari.speed);

       ferrari.accelerate();
       ferrari.accelerate();
       ferrari.accelerate();
       ferrari.accelerate();

       System.out.println("Current Speed After acceleration : " + ferrari.speed);

       ferrari.pullHandbrake();


       System.out.println("Current Speed After Handbake : " + ferrari.speed);
    }
}
