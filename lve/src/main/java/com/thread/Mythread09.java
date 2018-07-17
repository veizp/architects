package com.thread;

/**
 * @Author: weizhipeng
 * @Date: 2018/7/16 21:49
 */
public class Mythread09 implements Runnable {
    @Override
    public void run() {
        System.out.println("运行中！");
    }

    public static void main(String[] args) {
        MyThread08 myThread01 = new MyThread08(1);
        Thread thread = new Thread(myThread01);
        thread.start();
        System.out.println("运行结束");
    }
}
