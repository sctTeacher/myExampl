package com.shan.demo;

import java.util.Properties;

public class Fu {
    private String base = "fu";

    private Fu() {
        baseName();
    }

    private void baseName() {
        // TODO Auto-generated method stub
        System.out.println(base);
    }

    static class Zi extends Fu {
        private String base = "zi";

        private void baseName() {
            // TODO Auto-generated method stub
            System.out.println(base);
        }
    }

    public static void main(String[] args) {
        Fu fu = new Zi();
        fu.baseName();
        Properties p = new Properties();

    }

}
