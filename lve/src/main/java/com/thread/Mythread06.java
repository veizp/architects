package com.thread;

/**
 * @Author: weizhipeng
 * @Date: 2018/7/16 21:25
 */
public class Mythread06 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }

    public static void main(String[] args) {
        Mythread06 mythread = new Mythread06();
        mythread.start();
        System.out.println("运行结束");
    }
}
