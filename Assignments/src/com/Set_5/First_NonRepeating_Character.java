package com.Set_5;

import java.util.HashMap;
import java.util.Map;

public class First_NonRepeating_Character {

	public static void check() {
		String str = "Siddharth";
		
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		 for (int i = 0; i < str.length(); i++) {
	            if (map.get(str.charAt(i)) == 1) {
	                System.out.println(str.charAt(i));
	                break; // Add return statement to print only the first non-repeating character
	            }
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
