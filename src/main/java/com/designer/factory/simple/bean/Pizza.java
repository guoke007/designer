package com.designer.factory.simple.bean;

/**
 * @author: lh
 * @date: 2020-10-27 17:20
 * @version: 1.0
 * @description: pizza接口类
 */
public interface Pizza {
    /**
     * 准备阶段
     *
     **/
    void prepare();

    /**
     * 烘烤阶段
     *
     **/
    void bake();

    /**
     * 切片阶段
     *
     **/
    void cut();

    /**
     * 打包阶段
     *
     **/
    void box();
}
