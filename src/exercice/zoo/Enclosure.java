package exercice.zoo;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    String name;
    String env;
    List<Animal> listAnimals = new ArrayList<Animal>();
    int capacity;

    //Constructors
    Enclosure() {
        this.capacity = 10;
    }

    Enclosure(String name, String env, int capacity) {
        this.name = name;
        this.env = env;
        this.capacity = capacity;
    }

    void addAnimal(Animal animal) {
        if (animal.envType.equals(this.env) && listAnimals.size() < capacity) {
            this.listAnimals.add(animal);
            System.out.printf("L'animal %s a été ajouté à l'enclos %s \n", animal.name, this.name);
        }
        System.out.printf("l'animal ne peux pas être ajouter a un enclos avec un different environnement \n");
    }

    void moveAnimal(Animal animal, Enclosure enclosure){
        if(animal.envType.equals(enclosure.env) && enclosure.listAnimals.size() < enclosure.capacity){
            this.listAnimals.remove(animal);
            enclosure.listAnimals.add(animal);
        }
    }

}
