package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args){
        Animal lion = new Animal();
        lion.setName("Sakalo");
        lion.setAge(6);
        lion.setFamily("cats");
        lion.setIsMammal(true);
        System.out.println(lion.getName());

        Animal dog = new Animal("canine", "snoopy", 2 , true);

        Zoo myZoo = new Zoo("wildlife city", "Ariana");
        Zoo myZoo2 = new Zoo("Tunis city", "Ariana");

        myZoo.displayZoo();

        System.out.println("---------------------------Prosit1");
        System.out.println(myZoo.toString());
        System.out.println(dog.toString());

        System.out.println("---------------------------Prosit2");
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("--------------------------Prosit3");
        System.out.println(myZoo.isZooFull());
        System.out.println(Zoo.comparerZoo(myZoo,myZoo2));
        //System.out.println(Zoo.nbrTotalAnimals);

    }
}
