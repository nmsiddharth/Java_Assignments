package com.set_4;

public class Union_and_intersection_of_2_Sorted_Arrays {

	public static void check(int[]arr1, int[]arr2) {
	        
		int i =0;
		int j=0;
		System.out.println("Union : ");
		while( i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;
			}else if(arr1[i] >arr2[j]) {
				System.out.print(arr2[j]+" ");
				j++;
			}else {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
		
		while(i<arr1.length) {
			System.out.print(arr1[i]+" ");
			i++;
		}
		
		while(j<arr2.length) {
			System.out.print(arr2[j]+" ");
			j++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1 = {1,2,3,4,5};
		int[] arr2 = {4,5,6,7,8};
		
		 int i = 0;
	        int j = 0;
	        System.out.println("Intersection:");
	        while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] < arr2[j]) {
	                i++;
	            } else if (arr1[i] > arr2[j]) {
	                j++;
	            } else {
	                System.out.print(arr1[i] + " ");
	                i++;
	                j++;
	            }
	        }
		check(arr1,arr2);

	}

}
