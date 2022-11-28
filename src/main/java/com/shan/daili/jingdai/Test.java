package com.shan.daili.jingdai;

/**
 * 静态代理
 *
 * @author sc
 */
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UserManageImpl i = new UserManageImpl();
        UserManagerImplProxy p = new UserManagerImplProxy(i);
        p.add();
    }

}
