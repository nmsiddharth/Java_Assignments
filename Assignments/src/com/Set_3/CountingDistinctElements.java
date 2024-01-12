package com.Set_3;

public class CountingDistinctElements {

	public static void check() {
		  int arr[] = {10, 30, 40, 20, 10, 20, 50, 10};
		int visited[] = new int[arr.length];
		int count = 0;
	
		for(int i=0;i<arr.length;i++) {
			int flag = 0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag = 1;
					break;
				}
			}
			if(flag==0) {
				visited[i]=arr[i];
				count++;
			}
		}
		
	
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
