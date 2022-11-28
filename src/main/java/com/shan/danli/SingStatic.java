package com.shan.danli;

//静态内部类
public class SingStatic {
    /*  private SingStatic(){};
      private static class In{
          static SingStatic instance=new SingStatic();
      }
    public static SingStatic getInstance(){
        return SingStatic.In.instance;
    }*/
    private SingStatic() {
    }

    ;

    private static class In {
        static SingStatic instance = new SingStatic();
    }

    public static SingStatic getInstance() {
        return In.instance;
    }

    public static void main(String[] args) {
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();

    }


}

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            SingStatic is = SingStatic.getInstance();
            System.out.println(Thread.currentThread().getName() + is);
        }
    }

}