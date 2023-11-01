package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.enums.Food;

public final class Penguin extends Aquatic{
    private float swimmingDepth;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public String toString() {
        return super.toString() +"SwimmingDepth :"+this.swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This Penguin is swimming.");
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("The penguin " + getName() + " is eating " + meat);
    }
}
