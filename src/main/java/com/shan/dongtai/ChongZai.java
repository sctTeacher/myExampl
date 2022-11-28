package com.shan.dongtai;

import java.io.Serializable;

/**
 * 重载
 */
public class ChongZai {
    public static void say(char i) {
        System.out.println("char" + i);
    }

    public static void say(int i) {
        System.out.println("int" + i);//自动类型转换 97 unicode
    }

    public static void say(double i) {
        System.out.println("double" + i);//97.0
    }

    public static void say(Character i) {
        System.out.println("character :" + i);//自动装箱
    }

    public static void say(Serializable i) {//找不到装箱类 会找装箱类的实现的接口类型
        System.out.println("serializable :" + i);
    }

    public static void say(Object i) {//装箱后转型为父类
        System.out.println("Object :" + i);
    }

    public static void say(char... i) {//优先级最低
        System.out.println("优先级最低");
    }

    public static void main(String[] args) {
        ChongZai.say('a');
    }


}
