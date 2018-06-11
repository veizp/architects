package com.design.strategy.test;

import com.design.strategy.designclass.DBQueryProxy;
import com.design.strategy.inteface.IDBquery;

/**
 * @Author: weizhipeng
 * @Date: 2018/6/10 12:41
 */
public class Main {
    public static void main(String[] args) {
        IDBquery q = new DBQueryProxy();
        String aa  = q.request();
        System.out.print(aa);

    }
}
