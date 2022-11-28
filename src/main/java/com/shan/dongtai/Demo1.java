package com.shan.dongtai;

public class Demo1 {

    public static void main(String[] args) throws Exception, IllegalAccessException {
        String s = new String();
        String s1 = new String("A");
        String s2 = "";
        String s3 = "A".intern();
        String s4 = (String) String.class.newInstance();
        System.out.println("第1个:" + s);
        System.out.println("第2个:" + s1);
        System.out.println("第3个:" + s2);
        System.out.println("第4个:" + s3);
        System.out.println("第5个:" + s4);
        Demo1 d = new Demo1();
        String s5 = "BEA";
        d.aa(s5);
        System.out.println(s5);
        System.out.println("------------");
        System.out.println("  s   s   ".trim());

    }

    void aa(String s) {
        s = s.replace("A", "E");
        s = s.toLowerCase();
    }

}
