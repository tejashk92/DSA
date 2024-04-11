package com.dsa.binarysearch;

public class _34_LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {5,7,7,7,8,8,10};
		int target = 1;
		
		int ans[]=new _34_LeetCode().searchRange(nums,target);
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}
	
	
	
	 public int[] searchRange(int[] arr, int target) {
		 int notFound []={-1,-1};
		 int start = 0;
	     int end = arr.length - 1;
	     int first=-1;
	     int last=-1;
	     
	        while(start <= end) {
	            int mid = start + (end - start) / 2;

	            if (target < arr[mid]) {
	                end = mid - 1;
	            } else if (target > arr[mid]) {
	                start = mid + 1;
	            } else {
	                first=mid;
	                int tempFirst=mid;
	                while(tempFirst!=-1) {
	                	tempFirst=binarySearch(start,  tempFirst - 1, target, arr);
	                	if(tempFirst!=-1) {
	                		first=tempFirst;
	                	}
	                }
	                
	                last=mid;
	                int tempLast=mid;
	                while(tempLast!=-1) {
	                	tempLast=binarySearch(tempLast + 1, end, target, arr);
	                	if(tempLast!=-1) {
	                		last=tempLast;
	                	}
	                }
	                
	                int ans[]= {first,last};
	                return ans;
	            }
	        }
	        return notFound;
	 }
	 
	 public int binarySearch(int start, int end, int target, int arr[] ){
		 int targetIndex=-1;
		 int mid = start + (end - start) / 2;
		 
		 if(start <= end){
			 if(target < arr[mid]) {
				 targetIndex=binarySearch(start,  mid - 1, target, arr);
			 }else if (target > arr[mid]) {
				 targetIndex=binarySearch(mid + 1, end, target, arr);
			 } else {
				 return mid;
			 }
		 }
		
		 
		 return targetIndex;
		 
	 }

}
