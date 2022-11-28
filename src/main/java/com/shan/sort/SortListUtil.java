package com.shan.sort;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListUtil {
    public static void main(String[] args) {
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
        sotr(list, "age", true);
        System.out.println("排序后");
        System.out.println(list);
    }

    /**
     * @param targetList * 要排序的实体类List集合
     * @param sortField  * 排序字段(实体类属性名)
     * @param sortMode   * true正序，false逆序
     */

    public static <T> void sotr(List<T> targetList, final String sortField, final boolean sortMode) {
        if (targetList == null || targetList.size() < 2 || sortField == null || sortField.equals("")) {
            return;
        }
        Collections.sort(targetList, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                int retvalu = 0;
                // TODO Auto-generated method stub
                String methodName = "get" + sortField.substring(0, 1).toUpperCase() + sortField.substring(1);
                try {
                    Method method1 = o1.getClass().getMethod(methodName, null);
                    Method method2 = o2.getClass().getMethod(methodName, null);
                    if (sortMode) {
                        retvalu = method1.invoke(o1, null).toString().compareTo(method2.invoke(o2, null).toString());
                    } else {
                        retvalu = method2.invoke(o2, null).toString().compareTo(method1.invoke(o1, null).toString());
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return retvalu;
            }
        });
    }
}
