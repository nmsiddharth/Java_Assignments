package com.set_4;

public class SortingWithoutoutusingSortingAlgo {

	public static void check() {
		int[] arr = {1,0,2,1,0,2,0};
		int b0 = 0;
		int b1 = 0;
		int b2 = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				b0++;
			}else if(arr[i]==1) {
				b1++;
			}else {
				b2++;
			}
		}
		
		for(int i=0;i<b0;i++) {
		    arr[i]=0;
		}
		for(int i=b0;i<b0+b1;i++) {
		    arr[i]=1;
		}
		for(int i=b0+b1;i<b0+b1+b2;i++) {
		    arr[i]=2;
		}
		
		for(int data:arr) {
			System.out.print(data+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
