package com.designer.singleton;

/**
 * @author: lh
 * @date: 2020-10-27 15:56
 * @version: 1.0
 * @description: 双重检查获取单例模式
 */
public class DoubleCheck {

    /**
     * 使用volatile修饰，防止进行指令重排序，实现线程安全
     * new DoubleCheck()
     * 1、分配内存空间
     * 2、初始化对象实例
     * 3、将实例对象指向分配的内存空间
     **/
    private static volatile DoubleCheck instance;

    private DoubleCheck() {
    }

    /**
     *提供静态公共方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
     *保证效率，推荐使用
     * @return com.designer.singleton.DoubleCheck
     **/
    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
