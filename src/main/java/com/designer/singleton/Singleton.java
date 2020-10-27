package com.designer.singleton;

/**
 * @author: lh
 * @date: 2020-10-27 16:40
 * @version: 1.0
 * @description: 使用枚举实现单例
 */
public enum Singleton {
    //属性
    INSTANCE;

    public void sayOk() {
        System.out.println("ok");
    }

}
