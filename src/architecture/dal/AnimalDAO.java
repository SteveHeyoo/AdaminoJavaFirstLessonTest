/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.dal;

import architecture.be.AAnimal;
import architecture.be.Cat;
import architecture.be.Dog;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    private final List<AAnimal> animals;

    public AnimalDAO() {
        animals = new ArrayList<>();
        fillListWithAnimals();

    }

    private void fillListWithAnimals() {
        animals.add(new Dog("Fido"));
        animals.add(new Dog("Pluto"));
        animals.add(new Cat("Kisser"));
        animals.add(new Cat("Meowth"));
    }

    public List<AAnimal> getAnimals() {
        return animals;
    }

}
