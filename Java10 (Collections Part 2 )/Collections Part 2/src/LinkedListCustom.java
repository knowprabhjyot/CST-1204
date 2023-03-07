public class LinkedListCustom {
    // This is the starting point of Linked List
    private Node head;
    public LinkedListCustom() {

    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) { // If nothign was there in linked list
            head = newNode; // null, [10 | A2 ] -->  [20 | A3 ] -->     [30 | null]   null
              } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.print(current.getData());
            System.out.print("-->");
            current = current.next;
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}

// [10 | Node@5acf9800] -->

                        // Current
// Head