package com.dsa.binarysearch;


//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class _852_Leetcode {

	public static void main(String args[]) {
		int arr[]= {3,5,3,2,0};
	}
	
	
	int getPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
             int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]) {
            	
            	end=mid;
            }else {
            	start=mid+1;
            }
        }
        return start;
    }
}
