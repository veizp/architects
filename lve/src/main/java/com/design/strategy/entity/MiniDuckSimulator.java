package com.design.strategy.entity;

/**
 * @Author: weizhipeng
 * @Date: 2018/4/21 20:19
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.display();
        mallard.swim();
    }
}
