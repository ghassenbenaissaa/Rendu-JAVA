package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exception.InvalidAgeException;
import tn.esprit.gestionzoo.exception.ZooFullException;
import tn.esprit.gestionzoo.entities.enums.Food;

public class Main {
    public static void main(String[] args){
        Animal lion = new Animal();
        lion.setName("Sakalo");
        try{
        lion.setAge(-1);}
        catch (InvalidAgeException m){
            System.out.println(m.getMessage());
        }
        lion.setFamily("cats");
        lion.setIsMammal(true);
        System.out.println(lion.getName());

        Animal dog = new Animal("canine", "snoopy", 2 , true);
        Animal dog2 = new Animal("Berget", "Rex", 1 , true);

        Zoo myZoo = new Zoo("wildlife city", "Ariana");
        Zoo myZoo2 = new Zoo("Tunis city", "Ariana");

        myZoo.displayZoo();

        System.out.println("---------------------------Prosit1");
        System.out.println(myZoo.toString());
        System.out.println(dog.toString());

        System.out.println("---------------------------Prosit2");
        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(dog);
            myZoo.addAnimal(dog2);

        } catch (ZooFullException e){
            System.out.println(e.getMessage());
        }
        //myZoo.displayAnimals();

        //System.out.println(myZoo.searchAnimal(dog));
        //System.out.println(myZoo.removeAnimal(lion));
        //myZoo.displayAnimals();
        //System.out.println(myZoo.removeAnimal(lion));
        //myZoo.displayAnimals();
        System.out.println("--------------------------Prosit3");
        System.out.println(myZoo.isZooFull());
        System.out.println(Zoo.comparerZoo(myZoo,myZoo2));
        //System.out.println(Zoo.nbrTotalAnimals);
        System.out.println("------------------------------------------------Prosit5");
        //Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Dolphin dolphin1 = new Dolphin("familleDauphin", "Dauphin2", 8, true, "Océan", 14.5f);
        //Dolphin dolphin2 = new Dolphin("familleDauphin", "Dauphin2", 8, true, "Océan", 14.5f);
        Dolphin dolphin2 = new Dolphin("familleDauphin", "Dauphin3", 12, true, "Océan", 16.0f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

        //System.out.println(aquatic);
        System.out.println(terrestrial);
        terrestrial.eatPlant(Food.PLANT);
        terrestrial.eatMeat(Food.MEAT);

        System.out.println(dolphin);
        dolphin.eatMeat(Food.MEAT);

        System.out.println(penguin);
        penguin.eatMeat(Food.MEAT);


        System.out.println("------------------------------------------------Prosit6");
        //aquatic.swim();
        dolphin.swim();
        penguin.swim();
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(penguin);
        float maxPenguinDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("Profondeur maximale des pingouins dans le zoo : " + maxPenguinDepth);
        myZoo.displayNumberOfAquaticsByType();

        boolean dauphinsEgaux = dolphin1.equals(dolphin2);

        // Affichez le résultat
        if (dauphinsEgaux) {
            System.out.println("Les dauphins sont identiques.");
        } else {
            System.out.println("Les dauphins ne sont pas identiques.");
        }

        System.out.println("------------------------------------------------Prosit8");

        penguin.eatMeat(Food.MEAT);
        dolphin.eatMeat(Food.MEAT);
        terrestrial.eatPlantAndMeet(Food.BOTH);

        Terrestrial terrestrial2 = new Terrestrial("Rabbits", "Bugs bunny", 2, true, 4);
        terrestrial2.eatPlant(Food.PLANT);
    }
}
