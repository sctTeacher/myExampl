package com.shan.mianshi;

/**
 * 小数转分数
 *
 * @author sc
 * 0.3 -> 3/10, 0.25 -> 1/4
 * 以0.25为例, 0.25 * 100 = 25, 求25 和 100 的最大公约数gcd. 25/gcd 为分子. 100/gcd为分母.
 */
public class DicimalToFraction {
    public static void main(String[] args) {
        double a = 0.3;
        double b = 0.25;
        //System.out.println(dicimalToFraction(a));
        System.out.println(dicimalToFraction(b));
    }

    public static String dicimalToFraction(double num) {
        int count = 0;
        int base = 10;
        while (num != Math.floor(num)) {
            num *= base;
            count++;
        }
        base = (int) Math.pow(base, count);
        int nor = (int) num;
        int gcd = findGCD(nor, base);
        return String.valueOf(nor / gcd) + "/" + String.valueOf(base / gcd);
    }

    //求最大公约数
    private static int findGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return findGCD(b % a, a);
    }
}