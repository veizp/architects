package com.design.strategy.entity;

import com.design.strategy.inteface.impl.FlyNoWay;
import com.design.strategy.inteface.impl.Quack;

/**
 * 模型鸭
 *
 * @Author: weizhipeng
 * @Date: 2018/4/22 09:51
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭子！");
    }
}
