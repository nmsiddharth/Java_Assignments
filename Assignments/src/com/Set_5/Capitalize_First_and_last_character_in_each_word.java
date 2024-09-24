package com.Set_5;

public class Capitalize_First_and_last_character_in_each_word {

	public static void check() {
		String str = "talent without hardwork is nothing";
		StringBuffer result = new StringBuffer();
		String[] arr = str.split(" ");
		
		for(String charArr:arr) {
			char first =Character.toUpperCase(charArr.charAt(0));
			char last =Character.toUpperCase(charArr.charAt(charArr.length()-1));
			String middle =charArr.substring(1,charArr.length()-1);
			result.append(first).append(middle).append(last).append(" "); 
		}
		System.out.println(result);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
