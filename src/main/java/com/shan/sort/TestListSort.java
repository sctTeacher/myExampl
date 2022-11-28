package com.shan.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 对任意对象排序
 *
 * @author sc
 */
public class TestListSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student s1 = new Student("Java", 45);
        Student s2 = new Student("C", 80);
        Student s3 = new Student("Python", 60);
        Student s4 = new Student("12345", 18);
        /////////////集合//////////////////////
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("排序前");
        System.out.println(list);
        /**
         * 自然比较  以pojo重写compareTo方法中的规则为准
         */
        //  Collections.sort(list);
        /**
         * 自定义比较规则  当pojo实现Comparable重写compareTo时会以自定义规则为准
         */
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //年龄升序
                //return o1.getAge()-o2.getAge();
                //姓名升序
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("排序后");
        System.out.println(list);
    }
}
