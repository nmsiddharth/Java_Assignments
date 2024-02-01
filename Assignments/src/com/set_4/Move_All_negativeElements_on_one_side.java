package com.set_4;

import java.util.Arrays;

public class Move_All_negativeElements_on_one_side {

	public static void check() {
		int [] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
