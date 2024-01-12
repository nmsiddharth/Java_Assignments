package com.Set_3;

public class Non_RepeatingElement {

	public static void check() {
		  int arr[] = {10, 30, 40, 20, 10, 20, 50, 10};
		int flag;
	
		for(int i=0;i<arr.length;i++) {
			flag=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					flag=1;
					break;
				}
				
				
			}
			if(flag==0) {
				
				System.out.println(arr[i]+" ");
			}
			
			
		}
		
		
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
