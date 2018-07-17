package com.thread;

/**
 * @Author: weizhipeng
 * @Date: 2018/7/16 22:58
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
