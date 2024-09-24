
package com.Set_5;

public class Remove_brackets_from_expression {

	public static void check() {
		String s = "a-(b+c)";
		String str1 = s.replaceAll("[(){}]", "");
		System.out.println(str1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
