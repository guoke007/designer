package com.designer.factory.abstractFactory.bean.pizza.impl;

import com.designer.factory.abstractFactory.AbstractIngredientFactory;
import com.designer.factory.abstractFactory.bean.pizza.AbstractPizza;

/**
 * @author: lh
 * @date: 2020-10-29 20:31
 * @version: 1.0
 * @description: 芝士披萨
 */
public class CheesePizza extends AbstractPizza {

    private AbstractIngredientFactory factory;

    public CheesePizza(AbstractIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}
