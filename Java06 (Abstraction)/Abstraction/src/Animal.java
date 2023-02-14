abstract public class Animal {
    
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    // Abstract Methods
    public abstract void sound();

    // Regular Methods

    public void walking() {
        System.out.println("The animal is walking whose name is : " + this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
