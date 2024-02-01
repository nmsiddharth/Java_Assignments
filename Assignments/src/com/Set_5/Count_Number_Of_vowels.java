package com.Set_5;

public class Count_Number_Of_vowels {

	public static int check(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Siddharuth";
		System.out.println(check(str));

	}

}
