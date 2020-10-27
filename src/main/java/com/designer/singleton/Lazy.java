package com.designer.singleton;

/**
 * @author: lh
 * @date: 2020-10-27 14:38
 * @version: 1.0
 * @description: 懒汉式单例模式
 *  getInstance 能够做到懒加载的目的，但是只能在单线程条件下使用,实际开发中不能使用该方式
 *  getInstanceSyn 解决线程安全问题，效率比较低，每次执行都要进行同步，实际开发中不推荐
 *  getInstanceSynBlock 不能解决线程安全问题，实际开发中不推荐
 */
public class Lazy {
    private static Lazy instance;

    private Lazy() {
    }

    /**
     * 提供静态的公有方法，当使用到该对象的时候，才去创建对象
     *
     * @return com.designer.singleton.Lazy
     **/
    public static Lazy getInstance() {
        if (instance == null) {
            return new Lazy();
        }
        return instance;
    }

    /**
     * 获取方法加锁，实现线程安全
     *
     * @return com.designer.singleton.Lazy
     **/
    public static synchronized Lazy getInstanceSyn() {
        if (instance == null) {
            return new Lazy();
        }
        return instance;
    }

    /**
     * 加锁，对同步代码块加锁
     *
     * @return com.designer.singleton.Lazy
     **/
    public static Lazy getInstanceSynBlock() {
        if (instance == null) {
            synchronized (Lazy.class) {
                return new Lazy();
            }
        }
        return instance;
    }
}
