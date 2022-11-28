package com.shan.demo;
/**
 *  字符串压缩
 * @author sc
 *
 */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabccdd";
		String s = compressBetter(str);
		System.out.println(s);
	}
	
	public static String compressBetter (String str){
		StringBuffer mystr = new StringBuffer();
		int count = 1;
		char last = str.charAt(0);
		for (int i = 1; i < str.length(); i++)
		{
			if (last == str.charAt(i))
			{
				count++;
			}
			else
			{
				mystr.append(last);
				mystr.append(count);
				last = str.charAt(i);
				count = 1;				
			}
		}
		mystr.append(last);
		mystr.append(count);
		
		return mystr.toString();
	}

}
