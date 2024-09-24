package com.Set_5;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

	public static void check(String s) {
		int max = 0;
		int i=0;
		int j = 0;
		int length = s.length();
		
		Set<Character>set = new HashSet<>();
		
		while(i<length && j<length) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				max = Math.max(max, j-i);
			}else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		String s =  "abcabcbb";
		check(s);
	}

}
