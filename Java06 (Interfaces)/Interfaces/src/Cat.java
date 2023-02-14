public class Cat implements Animal {
    
    public static int numberOfLegs = 4;

    public static void run() {
        System.out.println("The cat starts running!");

        // We cannot do this since eat function is not static
        // this.eat();

        // This is also correct
        // Cat.sleeping();
        
        // This is also correct
        sleeping();
    }

    
    public static void sleeping() {
        System.out.println("The cat is sleeping!");

    }


    @Override
    final public void eat() {
        System.out.println("Cat is eating!");
    }

    @Override
    public void sound() {
        System.out.println("Cat says meow!");
    }

    @Override
    public void walk() {
        System.out.println("Cat starts walking!");
    }
}
