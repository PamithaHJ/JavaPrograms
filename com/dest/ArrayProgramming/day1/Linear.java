package com.dest.ArrayProgramming.day1;

public class Linear {
	public static void main(String[] args) {
		int arr[]= {10,20,6,7,89};
		int key=7;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("key found");
			}
		}	
	}
	System.out.println("key not found");
}
