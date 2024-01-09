package com.Set_3;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindromeInArray {

	public static boolean getPalindrome(int n) {
		int temp = n;
		int rev = 0;
		while(n>0) {
			int rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		if(temp==rev) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr = {1,232,54545,999991};
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>=0;i--) {
			if(getPalindrome(arr[i])) {
				System.out.println(arr[i]);
				break;
			}
		}
		
	}

}
