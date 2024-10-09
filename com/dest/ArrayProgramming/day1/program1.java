package com.dest.ArrayProgramming.day1;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the student count: ");
		int n = Scan.nextInt();
		
		//Creating a Dynamic Array ofSize n
		int arr[] =new int[n];
		
		//storing the data into an array
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of student " + (i+1));
			arr[i] = Scan.nextInt();		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of student " + (i+1) +" is =" + arr[i]);
					}
	}

}
