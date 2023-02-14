public class App {
    public static void main(String[] args) throws Exception {

        // Cannot do this since its an interface
        // Animal a = new Animal();

        Cat persian = new Cat();
        persian.eat();
        persian.walk();
        persian.sound();

        Cat.run();

       System.out.println(Cat.numberOfLegs);
    }
}
