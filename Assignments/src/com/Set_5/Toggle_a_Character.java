package com.Set_5;

public class Toggle_a_Character {

	public static void check(String str) {
		String s1 = "";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				s1 += Character.toLowerCase(str.charAt(i));
			}else {
				s1 += Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SiddHarTh";
		check(str);
	}

}
