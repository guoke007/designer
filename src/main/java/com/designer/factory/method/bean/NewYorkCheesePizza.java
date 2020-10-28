package com.designer.factory.method.bean;

/**
 * @author: lh
 * @date: 2020-10-28 19:38
 * @version: 1.0
 * @description: 纽约芝士披萨
 */
public class NewYorkCheesePizza extends AbstractPizza {
    public NewYorkCheesePizza() {
        name = "NewYork style sauce and cheese pizza";
        dough = "thin crust dough";
        sauce = "marinara sauce";
        toppings.add("grated Reggiano cheese");
    }
}
