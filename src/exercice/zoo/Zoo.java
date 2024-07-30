package exercice.zoo;

import java.util.HashSet;
import java.util.Set;

public class Zoo {
    String name;
    Set<Enclosure> enclosureSet = new HashSet<>();

    Zoo(String name) {
        this.name = name;
    }

    void addEnclosure(Enclosure enclosure) {
        enclosureSet.add(enclosure);
    }

    void moveAnimals(Enclosure startEnclosure, Enclosure endEnclosure) {

        //Si les environnements des enclos sont les mêmes, et que le nombre d'animaux est plus petit que la capacité moins ce qui se trouve déjà dans l'enclos donc ajouter.
        if (startEnclosure.env.equals(endEnclosure.env) && startEnclosure.listAnimals.size() < endEnclosure.capacity - endEnclosure.listAnimals.size()) {

         //Pour chaque animal de l'enclos de debut j'ajoute l'animal a l'enclos de fin, et retire de l'enclos de debut.
            for (Animal animal : startEnclosure.listAnimals) {

                endEnclosure.listAnimals.add(animal);
                startEnclosure.listAnimals.remove(animal);

            }
        }
    }
}
