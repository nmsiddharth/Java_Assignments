package com.Set_3;

public class RightRotation {

	public static int[] check() {
		int [] arr = {1,2,3,4,5};
		int k = 3;
		int j=1;
		
		while(j<=k) {
			int temp = arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
			j++;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = check();
		for(int data:array) {
			System.out.print(data+" ");
		}

	}

}
