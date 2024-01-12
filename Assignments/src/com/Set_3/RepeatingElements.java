package com.Set_3;

public class RepeatingElements {

    public static void printRepeatingElements() {
    	int arr[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  

        System.out.print("Repeating elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    break; // Break after printing the repeating element
                }
            }
        }
    }

    public static void main(String[] args) {
        printRepeatingElements();
    }
}
