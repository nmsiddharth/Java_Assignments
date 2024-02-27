package com.Set_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_Sum {

	public static void check(int[]arr){
		if(arr == null || arr.length<3) {
			System.out.println();
		}
		
		Arrays.sort(arr);
		Set<List<Integer>> result = new HashSet<>();
		
		
	for(int i=0;i<arr.length-2;i++) {
		int left = i+1;
		int right = arr.length-1;
		
		while(left<right) {
			int sum = arr[i] + arr[left]+arr[right];
			
			if(sum==0) {
				result.add(Arrays.asList(arr[i],arr[left],arr[right]));
				left++;
				right--;
			}else if(sum<0) {
				left++;
			}else {
				right--;
			}
		}
	}
	System.out.println(result);
		
	}
	public static void main(String[] args) {
		int[]arr = {-1,0,1,2,-1,-4};
		check(arr);

	}

}
