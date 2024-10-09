package com.dest.ArrayProgramming.day1;

public class binary {
	static int binarSearch(int[] arr, int key) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
	    int mid=low+(high-low)/2;
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[mid]<key) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		
		int[] arr= {10,20 ,30,40};
		int key=40;
		int result=binarSearch(arr,key);
		if(result==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println("found at position "+result);
		}
	}
}
		