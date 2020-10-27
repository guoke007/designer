package com.designer.singleton;

/**
 * @author: lh
 * @date: 2020-10-27 14:25
 * @version: 1.0
 * @description: 饿汉式单例
 * 优点：写法简单，在类装载的时候完成实例化，避免现场同步问题
 * 缺点：在类装载的时候完成实例化，没有达到lazy loading的效果，如果
 * 自始至终从未使用过这个实例，则造成内存的浪费
 *
 *
 */
public class Hungry {

    private Hungry() {
    }

    private final static Hungry INSTANCE = new Hungry();

    private static Hungry INSTANCE_STATIC;

    static {
        INSTANCE_STATIC = new Hungry();
    }

    /**
     * 静态代码块了创建对象实例
     *
     * @return com.designer.singleton.Hungry
     **/
    public static Hungry getInstanceStatic() {
        return INSTANCE_STATIC;
    }

    /**
     * 获取单例对象
     *
     * @return com.designer.singleton.Hungry
     **/
    public static Hungry getInstance() {
        return INSTANCE;
    }
}
