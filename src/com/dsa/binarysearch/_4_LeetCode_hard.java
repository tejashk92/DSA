package com.dsa.binarysearch;

public class _4_LeetCode_hard {

	public static void main(String[] args) {

		int c []=new int [9];
		System.out.println(c[5]);

	}
	
	
	int [] mergeArray(int a[],int b[]) {
		
		int c []=new int [a.length + b.length];
		
		for(int i:b) {
			c[binarySearch(a,i)]=i;
		}
		return c;
	}
	
	int binarySearch(int[] arr, int target) {
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
        return -1;
    }

}
