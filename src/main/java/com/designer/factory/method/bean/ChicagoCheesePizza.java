package com.designer.factory.method.bean;

/**
 * @author: lh
 * @date: 2020-10-28 19:45
 * @version: 1.0
 * @description: 芝加哥芝士披萨
 */
public class ChicagoCheesePizza extends AbstractPizza {
    public ChicagoCheesePizza() {
        name = "Chicago style deep dish cheese pizza";
        dough = "extra thick crust dough";
        sauce = "plum tomato sauce";
        toppings.add("shredded mozzarella cheese");
    }
    @Override
    public void cut(){
        System.out.println("cutting the pizza into square slices");
    }
}
