package com.designer.factory.simple;

import com.designer.factory.simple.bean.Pizza;

/**
 * @author: lh
 * @date: 2020-10-28 14:09
 * @version: 1.0
 * @description: pizza店类
 */
public class PizzaStore {

    private SimpleFactory simpleFactory;

    public PizzaStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Pizza orderPizza(String orderType) {
        Pizza pizza = this.simpleFactory.createPizza(orderType);
        if (pizza == null) {
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
