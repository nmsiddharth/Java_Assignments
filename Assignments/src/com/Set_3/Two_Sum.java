package com.Set_3;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static int[] check(int[]arr, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int comp = target - arr[i];
			
			if(map.containsKey(comp)) {
				return new int[] {map.get(comp),i};
			}
			
			map.put(arr[i], i);
		}
		return null;
	}
	public static void main(String[] args) {
		int [] arr = {16,4,23,8,15,42,1,2};
		int target = 19;
		int[] result = Two_Sum.check(arr, target);
		
		if(result!=null) {
			System.out.println(result[0]+","+result[1]);
		}else {
			System.out.println("No 2 sum");
		}

	}

}
