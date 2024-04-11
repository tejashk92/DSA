package com.dsa.binarysearch;

public class _1539_MissingPositiveNumber {

	public static void main(String[] args) {
		// UNABLE TO DO THIS WITH BINARY SEARCH
		int arr[] = {2,3,4,7,11};
		int target=5;
		System.out.println(findKthPositive(arr, target));
		

	}
	
	 public static int findKthPositive(int[] arr, int k) {

		 int length=arr.length;
		 int missingNumbersInArray=arr[length-1]-length;
		 
		 if(k <= missingNumbersInArray) {

			 int missingCount=0;
			 for(int i=1,j=0;i<=arr[length-1];i++) {
				 if(i == arr[j]) {
					 j++;
				 }else {
					 missingCount++;
					 if(missingCount == k) {
						 return i;
					 }
				 }
			 }
		 }else {
			 return arr[length-1]+ (k-missingNumbersInArray);
		 }
		 
		 return -1;
	 }

}
