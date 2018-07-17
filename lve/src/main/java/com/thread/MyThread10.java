package com.thread;

/**
 * @Author: weizhipeng
 * @Date: 2018/7/16 22:29
 */
public class MyThread10 extends Thread {

    private int count = 5;

    public MyThread10(String name) {
        this.setName(name);
    }

    @Override
    public synchronized void run() {
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        // 不共享数据
//        MyThread10 myThread10 = new MyThread10("A");
//        MyThread10 myThread11 = new MyThread10("B");
//        MyThread10 myThread12 = new MyThread10("C");
//        myThread10.start();
//        myThread11.start();
//        myThread12.start();
        // 共享数据
        Thread thread = new MyThread10("A");
        Thread thread1 = new Thread(thread, "1");
        Thread thread2 = new Thread(thread, "2");
        Thread thread3 = new Thread(thread, "3");
        Thread thread4 = new Thread(thread, "4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
