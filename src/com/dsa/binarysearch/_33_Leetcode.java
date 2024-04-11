package com.dsa.binarysearch;

public class _33_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5,1,3};
		System.out.println(findPivot(arr));
	}
	
	public static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            
            if (mid < arr.length-1 && arr[mid] > arr[mid+1]) {
                return mid;
            } 

            if(mid > 0 && arr[mid] < arr[mid -1]) {
            	return mid-1;
            }
            
            if(arr[mid] <=arr[start]) {
            	//larger elements are in left side of mid
            	end=mid-1;
            } else {
            	//larger elements are in right side of mid
            	start=mid+1;
            }
            
        }
      return -1; 
	}

}
