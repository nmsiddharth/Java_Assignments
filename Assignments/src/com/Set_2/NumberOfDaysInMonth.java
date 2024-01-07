package com.Set_2;

import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		System.out.println("Enter Month");
		int month = sc.nextInt();
		
		switch(month) {
		// cases for 31 days
		 case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
        	 System.out.println("Number of days is 31 days");
        break;
        
        // cases for 30 days
        
         case 4:
         case 6:
         case 9:
         case 11:
         System.out.println("Number of days is 30");
         break;
         
         case 2:
        	 if(year%400==0 || year%100!=0 && year%4==0 ) {
        		 System.out.println("Number of days is 29 days");
        	 }else {
        		 System.out.println("Number of days is 28 days");
        	 }
        	 break;
        
        default: System.out.println("Invalid Month");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
