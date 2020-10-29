package com.designer.factory.abstractFactory.bean.pizza.impl;

import com.designer.factory.abstractFactory.AbstractIngredientFactory;
import com.designer.factory.abstractFactory.bean.pizza.AbstractPizza;

/**
 * @author: lh
 * @date: 2020-10-29 20:35
 * @version: 1.0
 * @description: 蛤蜊披萨
 */
public class ClamPizza extends AbstractPizza {
    private AbstractIngredientFactory factory;

    public ClamPizza(AbstractIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clam = factory.createClam();
    }
}
