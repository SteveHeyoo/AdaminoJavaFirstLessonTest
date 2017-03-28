/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.be;

import architecture.bll.IAnimalActions;

public abstract class AAnimal implements IAnimalActions {

    private final String mName;

    public AAnimal(String name) {
        this.mName = name;
    }

    public String getName() {
        return mName;
    }

}
