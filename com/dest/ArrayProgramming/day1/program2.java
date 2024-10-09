package com.dest.ArrayProgramming.day1;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the College count: ");
		int College = Scan.nextInt();
		
		System.out.println("Enter the Class count in each college: ");
		int Class = Scan.nextInt();
		
		int arr[][]= new int[College][Class];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("College No:" + (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the seating capacity inside class no "+ (j+1));
				arr[i][j]=Scan.nextInt();
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("College No:" + (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the seating capacity inside class no "+ (j+1) + "is = " + arr[i][j]);
			}
		}
		
		
	}
}
