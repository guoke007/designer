package com.designer.factory.method;


import com.designer.factory.method.bean.AbstractPizza;

/**
 * @author: lh
 * @date: 2020-10-28 19:27
 * @version: 1.0
 * @description: 客户端代码
 */
public class Client {
    public static void main(String[] args) {
        //创建一个纽约披萨店
        AbstractPizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        //订购纽约披萨店的芝士披萨
        AbstractPizza newYorkPizza = newYorkPizzaStore.orderPizza("cheese");
        //打印订购披萨
        System.out.println("Jim ordered a  " + newYorkPizza.getName());

        System.out.println("============================================");

        //创建一个芝加哥披萨店
        AbstractPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        //订购芝加哥披萨店的芝士披萨
        AbstractPizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");
        //打印订购的披萨
        System.out.println("Tom ordered a " + chicagoPizza.getName());
    }
}
