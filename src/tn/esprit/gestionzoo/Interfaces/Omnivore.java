package tn.esprit.gestionzoo.Interfaces;

public interface Omnivore <T> extends Carnivore<T>, Herbivore<T>{
    void eatPlantAndMeet(T food);
}
