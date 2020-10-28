package com.designer.factory.method.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lh
 * @date: 2020-10-28 19:29
 * @version: 1.0
 * @description: 披萨类
 */
public abstract class AbstractPizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    /**
     *默认的准备工作
     *
     **/
    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("Tossing dough.....");
        System.out.println("adding sauce...");
        for (String topping : toppings) {
            System.out.println(topping);
        }
    }

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
}
