package com.design.strategy.inteface.impl;

import com.design.strategy.inteface.FlyBehavior;

/**
 * @Author: weizhipeng
 * @Date: 2018/4/21 19:42
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("我不会飞！");
    }
}
