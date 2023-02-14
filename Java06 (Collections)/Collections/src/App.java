import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        

        // Arrays using the regular way
        String[] veggies = {"Carrot", "Celery", "Onions"}; // It has contagious block of memory

        System.out.println(veggies);

        // This prints all the vegetables
        displayVeggies(veggies);


        // Arrays using ArrayList
        List<String> fruitsList = new ArrayList<>(); // This is dynamic array
        List<String> smallFruitsList = new ArrayList<>();

        smallFruitsList.add("grapes");
        smallFruitsList.add("cherry");
        
        System.out.println("Is the fruits basket empty ? " + fruitsList.isEmpty());


        // Directly add elements in the last index
        fruitsList.add("Mango");
        fruitsList.add("Apple");
        fruitsList.add("Oranges");

        // Adding elements at the given index
        fruitsList.add(1, "Kiwi");

        fruitsList.addAll(smallFruitsList);

        System.out.println(fruitsList);

        System.out.println("Is the fruits basket empty ? " + fruitsList.isEmpty());

        displayFruits(fruitsList);
        
    }

    public static void displayFruits(List<String> fruits) {
        for (String fruitItem: fruits) {
            System.out.println("Fruit : " + fruitItem);
        }
    }

    public static void displayVeggies(String[] veggies) {
        for (String veggieItem: veggies) {
            System.out.println("Veggies : " + veggieItem);
        }
    }

}
