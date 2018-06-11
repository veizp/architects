package com.design.strategy.designclass;

import com.design.strategy.inteface.IDBquery;

/**
 * @Author: weizhipeng
 * @Date: 2018/6/10 12:31
 */
public class DBquery implements IDBquery {

    public DBquery() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String request() {
        return "this is true theme";
    }
}
