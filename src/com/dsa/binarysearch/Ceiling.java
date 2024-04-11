package com.dsa.binarysearch;

public class Ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,5,9,14,16,18};
		int target=17;
		System.out.println('a' < 'b');
	}
	
	public static int ceiling(int arr[],int target) {
		int start=0;
		int end=arr.length-1;
		int ceiling=arr[end]+1;
		
		while(start <= end) {
			int mid= start + ((end-start)/2);
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) {
				start=mid+1;
			}else {
				ceiling=mid;
				end=mid-1;
			}
		}
		
		
		return ceiling;
	}
	
	 static int binarySearch(int[] arr, int target) {
	        int start = 0;
	        int end = arr.length - 1;

	        while(start <= end) {
	            int mid = start + (end - start) / 2;

	            if (target < arr[mid]) {
	                end = mid - 1;
	            } else if (target > arr[mid]) {
	                start = mid + 1;
	            } else {
	                return mid;
	            }
	        }
	        return start;
	    }

}
