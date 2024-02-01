package com.Set_5;

public class Length_Of_String_without_Strlen_Function {
	
	public static void checkLength(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		for(int data:ch) {
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		String str = "Siddharth";
		checkLength(str);

	}

}
