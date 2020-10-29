package com.designer.factory.abstractFactory.bean.pizza;

import com.designer.factory.abstractFactory.bean.ingredient.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lh
 * @date: 2020-10-28 19:29
 * @version: 1.0
 * @description: 披萨类
 */
public abstract class AbstractPizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;
    /**
     *默认的准备工作
     *
     **/
    public abstract void prepare();

    public void bake() {
        System.out.println("bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
