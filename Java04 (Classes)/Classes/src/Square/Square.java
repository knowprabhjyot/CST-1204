package Square;

public class Square {
    public int side;


    // Default Constructor
    public Square() {

    }

    // Paramaterized Constructor
    public Square(int side) {
        this.side = side;
    }

    // Void means it doesn't return anything
    // int means it returns an integer
    // String means it returns a string
    public int getArea() {
        return this.side * this.side;
    }

    public int getParameter() {
        return 4 * this.side;
    }
}
