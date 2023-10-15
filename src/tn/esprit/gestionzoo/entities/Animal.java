package tn.esprit.gestionzoo.entities;
public class Animal {


    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if (name.isBlank())
            System.out.println("le nom est vide");
        else {
            this.name= name;
        }
    }
    public int getAge() {return age;}
    public void setAge(int age) {
        if (age < 0)
            System.out.println("l'age ne peut pas étre negative");
        else {
            this.age = age;
        }
    }
    public String getFamily() {return family;}
    public void setFamily(String family) {
            this.family = family;
    }
    public boolean getIsMammal() {return isMammal;}
    public void setIsMammal(boolean isMammal) {
            this.isMammal = isMammal;
    }
    public Animal(){}

    public Animal(String family, String name, int age, boolean isMammal){
        this.family= family;
        this.name= name;
        this.age= age;
        this.isMammal= isMammal;
    }

    @Override
    public String toString() {
        return "Animal:"+ "\n"
                +"name: "+ name + "\n"
                +"Family: "+ family + "\n"
                +"age: "+ getAge() + "\n"
                +"Mammal: "+ isMammal;
    }
}
