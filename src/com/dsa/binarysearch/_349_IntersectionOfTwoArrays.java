package com.dsa.binarysearch;

public class _349_IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {4,9,5};
		int arr2[] = {9,4,9,8,4};
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
				 frequency[i]=0;
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
