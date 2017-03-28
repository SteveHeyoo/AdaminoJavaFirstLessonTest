/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.bll;

import architecture.be.AAnimal;
import architecture.dal.AnimalDAO;
import java.util.List;

public class AnimalManager {

    private final AnimalDAO animalDAO;

    public AnimalManager() {
        animalDAO = new AnimalDAO();
    }

    public List<AAnimal> getAnimals() {
        return animalDAO.getAnimals();
    }

}
