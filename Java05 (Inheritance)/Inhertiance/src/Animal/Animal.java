package Animal;

public class Animal {
    
    private int height;
    private double weight;
    private String animalType;


    
    public Animal(int height, double weight, String animalType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
    }



    public Animal() {
        this.animalType = "Not Defined / Unknown";
        this.height = 0;
        this.weight = 0;
    }



    public int getHeight() {
        return height;
    }



    public void setHeight(int height) {
        this.height = height;
    }



    public double getWeight() {
        return weight;
    }



    public void setWeight(double weight) {
        this.weight = weight;
    }



    public String getAnimalType() {
        return animalType;
    }



    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    
}
