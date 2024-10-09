package com.dest.ArrayProgramming.day1;

import java.util.Scanner;

public class HackerRankP1 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the no of languages: ");
		int lang = Scan.nextInt();
		
		System.out.println("Enter the no of movies types in each languages: ");
		int mov_type = Scan.nextInt();
		
		System.out.println("Enter the no of movies in each movie types in each languages: ");
		int movies = Scan.nextInt();
		
		long arr[][][] = new long[lang][mov_type][movies];
		
		long overall_rev = 0l;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("language no:" + (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(" inside movie type no "+ (j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(" revenue made by movie  "+ (k+1));
					arr[i][j][k]=Scan.nextLong();
					overall_rev += arr[i][j][k];
					
			}
		}
		
	}
		
				
		for(int i=0;i<arr.length;i++) {
				System.out.println("language no:" + (i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println(" inside movie type no "+ (j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println(" revenue made by movie  "+ (k+1) + "is =" + arr[i][j][k]);
						
				}
			}
		
		}
		long profit= 0l;
		long loss=0l;
		
		if(overall_rev > 5000000000l) {
			profit= 5000000000l + overall_rev;
			System.out.println(" sathish is on profitable side with profit of " + profit);
		}
		else {
			loss= 5000000000l - overall_rev;
			System.out.println(" sathish is on loss  with loss of " + loss);
		}
	}
	}


