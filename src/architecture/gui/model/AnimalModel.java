/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.gui.model;

import architecture.be.AAnimal;
import architecture.dal.AnimalDAO;
import java.util.List;

public class AnimalModel {

    private final AnimalDAO animalDAO;

    private final List<AAnimal> mAnimals;

    public AnimalModel() {
        animalDAO = new AnimalDAO();
        mAnimals = animalDAO.getAnimals();
    }

    public List<AAnimal> getAnimals() {
        return mAnimals;
    }

}
