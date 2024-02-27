package com.Set_3;

public class SubArrayOfGivenSum {

	    public static void check() {
	        int[] arr = {4, 2, -3, 1, 6};
	        int sum = 0;
	        int currentSum = 0;
	        
	        for(int i=0;i<arr.length-1;i++) {
	        	currentSum = arr[i];
	        	for(int j=i+1;j<arr.length;j++) {
	        		currentSum +=arr[j];
	        		if(currentSum==sum) {
	        			printArray(arr,i,j);
	        			break;
	        		}
	        	}
	        }
	        }
	        
	        public static void printArray(int[]arr,int start,int end) {
	        	for(int i=start;i<=end;i++) {
	        		System.out.print(arr[i]+" ");
	        	}
	        	System.out.println();
	        
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        check();
	    }
	}
