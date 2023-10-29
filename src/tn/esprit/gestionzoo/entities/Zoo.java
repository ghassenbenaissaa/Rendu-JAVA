package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exception.ZooFullException;

public class Zoo {

    private final Animal [] animals;
    private final Aquatic [] aquaticAnimals=new Aquatic[10];
    private String name;
    private String city;
    private final int NBR_CAGES= 2;
    static int nbrTotalAnimals= 0;
    private int nbrAnimals;
    private int nbrAnimalsAq= 0;

    public Animal[] getAnimals() {
        return animals;
    }
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
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city= city;
    }
    public int getNBR_CAGES(){
        return NBR_CAGES;
    }
    public int getNbrTotalAnimals(){
        return nbrTotalAnimals;
    }

    public Zoo(){

        animals=new Animal[NBR_CAGES];
    }

    public Zoo(String name, String city){

        animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;

    }

    public void displayZoo(){
        System.out.println("Name: "+ name + ",");
    }

    public void addAquaticAnimal(Aquatic aquatic){
        aquaticAnimals[ nbrAnimalsAq]= aquatic;
        nbrAnimalsAq++;
    }
    public void addAnimal(Animal animal) throws ZooFullException{
        //if (searchAnimal(animal) != -1)
           // return false;
        if( !isZooFull() ) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            nbrTotalAnimals++;
        } else{
            throw new ZooFullException("Zoo full");
        }
        //return false;
    }

    public void displayAnimals(){
        System.out.println("liste des animaux de "+ name + ":");
        for (int i = 0; i< nbrAnimals; i++){
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal){
        int index = -1;
        for (int i =0; i<nbrAnimals; i++){
            if (animal.getName().equals(animals[i].getName())){
                return i;
            }
        }
        return index;
    }

    public boolean removeAnimal(Animal animal){
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1){
            return false;
        }
        for (int i = indexAnimal; i< nbrAnimals; i++){
            animals[i] = animals[i+1];
        }
        animals[nbrAnimals]= null;
        nbrAnimals--;
        return true;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "City: " + city + "\n"
                + "Nombre de cage: " + NBR_CAGES;
    }

    public boolean isZooFull(){
        return NBR_CAGES==nbrAnimals;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals<z2.nbrAnimals)
            return z2;
        else if (z1.nbrAnimals>z2.nbrAnimals)
            return z1;
        else {
            System.out.println("les zoo sont égaux");
            return z1;
        }
    }

    boolean  nomZoo(Zoo z){
        return name.isBlank();
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0F; // Initialisation de la profondeur maximale à 0

        for (int i = 0; i < nbrAnimalsAq; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {

                if (maxDepth <  penguin.getSwimmingDepth()) {
                    maxDepth =  penguin.getSwimmingDepth(); // Mettre à jour la profondeur maximale si nécessaire
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrPingouins = 0;
        int nbrDolphin = 0;
        for (int i = 0; i < nbrAnimalsAq; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                nbrPingouins = nbrPingouins + 1;
            }
            if (aquaticAnimals[i] instanceof Dolphin dolphin) {
                nbrDolphin = nbrDolphin + 1;
            }
        }
        System.out.println("Le nombre des dauphins: " + nbrDolphin);
        System.out.println("Le nombre des pingouins: " + nbrPingouins);
    }

}
