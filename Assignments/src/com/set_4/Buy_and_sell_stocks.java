package com.set_4;

public class Buy_and_sell_stocks {

	public static void check() {
		 int arr[] = { 7, 1, 5, 6, 4 };
		 int buy = arr[0];
		 int maxProfit = 0;
		 
		 for(int i=1;i<arr.length;i++) {
			 if(buy>arr[i]) {
				 buy = arr[i];
			 }else if(arr[i]-buy >maxProfit) {
				 maxProfit = arr[i]-buy; 
			 }
		 }
		 System.out.println(maxProfit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
