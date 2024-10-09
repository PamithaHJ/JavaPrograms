package com.dest.ArrayProgramming.day1;

import java.util.Scanner;

public class assignment_1 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		 
		System.out.println("Enter the number of elements present in array ");
		int n = Scan.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println(" enter the elemt in the position "+ i);
			arr[i]=Scan.nextInt();
		}
		
		//display elements
		System.out.println("elements in the array are");
		for(int i=0;i<n;i++) {
			System.out.print( arr[i]+ " ");
		}
		
		//to print even elements
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("even elements in the array are ");
		for(int i=0;i<n;i++)
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
		}
		
		//to print odd elements
		System.out.println("------------------------------------");
		System.out.println("odd elements in the array are ");
		for(int i=0;i<n;i++)
		if(arr[i]%2!=0) {
			System.out.println(arr[i]);
		}
		
		//sum of even elements
		int even_sum=0;
		System.out.println("------------------------------------");
		System.out.println("even elements sum = ");
		for(int i=0;i<n;i++) {
		if(arr[i]%2==0) {
			even_sum+=arr[i];
		}
		}
		System.out.println(even_sum);
		
		
		//sum of odd elements
		int odd_sum=0;
		System.out.println("------------------------------------");
		System.out.println("odd elements sum = ");
		for(int i=0;i<n;i++) {
		if(arr[i]%2!=0) {
			odd_sum+=arr[i];
		}
		}
		System.out.println(odd_sum);
		
	
	
	   //sum of all elements	
		System.out.println("------------------------------------");
		System.out.println("Sum of elements in the array is = ");
		int sum=0;
		for(int i=0;i<n;i++) {
		  sum +=arr[i]; 
		}
		System.out.println(sum);
		
		//elements at even index
		System.out.println("------------------------------------");
		System.out.println("elements in the even position of array are ");
		for(int i=0;i<n;i++)
		if(i%2==0) {
			System.out.println(arr[i]);
		}
		
		//elements at odd index
		System.out.println("------------------------------------");
		System.out.println("elements in the odd position of array are ");
		for(int i=0;i<n;i++)
		if(i%2!=0) {
			System.out.println(arr[i]);
		}
		
		
		
		//Total number of elements in the array
		System.out.println("------------------------------------");
		System.out.println("Total number of elements in the array "+ n);
		
		
		
		
	}
}
