package com.Set_5;

public class Sum_of_numbers_in_string {

	public static void check() {
		String str = "4PREP2INSTAA6";
		int sum = 0;
		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
//				sum = sum+str.charAt(i) - '0';
//			}
			
			if(Character.isDigit(str.charAt(i))) {
				sum = sum +Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
