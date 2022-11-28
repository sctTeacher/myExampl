package com.shan.mianshi;

import java.text.DecimalFormat;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  double a = 2.0;
	        double b = a - 0.111*5;
		a();
		b();
		System.out.println("------------");
		double result = 1.0*100 - 0.9*100;
		System.out.println(result/100);
		System.out.println("------------");
		System.out.println(changePointToPercent(0.3f));;
	}
	
	public static void a(){
		double a = 2.0;
        double b = a - 0.111 * 5;
        a = 2.0 * 1000;
        b = a - 0.111 * 5 * 1000;
        b = b/1000*1.0;
        System.out.println(b);
	}
	public static void b(){
		DecimalFormat df = new DecimalFormat("#.000");//保留3位小数
        double a = 2.0;
        double b = a - 0.111*5;
        System.out.println(df.format(b));
	}
	
	private static String changePointToPercent(float point) {
        return String.valueOf(point*100)+"%";
    }
}
