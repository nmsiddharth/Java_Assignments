package com.Set_5;

public class CharacterIsAlphabetOrNot {

	public static String check(char ch) {
		if((ch >='A' && ch<='Z') || (ch >='a' && ch<='z')) {
			return "Character is Alphabet";
		}else {
			return "Character is not Alphabet";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '$';
		System.out.println(check(ch));

	}

}
