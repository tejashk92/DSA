package com.dsa.binarysearch;

public class _35_LeetCode {
	
	
	public static void main(String args[]) {
		
		int arr[]= {0,1,2,3,4,5,10,11,12,17,25,33,44};
		int target=20;
		System.out.println(binarySearch(arr, target));
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
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
