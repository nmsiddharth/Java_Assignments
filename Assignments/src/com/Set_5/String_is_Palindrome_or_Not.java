package com.Set_5;

public class String_is_Palindrome_or_Not {

	public static void check() {
		String str = "radar";
		StringBuffer sb = new StringBuffer(str);
		StringBuffer sb2 = sb.reverse();
		if(sb2.toString().equals(str)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
