package com.designer.factory.abstractFactory;

import com.designer.factory.abstractFactory.bean.ingredient.*;

/**
 * @author: lh
 * @date: 2020-10-29 20:07
 * @version: 1.0
 * @description: 负责创建所有原料的接口
 */
public abstract class AbstractIngredientFactory {
    /**
     * 生面团
     *
     * @return Dough
     **/
    public abstract Dough createDough();

    /**
     * 调味汁
     *
     * @return sauce
     **/
   public abstract Sauce createSauce();

    /**
     * 芝士
     *
     * @return cheese
     **/
    public abstract Cheese createCheese();

    /**
     *蔬菜
     *
     * @return Veggies[]
     **/
    public abstract Veggies[] createVeggies();

    /**
     *意大利腊肉肠
     *
     * @return com.designer.factory.abstractFactory.bean.ingredient.Pepperoni
     **/

    public abstract Pepperoni createPepperoni();

    /**
     *海鲜作料
     *
     * @return com.designer.factory.abstractFactory.bean.ingredient.Clams
     **/
   public abstract Clams createClam();
}
