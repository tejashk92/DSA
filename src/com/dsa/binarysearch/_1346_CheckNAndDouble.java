package com.dsa.binarysearch;

import java.util.Arrays;

public class _1346_CheckNAndDouble {
	
	
	public static void main(String args[]) {
		
		int arr1[] = {-2,0,10,-19,4,6,-8};
		System.out.println(new _1346_CheckNAndDouble().checkIfExist(arr1));
	}

	
	public boolean checkIfExist(int[] arr) {
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		
		for(int i=0;i<arr.length;i++) {
			
			int target=arr[i]*2;
			if(target == max) {
				return true;
			}else if(target < max) {
				int result = binarySearch(arr,target);
				
				if(result !=-1 && result !=i ) {
					return true;
				}
			}
		}
		return false;
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
