package com.shan.dongtai;

/**
 * 动态分配验证   重写
 *
 * @author sc
 */
public class DongTai {

    static abstract class Human {
        public abstract void say();
    }

    static class Man extends Human {
        @Override
        public void say() {
            System.out.println("man");
        }
    }

    static class WoMan extends Human {
        @Override
        public void say() {
            System.out.println("Woman");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        man.say();
        Human woman = new WoMan();
        woman.say();
        man = new WoMan();
        man.say();

    }

}
