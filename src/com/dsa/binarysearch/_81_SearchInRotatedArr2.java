package com.dsa.binarysearch;

public class _81_SearchInRotatedArr2 {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
		System.out.println(new _81_SearchInRotatedArr2().search(arr, 2));
	}
	
	 public boolean search(int[] nums, int target) {
		 
		 int pivot=findPivot(nums);
		 System.out.println("pivot ="+pivot);
		 boolean result=binarySearch(nums ,0,pivot,target);
		 if(!result && pivot !=nums.length-1) {
			 result=binarySearch(nums ,pivot+1,nums.length-1,target);
		 }
		 return result;
	 }
	 
	 boolean binarySearch(int[] arr,int start,int end, int target) {

	        while(start <= end) {
	            int mid = start + (end - start) / 2;

	            if (target < arr[mid]) {
	                end = mid - 1;
	            } else if (target > arr[mid]) {
	                start = mid + 1;
	            } else {
	                return true;
	            }
	        }
	        return false;
	    }
	
	public  int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            
            if (mid < arr.length-1 && arr[mid] > arr[mid+1]) {
                return mid;
            } 

            if(mid > 0 && arr[mid] < arr[mid -1] || arr[mid] == arr[mid -1]) {
            	return mid-1;
            }
            
            if(arr[mid] <=arr[start]) {
            	end=mid-1;
            } else {
            	start=mid+1;
            }
        }
      return -1; 
	}

}
