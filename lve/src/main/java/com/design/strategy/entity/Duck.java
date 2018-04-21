package com.design.strategy.entity;

import com.design.strategy.inteface.FlyBehavior;
import com.design.strategy.inteface.QuackBehavior;

/**
 * @Author: weizhipeng
 * @Date: 2018/4/21 19:25
 */
public abstract class Duck {

    public Duck() {

    }

    /**
     * 飞行行为
     */
    FlyBehavior flyBehavior;

    /**
     * 叫的行为
     */
    QuackBehavior quackBehavior;

    /**
     * 表演叫
     */
    public void performQuack() {
        //调用接口实现类方法
        flyBehavior.fly();
    }

    /**
     * 表演飞
     */
    public void performFly() {
        //调用接口实现类方法
        quackBehavior.quack();
    }

    /**
     * 游泳
     */
    public abstract void swim();

    /**
     * 展示
     */
    public abstract void display();

}
