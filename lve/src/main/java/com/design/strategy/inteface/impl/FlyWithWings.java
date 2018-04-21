package com.design.strategy.inteface.impl;

import com.design.strategy.inteface.FlyBehavior;

/**
 * @Author: weizhipeng
 * @Date: 2018/4/21 19:40
 */
public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("我会飞！");
    }

}
