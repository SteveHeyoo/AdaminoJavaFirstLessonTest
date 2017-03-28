/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.gui.view;

import architecture.be.AAnimal;
import architecture.gui.model.AnimalModel;

public class ArchitectureMain {

    public static void main(String[] args) {
        /*
         * 1. Create new model called AnimalModel
         *
         * 2. This model should be able to hold a collection of animals
         * We need at least a Cat and a Dog!
         *
         * 3. The animals should implement the interface called IAnimalActions
         *
         * 4. Create a mock AnimalDAO which returns a collection of Cats and
         * Dogs
         * to the model when it is created!
         */

        //Instatiate a new AnimalModel here
        AnimalModel animalModel = new AnimalModel();

        //For each animal in the models collection called animals, call makeSound();
        for (AAnimal animal : animalModel.getAnimals()) {
            animal.makeSound();
        }
    }

}
