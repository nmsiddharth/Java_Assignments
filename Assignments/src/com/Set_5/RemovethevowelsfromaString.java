package com.Set_5;

public class RemovethevowelsfromaString {

	public static void check() {
		String str = "Cristiano";
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)== 'a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u') {
				sb.deleteCharAt(i);
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
