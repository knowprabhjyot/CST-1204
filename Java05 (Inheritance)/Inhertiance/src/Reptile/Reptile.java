package Reptile;

import Animal.Animal;

// Inheritance
public class Reptile extends Animal {
    private String skinType;
    private String eggType;

    public Reptile() {

    }

    public Reptile(int height, double weight, String animalType, String skinType, String eggType) {
        super(height, weight, animalType); // What is this ? We have to invoke the parent class's constructor by using super method
        this.skinType = skinType;
        this.eggType = eggType;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    public void getReptileInformation() {
        System.out.println(" Weight of Reptile :" + this.getWeight() );
        System.out.println(" Height of Reptile :" + this.getHeight() );
        System.out.println(" SkinType of Reptile :" + this.getSkinType() );
        System.out.println(" Egg Type of Reptile :" + this.getEggType() );

    }
}
