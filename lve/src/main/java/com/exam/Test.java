package com.exam;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: weizhipeng
 * @Date: 2018/4/22 14:48
 */
public class Test {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
         final Test test = new Test();

         new Thread("A"){
             public  void run(){
                 test.insert(Thread.currentThread());
             }
         }.start();

         new Thread("B"){
             public void run(){
                 test.insert(Thread.currentThread());
             }

         }.start();
    }


    public void insert(Thread thread){
        lock.lock();
        try {
            System.out.println("线程"+ thread.getName()+ "得到了锁。。。。。");
            for (int i=0;i<5;i++){
                arrayList.add(i);
            }

        }catch (Exception e){


        }finally {
            System.out.println("线程"+thread.getName()+"释放了锁。。。。。");
            lock.unlock();

        }

    }

}
