package com.designer.singleton;

/**
 * @author: lh
 * @date: 2020-10-27 16:26
 * @version: 1.0
 * @description: 静态内部类 实现单例
 */
public class StaticInnerClass {

    /**
     * 构造方法私有化
     *
     **/
    private StaticInnerClass() {}

    /**
     * 定义静态内部类，静态属性INSTANCE
     *
     **/
    private static class InstanceHolder {
        private final static StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    /**
     * 直接返回INSTANCE对象
     *
     * @return com.designer.singleton.StaticInnerClass
     **/
    public static StaticInnerClass getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
