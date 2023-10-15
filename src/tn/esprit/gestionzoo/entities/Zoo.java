package tn.esprit.gestionzoo.entities;
public class Zoo {

    private Animal [] animals;
    private String name;
    private String city;
    private final int NBR_CAGES= 25;
    static int nbrTotalAnimals= 0;
    private int nbrAnimals;

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

    public boolean addAnimal(Animal animal){
        if (searchAnimal(animal) != -1){
            return false;
        }
        if( !isZooFull() ){
            animals[nbrAnimals]= animal;
            nbrAnimals++;
            nbrTotalAnimals++;
            return true;
        }else return false;
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
}
