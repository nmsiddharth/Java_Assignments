package com.set_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ELementsWithMoreThanSpecifiedFrequency {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		int arr[] = {3, 1, 2, 2, 1, 2, 3, 3};
		int k = 4;
		int n = arr.length;
		
		for(int data:arr) {
			if(!map.containsKey(data)) {
				map.put(data, map.getOrDefault(data, 1));
			}else {
				map.put(data, map.get(data)+1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>n/k) {
				list.add(entry.getKey());
			}
		}
		System.out.println(list);

	}

}
