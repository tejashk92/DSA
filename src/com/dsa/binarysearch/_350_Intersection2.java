package com.dsa.binarysearch;

public class _350_Intersection2 {

	public static void main(String[] args) {
		// UNABLE TO COME UP WITH A BFS SOLUTION
		int arr1[] = {1,2,2,1};
		int arr2[] = {2,2};
		int result[]=intersection(arr1, arr2);
		for(int i:result) {
			System.out.println(i);
		}
		
	}
	
	
	 public static int[] intersection(int[] nums1, int[] nums2) {
		 
		 int frequency[]=new int[1000];
		 int count=0;
		 int temp [] = new int[Math.min(nums1.length, nums2.length)];
		 
		 for(int i: nums1) {
			 frequency[i]++;
		 }
		 
		 for(int i:nums2) {
			 if(frequency[i] > 0) {
				 temp[count]=i;
				 frequency[i]--;
				 count++;
			 }
		 }
		 
		 int result[] = new int[count];
		 for(int i =0 ; i<count;i++) {
			 result[i]=temp[i];
		 }
	       
		 return result;
	 }
	 
	 

}
