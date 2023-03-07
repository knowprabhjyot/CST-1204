import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // int[] num = {1, 2, 3, 4, 5}; // Static Array

        // // Alternative to it was Dynamic Array
        // List<String> fruitsList = new ArrayList<>();

        // // Default this array  = []

        // fruitsList.add("Apple");

        // // fruitsList = ["Apple"]

        // // Linked List

        // // [] ---> [] --> [] --> []

        // LINKED LIST ****************************************************
        LinkedListCustom list1 = new LinkedListCustom();

        list1.addNode(10);
        list1.addNode(20);
        list1.addNode(30);
        list1.addNode(40);

        list1.printList();

        // This linked list is coming from Java util collections
        LinkedList<String> fruitsList = new LinkedList<>();
        fruitsList.add("Apple");
        fruitsList.add("Mangoes");
        fruitsList.add("Bananas");

        // System.out.println(fruitsList);

        // Loop over a linkedList
        for (String element : fruitsList) {
            System.out.println(element);
        }

        // Removes the last element of linkedlist
        fruitsList.removeLast();



        // STACKS ****************************************************

        Stack<String> books = new Stack<>();

        books.push("Harry Potter 1");
        books.push("Lord of the Rings Part 1");
        books.push("Twilight Saga Part 1");

        // Peeks helps to you get the value from the top of the stack
        String topBook = books.peek();

        System.out.println(topBook);

        String removeTwilight = books.pop();

        System.out.println(removeTwilight);

        String topBook2 = books.peek();

        System.out.println(topBook2 + " After popping!");
        books.pop();
        books.pop();
        System.out.println(books);


        // QUEUE ****************************************************
        Queue<String> queueList = new LinkedList<>();

        queueList.add("First Person");
        queueList.add("Second Person");
        queueList.add("Third Person");

        String peekValue = queueList.peek();

        System.out.println(peekValue);

        queueList.remove();
        queueList.remove();
        queueList.remove();

        System.out.println(queueList);

        System.out.println("Is Queue EMpty ? " + queueList.isEmpty());



    }
}
