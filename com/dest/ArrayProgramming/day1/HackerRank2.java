package com.dest.ArrayProgramming.day1;

import java.util.Scanner;

public class HackerRank2 {
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the count of schools ");
		int scl = Scan.nextInt();
		
		String arr[][][] = new String[scl][][];
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter class count in school no: "+ (i+1));
			arr[i]=new String[Scan.nextInt()][];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside school no: "+ (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter student count inside class no: "+ (j+1));
		     	arr[i][j]=new String[Scan.nextInt()];
		}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: "+ (i+1));
			System.out.println("-------------------------------------");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of the student"+ (k+1)+ " :");
					arr[i][j][k]=Scan.next();				
				}
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: "+ (i+1));
			System.out.println("-------------------------------------");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(" name of the student"+ (k+1)+ " :" + arr[i][j][k]);
						
				}
			}
			
		}
		
		
		
	}

}
