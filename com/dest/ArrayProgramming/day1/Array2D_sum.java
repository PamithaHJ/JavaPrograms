package com.dest.ArrayProgramming.day1;

import java.util.Scanner;

public class Array2D_sum {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		 
		System.out.println("Enter the size of array ");
		int n = Scan.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int sum[][]=new int[n][n];
		
		System.out.println("Enter the elements in array a:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
			System.out.println(" enter the element in the position "+ i + " " +j);
			a[i][j]=Scan.nextInt();
		}
		}
		
		System.out.println("Enter the elements in array b:");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++)
			{
			System.out.println(" enter the element in the position "+ i + " " +j);
			b[i][j]=Scan.nextInt();
		}
		}
		
		
		//display elements
		System.out.println("elements in the array a are");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j] + " ");
		}
			System.out.println();
		}
		
		System.out.println("elements in the array a are");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++)
			{
			System.out.print(b[i][j] + " ");
		}
			System.out.println();
		}
		
		//sum 
		System.out.println("elements in the array a are");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			  System.out.print(sum[i][j] + " ");
			}
			System.out.println();
			}
		
		
		
		
	}

}
