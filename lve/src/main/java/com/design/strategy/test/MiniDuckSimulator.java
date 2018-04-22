package com.design.strategy.test;

import com.design.strategy.entity.Duck;
import com.design.strategy.entity.MallarDuck;
import com.design.strategy.entity.ModelDuck;
import com.design.strategy.inteface.FlyBehavior;
import com.design.strategy.inteface.QuackBehavior;
import com.design.strategy.inteface.impl.FlyNoWay;
import com.design.strategy.inteface.impl.FlyRocketPowered;
import com.design.strategy.inteface.impl.MuteQuack;
import com.design.strategy.inteface.impl.Squeak;

/**
 * 策略模式 测试类
 *
 * @Author: weizhipeng
 * @Date: 2018/4/21 20:19
 */
public class MiniDuckSimulator {

    /**
     * 动态设置
     *
     * @param args
     */
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performFly();// 红头鸭子构造器设置的会飞
        mallard.performQuack();// 红头鸭子构造器设置的会叫

        mallard.display();// 红头鸭子重写的外观
        mallard.swim();// 红头鸭子重写的游泳

        System.out.println("===========================动态设置红头鸭子分割线===================");

        FlyBehavior flyBehavior = new FlyNoWay();
        mallard.setFlyBehavior(flyBehavior);// 动态设置红头鸭子的飞行行为
        mallard.performFly();

        QuackBehavior quackBehavior = new Squeak();
        mallard.setQuackBehavior(quackBehavior);// 动态设置红头鸭子的发声行为
        mallard.performQuack();

        QuackBehavior quackBehavior1 = new MuteQuack();// 动态设置红头鸭子的发声行为
        mallard.setQuackBehavior(quackBehavior1);
        mallard.performQuack();

        System.out.println("===========================模型鸭子分割线===================");

        Duck model1 = new ModelDuck();
        model1.performFly();// 模型鸭构造器设置的会飞
        model1.performQuack();// 模型鸭构造器设置的发声行为

        System.out.println("===========================动态设置模型鸭子分割线===================");

        FlyBehavior flyBehavior1 = new FlyRocketPowered();
        model1.setFlyBehavior(flyBehavior1);// 动态设置模型飞行行为
        model1.performFly();
    }
}
