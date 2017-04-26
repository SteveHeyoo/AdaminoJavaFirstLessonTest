/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.gui.model;

import architecture.be.AAnimal;
import architecture.bll.AnimalManager;
import java.util.ArrayList;
import java.util.List;

public class AnimalModel {

    private final AnimalManager animalManager;

    private final List<AAnimal> animals;

    public AnimalModel() {

        animalManager = new AnimalManager();

        animals = new ArrayList<>(animalManager.getAnimals());
    }

    public List<AAnimal> getAnimals() {
        return animals;
    }

}
