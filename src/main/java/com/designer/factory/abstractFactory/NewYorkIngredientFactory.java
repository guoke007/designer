package com.designer.factory.abstractFactory;

import com.designer.factory.abstractFactory.bean.ingredient.*;
import com.designer.factory.abstractFactory.bean.ingredient.impl.*;

/**
 * @author: lh
 * @date: 2020-10-29 20:23
 * @version: 1.0
 * @description: 纽约的原料工厂
 */
public class NewYorkIngredientFactory extends AbstractIngredientFactory {
    @Override
    public Dough createDough() {
        return new NewYorkDough();
    }

    @Override
    public Sauce createSauce() {
        return new NewYorkSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NewYorkCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NewYorkPepperoni();
    }

    @Override
    public Clams createClam() {
        return new NewYorkClam();
    }
}
