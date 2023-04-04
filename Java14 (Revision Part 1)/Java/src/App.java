import java.util.*;

import Animal.Cat;
import Animal.Dog;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your  name!");

        // String name = sc.next();


        // System.out.println("Enter your  age!");

        // int age = sc.nextInt();

        // System.out.println("You entered your name as " + name + " and your age is : " + age);

        Dog husky = new Dog("Husky", 4, 12);

        Dog mm = new Dog();

        System.out.println(mm.getName());

        // Seperations of concerns

        System.out.println(husky.getLifeSpan());


        // CATS

        Cat persianCat = new Cat();

        System.out.println(persianCat.getName());

        Cat ragDoll = new Cat("Ragdoll", 4, true);

        System.out.println(ragDoll.getName());

        ragDoll.speaks();
        
    }
}
