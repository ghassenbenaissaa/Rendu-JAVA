package tn.esprit.gestionzoo.entities;

public final class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public String toString() {
        return super.toString() +"SwimmingSpeed :"+this.swimmingSpeed;
    }

    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}
