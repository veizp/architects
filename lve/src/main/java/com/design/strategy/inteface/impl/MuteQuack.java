package com.design.strategy.inteface.impl;

import com.design.strategy.inteface.QuackBehavior;

/**
 * 实现发声接口
 *
 * @Author: weizhipeng
 * @Date: 2018/4/21 19:44
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("我不会叫！");
    }
}
