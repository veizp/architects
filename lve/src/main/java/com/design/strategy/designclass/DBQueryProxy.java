package com.design.strategy.designclass;

import com.design.strategy.inteface.IDBquery;

/**
 * @Author: weizhipeng
 * @Date: 2018/6/10 12:36
 */
public class DBQueryProxy implements  IDBquery{
    private DBquery real = null;
    @Override
    public String request() {
        if(real == null){
            real = new DBquery();
        }
        return real.request();
    }

}
