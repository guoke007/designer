package com.designer.factory.simple;

import com.designer.factory.simple.bean.CheesePizza;
import com.designer.factory.simple.bean.ChinaPizza;
import com.designer.factory.simple.bean.GreekPizza;
import com.designer.factory.simple.bean.Pizza;

/**
 * @author: lh
 * @date: 2020-10-27 17:12
 * @version: 1.0
 * @description: 简单工厂模式
 *
 *
 *
 */
public class SimpleFactory {

    public  Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();

        } else if (orderType.equals("China")) {
            pizza = new ChinaPizza();
        }
        return pizza;
    }
}
