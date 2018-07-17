package com.thread;

/**
 * @Author: weizhipeng
 * @Date: 2018/7/16 23:11
 */
public class MyThread16 extends Thread {

    public MyThread16() {
        System.out.println("构造方法打印" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run方法打印" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread16 myThread16 = new MyThread16();
        //myThread16.start();
        myThread16.run();
    }
}
