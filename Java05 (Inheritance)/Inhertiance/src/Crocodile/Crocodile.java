package Crocodile;

import Reptile.Reptile;

// Animal --> Reptile --> Crocodile
public class Crocodile extends Reptile {
    private boolean hasTail;

    public Crocodile() {
    }

 

    public Crocodile(int height, double weight, String animalType, String skinType, String eggType, boolean hasTail) {
        super(height, weight, animalType, skinType, eggType);
        this.hasTail = hasTail;
    }

    public boolean isHasTail() {
        return hasTail;
    }
    
    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
    
    // Overriding the method that also existed in parent class

    @Override
    public void getReptileInformation() {
        System.out.println(" The crocodile I created has a tail ? " + this.isHasTail());
    }
}
