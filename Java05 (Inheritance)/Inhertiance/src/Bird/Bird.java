package Bird;

import Animal.Animal;

public class Bird extends Animal {
    private boolean hasFeathers, canFly;

    public Bird(int height, double weight, String animalType, boolean hasFeathers, boolean canFly) {
        super(height, weight, animalType);
        this.hasFeathers = hasFeathers;
        this.canFly = canFly;
    }

    public Bird() {
       
    }

    public boolean isHasFeathers() {
        return hasFeathers;
    }

    public void setHasFeathers(boolean hasFeathers) {
        this.hasFeathers = hasFeathers;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    
    public void getBirdInformation() {
        System.out.println(" Weight of Bird :" + this.getWeight() );
        System.out.println(" Height of Bird :" + this.getHeight() );
        System.out.println(" Can bird Fly :" + this.isCanFly() );
        System.out.println(" Does bird have feather :" + this.isHasFeathers() );
    }
    
}
