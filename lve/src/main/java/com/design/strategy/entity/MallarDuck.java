package com.design.strategy.entity;

import com.design.strategy.inteface.impl.FlyWithWings;
import com.design.strategy.inteface.impl.Quack;

/**
 * 红头鸭子
 *
 * @Author: weizhipeng
 * @Date: 2018/4/21 19:34
 */
public class MallarDuck extends Duck {

    /**
     * 红头鸭子构造器
     */
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是一只红头鸭子！🦆");
    }

    @Override
    public void swim() {
        System.out.println("我会游泳！🏊");
    }
}
