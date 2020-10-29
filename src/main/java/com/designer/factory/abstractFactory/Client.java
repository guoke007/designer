package com.designer.factory.abstractFactory;


import com.designer.factory.abstractFactory.bean.pizza.AbstractPizza;

/**
 * @author: lh
 * @date: 2020-10-29 20:42
 * @version: 1.0
 * @description: 测试客户端，点披萨
 */
public class Client {
    public static void main(String[] args) {
        AbstractPizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        AbstractPizza cheesePizza = newYorkPizzaStore.orderPizza("cheese");
        System.out.println("Jim ordered a  " + cheesePizza.getName());

    }
}
