package com.designer.factory.abstractFactory;


import com.designer.factory.abstractFactory.bean.pizza.AbstractPizza;

/**
 * @author: lh
 * @date: 2020-10-28 19:15
 * @version: 1.0
 * @description: 抽象pizza店
 */
public abstract class AbstractPizzaStore {

    /**
     * 订购披萨
     *
     * @param type 披萨类型
     * @return com.designer.factory.simple.bean.AbstractPizza
     **/
    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 制造pizza方法
     *
     * @param type pizza的种类
     * @return com.designer.factory.simple.bean.AbstractPizza
     **/
    protected abstract AbstractPizza createPizza(String type);
}
