package com.shan.daili.dongtai;

import com.shan.daili.jingdai.UserManageImpl;
import com.shan.daili.jingdai.UserManege;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author sc
 */
public class Test {

    public static void main(String[] args) {
        final UserManageImpl zi = new UserManageImpl();
        UserManege ziProxy = (UserManege) Proxy.newProxyInstance(zi.getClass().getClassLoader(), zi.getClass().getInterfaces(), new MyProxyHandler(zi));
        ziProxy.add();

    }

}
