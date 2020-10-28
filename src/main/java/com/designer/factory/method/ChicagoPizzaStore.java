package com.designer.factory.method;


import com.designer.factory.method.bean.AbstractPizza;
import com.designer.factory.method.bean.ChicagoCheesePizza;

/**
 * @author: lh
 * @date: 2020-10-28 19:20
 * @version: 1.0
 * @description: 芝加哥披萨店
 */
public class ChicagoPizzaStore extends AbstractPizzaStore {
    @Override
    public AbstractPizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoCheesePizza();
        }
        return null;
    }
}
