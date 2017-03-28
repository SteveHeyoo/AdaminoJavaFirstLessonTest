/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.gui.model;

import architecture.be.AAnimal;
import architecture.bll.AnimalManager;
import java.util.List;

public class AnimalModel {

    private final AnimalManager animalManager;

    public AnimalModel() {

        animalManager = new AnimalManager();
    }

    public List<AAnimal> getAnimals() {
        return animalManager.getAnimals();
    }

}