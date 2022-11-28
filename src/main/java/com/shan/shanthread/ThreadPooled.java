package com.shan.shanthread;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 *
 * @author sc
 */
public class ThreadPooled {
    public static void main(String[] args) {

        Thread t;
        List<String> lise = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> lm = new LinkedHashMap<>();
        Map<String, String> map2 = new Hashtable<>();
        Vector<String> v = new Vector<>();
        StringBuilder b = new StringBuilder();
        StringBuffer f = new StringBuffer();
    }

    public static void getThreadPooled() {

        ExecutorService threadpooled = Executors.newCachedThreadPool();
        threadpooled.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("x");
            }
        });

    }

}
