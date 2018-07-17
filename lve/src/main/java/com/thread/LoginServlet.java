package com.thread;

/**
 * @Author: weizhipeng
 * @Date: 2018/7/16 22:54
 */
public class LoginServlet {
    private static String userNameRef;
    private static String passWordRef;

    synchronized public  static void doPost(String userName, String passWord) {
        try {
            userNameRef = userName;
            if (userName.equals("a")) {
                Thread.sleep(5000);
            }
            passWordRef = passWord;
            System.out.println("userName=" + userNameRef + ", passWord=" + passWordRef);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        BLogin bLogin = new BLogin();
        aLogin.start();
        bLogin.start();
    }
}
