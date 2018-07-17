package com.thread;

/**
 * @Author: weizhipeng
 * @Date: 2018/7/16 21:40
 */
public class MyThread08 extends Thread {

    private int i;

    public MyThread08(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }


    public static void main(String[] args) {
        MyThread08 myThread01 = new MyThread08(1);
        MyThread08 myThread02 = new MyThread08(2);
        MyThread08 myThread03 = new MyThread08(3);
        MyThread08 myThread04 = new MyThread08(4);
        MyThread08 myThread05 = new MyThread08(5);
        MyThread08 myThread06 = new MyThread08(6);
        MyThread08 myThread07 = new MyThread08(7);
        MyThread08 myThread08 = new MyThread08(8);
        MyThread08 myThread09 = new MyThread08(9);
        MyThread08 myThread10 = new MyThread08(10);
        MyThread08 myThread11 = new MyThread08(11);
        MyThread08 myThread12 = new MyThread08(12);
        MyThread08 myThread13 = new MyThread08(13);
        MyThread08 myThread14 = new MyThread08(14);
        myThread01.start();
        myThread02.start();
        myThread03.start();
        myThread04.start();
        myThread05.start();
        myThread06.start();
        myThread07.start();
        myThread08.start();
        myThread09.start();
        myThread10.start();
        myThread11.start();
        myThread12.start();
        myThread13.start();
        myThread14.start();
    }
}
