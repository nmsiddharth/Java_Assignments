package com.Set_2;

import java.util.Scanner;

public class ReplaceAll0with1 {

	public static String check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Positive Number");
		int num = sc.nextInt();
		
		String str = Integer.toString(num);
		int length = str.length();
		String str1 = str.replace("0","1");
//		for(int i=0;i<length;i++) {
//			if(str.charAt(i)=='0') {
//				str1 = str1 + '1';
//			}else {
//				 str1 = str1 + str.charAt(i);
//			}
			
//		}
//		return str;
		return str1;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReplaceAll0with1.check());

	}

}
