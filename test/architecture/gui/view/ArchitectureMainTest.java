/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.gui.view;

import architecture.be.AAnimal;
import architecture.gui.model.AnimalModel;
import java.util.List;
import org.junit.*;

/**
 *
 * @author gta1
 */
public class ArchitectureMainTest {

    @Test
    public void testWeHaveAnimalsInModel() {
        //Arrange
        AnimalModel instance = new AnimalModel();
        //Add
        List<AAnimal> animals = instance.getAnimals();
        //Assert
        Assert.assertTrue(!animals.isEmpty());
    }

}
