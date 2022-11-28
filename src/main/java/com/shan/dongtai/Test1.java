package com.shan.dongtai;

/**
 * 递归翻转字符串  + 单链表实现翻转
 * @author sc
 *
 */
public class Test1 {

	//abc  cba �ݹ�ʵ���ַ�����ת
	public static String revice(String str){
		if(str==null||str.length()<=1){
			return str;
		}// bc c 
		System.out.println(str.charAt(0));
		return revice(str.substring(1))+str.charAt(0);
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println("abc".charAt(0));
		
		String string = revice("abc");
		System.out.println("翻转后"+string);
		
		
		/*StringBuilder s=null;
		Integer a=1;
		Integer b=2;
		Integer c=3;
		Integer d=3;
		Integer e=321;
		Integer f=321;
		Long g=3L;
		System.out.println(c==d);
		System.out.println(e==f);
		
		System.out.println(c==(a+b));
		System.out.println(c.equals((a+b)));
			System.out.println(g==(a+b));
		System.out.println(g.equals((a+b)));
		
		
		
		System.out.println("----------");
		
		Integer aa=new Integer(2);
		Integer bb=2;
		int cc=2;
		
		System.out.println(aa==bb);
		System.out.println(aa==cc);
		
		
		*/
	/*String s1="proming";
	String s2=new String("proming");
	String s3="pro";
	String s4="ming";
	String s5="pro"+"ming";
	String s6=s3+s4;
		System.out.println(s1==s2);
		System.out.println(s1==s5);
		System.out.println(s1==s6);
		System.out.println(s1==s6.intern());
		System.out.println(s2==s2.intern());
		*/
		
		
	}

	
	

}
