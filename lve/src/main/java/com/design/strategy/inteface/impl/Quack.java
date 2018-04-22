package com.design.strategy.inteface.impl;

import com.design.strategy.inteface.QuackBehavior;

/**
 * 实现发声接口
 *
 * @Author: weizhipeng
 * @Date: 2018/4/21 19:43
 */
public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("呱呱。。");
    }
}
