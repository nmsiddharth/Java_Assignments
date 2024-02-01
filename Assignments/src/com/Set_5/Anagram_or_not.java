package com.Set_5;

import java.util.Arrays;

public class Anagram_or_not {

	public static void check() {
		String str1 = "Care";
		String str2 = "Race";
		
		 str1 = str1.toLowerCase();
		 str2 = str2.toLowerCase();
		 
		 char[] strArr1 = str1.toCharArray();
		 char[] strArr2 = str2.toCharArray();
		 
		 Arrays.sort(strArr1);
		 Arrays.sort(strArr2);
		 
		 if(Arrays.equals(strArr1, strArr2)) {
			 System.out.println("Strings are Anagram");
		 }else {
			 System.out.println("Strings are not Anagram");
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
