package com.Set_3;

public class Count_Inversion {

	public static void getInv() {
		int arr[] = {2,4,5,1,3};
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInv();
	}

}
