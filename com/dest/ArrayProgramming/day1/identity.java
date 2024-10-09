package com.dest.ArrayProgramming.day1;

import java.util.Scanner;

public class identity {
	
	static boolean isIdenity(int n,int arr[][]) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
			if((i==j && arr[i][j]!=1) || (i!=j && arr[i][j]!=0)) {
				return false;
			}
		}
		}
		
		return true;
		
	}
	
//	static boolean isIdenity(int n,int arr[][]) {
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++)
//			{
//			if((i==j && arr[i][j]==1) || (i!=j && arr[i][j]==0)) {
//				return true;
//			}
//		}
//		}
//		
//		return false;
//		
//	}
	
	
	
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		 
		System.out.println("Enter the size of array ");
		int n = Scan.nextInt();
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
			System.out.println(" enter the element in the position "+ i + " " +j);
			arr[i][j]=Scan.nextInt();
		}
		}
		//display elements
		System.out.println("elements in the array are");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
			System.out.print(arr[i][j] + " ");
		}
			System.out.println();
		}
		 
          if(isIdenity( n, arr)) {
        	  System.out.println("it is an identity matrix");
        	  
    	  }
          else {
        	  System.out.println("it is not an identity matrix");
          }
	}

}
