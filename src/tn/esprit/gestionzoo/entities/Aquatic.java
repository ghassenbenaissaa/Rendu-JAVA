package tn.esprit.gestionzoo.entities;
import java.util.Objects;

public sealed abstract class Aquatic extends Animal permits Dolphin, Penguin{
    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(){
        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() +"Habitat :"+this.habitat;
    }

    public abstract void swim();
    public boolean equals(Object obj) {
        if (obj == null) return false; // Si c'est la même instance, elles sont égales
        if (obj == this) return true; // Si obj est nul ou n'est pas une instance d'Aquatic, elles ne sont pas égales
        if (obj instanceof Aquatic aquatic) {
            // Comparaison des propriétés : nom, âge et habitat
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }
}
