package com.shan.dongtai;

import java.util.HashSet;
import java.util.Iterator;

public class Testhh {
    public static void main(String[] args) {
        //内存泄漏:对于已经加入HashSet的对象，如果修改参与计算HashCode的属性的信息，会导致删除该HashSet中的该对象无效，从
        //而导致内存泄漏。
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("赵", 10);
        Student s2 = new Student("王", 11);
        hs.add(s1);
        hs.add(s2);
        Iterator<Student> it = hs.iterator();
        while (it.hasNext()) {
            Student ss = it.next();
            System.out.println(ss);
            it.remove();

        }
        System.out.println(hs.size());  //2
        s1.setName("李");   //修改s1属性值
        hs.remove(s1);  //删除集合中的s1
        System.out.println(hs.size()); //长度还是为2,删除失败

    }
}