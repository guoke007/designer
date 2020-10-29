package com.designer.factory.abstractFactory;

import com.designer.factory.abstractFactory.bean.pizza.AbstractPizza;
import com.designer.factory.abstractFactory.bean.pizza.impl.CheesePizza;

/**
 * @author: lh
 * @date: 2020-10-28 19:19
 * @version: 1.0
 * @description: 纽约披萨店
 */
public class NewYorkPizzaStore extends AbstractPizzaStore {
    @Override
    protected AbstractPizza createPizza(String type) {
        AbstractIngredientFactory factory = new NewYorkIngredientFactory();
        if ("cheese".equals(type)) {
            AbstractPizza pizza = new CheesePizza(factory);
            pizza.setName("New York style cheese pizza");
            return pizza;
        }
        return null;
    }
}
