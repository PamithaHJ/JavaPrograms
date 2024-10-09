package com.dest.ArrayProgramming.day1;

import java.util.Scanner;

public class HackerRank3 {
public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the count of university ");
		int uni = Scan.nextInt();
		
		String arr[][][][] = new String[uni][][][];
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter college count in university no: "+ (i+1));
			arr[i]=new String[Scan.nextInt()][][];
		}
		
		System.out.println("----------------------------------------------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside university no: "+ (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter class count inside college no: "+ (j+1));
		     	arr[i][j]=new String[Scan.nextInt()][];
			}
		}
		
		System.out.println("-----------------------------------------------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside university no: "+ (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside college no: "+ (j+1));
		     	for(int k=0;k<arr[i][j].length;k++){
		     		System.out.println("enter student count inside class no: "+(k+1));
		     		arr[i][j][k]=new String[Scan.nextInt()];
		     	}
			}
		}
		
		System.out.println("-------------------------------------------------------");
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside university no: "+ (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside college no "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("inside class no:"+ (k+1)+ " :");
					for(int m=0;m<arr[i][j][k].length;m++) {
						System.out.println("Enter the name of student =");
						arr[i][j][k][m]=Scan.next();
						
					}	
					
				}
					
			}
			
			System.out.println(" ______________________________________");
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside university no: "+ (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside college no "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("inside class no:"+ (k+1)+ " :");
					for(int m=0;m<arr[i][j][k].length;m++) {
						System.out.println("name of student no :"+(m+1)+"is =" + arr[i][j][k][m]);
						
					}	
					
				}
					
			}
			
			System.out.println(" ______________________________________");
		}
		
		
		 

}
}
