package com.design.strategy.designclass;

import com.design.strategy.inteface.IDBquery;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: weizhipeng
 * @Date: 2018/6/10 12:48
 * 使用JDK的动态代理
 */
public class JdkDbQueryHandler implements InvocationHandler {
    IDBquery real = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (real == null) {
            real = new DBquery();
        }
        return real.request();
    }

    public static IDBquery createJdkProxy() {
        IDBquery jdkProxy = (IDBquery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{IDBquery.class},
                new JdkDbQueryHandler());
        return jdkProxy;
    }
}
