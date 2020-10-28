package com.designer.factory.method;

import com.designer.factory.method.bean.AbstractPizza;
import com.designer.factory.method.bean.NewYorkCheesePizza;

/**
 * @author: lh
 * @date: 2020-10-28 19:19
 * @version: 1.0
 * @description: 纽约披萨店
 */
public class NewYorkPizzaStore extends AbstractPizzaStore {
    @Override
    protected AbstractPizza createPizza(String type) {
        if("cheese".equals(type)){
            return new NewYorkCheesePizza();
        }
        return null;
    }
}
