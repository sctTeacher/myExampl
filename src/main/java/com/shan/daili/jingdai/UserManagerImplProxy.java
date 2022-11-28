package com.shan.daili.jingdai;

public class UserManagerImplProxy implements UserManege {
    private UserManege i;

    public UserManagerImplProxy(UserManege i) {
        this.i = i;
    }

    @Override
    public void add() {
        // TODO Auto-generated method stub
        System.out.println("静态代理看日志");
        i.add();
    }

}
