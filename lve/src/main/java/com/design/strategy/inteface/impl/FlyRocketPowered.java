package com.design.strategy.inteface.impl;

import com.design.strategy.inteface.FlyBehavior;

/**
 * 火箭动力飞飞飞
 *
 * @Author: weizhipeng
 * @Date: 2018/4/22 09:55
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("火箭动力🚀飞飞飞！");
    }
}
