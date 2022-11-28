package com.shan.daili.dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 */
public class MyProxyHandler implements InvocationHandler {

    private Object realObject;

    public MyProxyHandler(Object realObject) {
        super();
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("动态代理看日志");
        return method.invoke(realObject, args);
    }

}
