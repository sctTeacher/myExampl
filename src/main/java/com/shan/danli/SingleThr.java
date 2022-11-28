package com.shan.danli;

//懒汉式
public class SingleThr {

    private SingleThr() {
    }

    ;
    private static SingleThr instance = null;

    public static SingleThr getInstanse() throws Exception {
        if (instance == null) {
            synchronized (SingleThr.class) {
                Thread.sleep(1000);
                if (instance == null) {
                    instance = new SingleThr();
                }

            }
        }
        return instance;
    }


    public static void main(String[] args) throws Exception {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    SingleThr instanse;
                    try {
                        instanse = getInstanse();
                        System.out.println("1线程  :" + instanse);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    SingleThr instanse;
                    try {
                        instanse = getInstanse();
                        System.out.println("2线程  :" + instanse);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }).start();


    }


}