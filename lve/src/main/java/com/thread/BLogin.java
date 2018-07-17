package com.thread;

/**
 * @Author: weizhipeng
 * @Date: 2018/7/16 22:59
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
