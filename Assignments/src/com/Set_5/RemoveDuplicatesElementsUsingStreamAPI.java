package com.Set_5;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesElementsUsingStreamAPI {

	public static void main(String[] args) {
		
		String str = "Siddhaarth";
		
		Set set = new HashSet<>();
		
		str.chars().filter(s->set.add(s)).forEach(p->System.out.print((char)p));
		

	}

}
