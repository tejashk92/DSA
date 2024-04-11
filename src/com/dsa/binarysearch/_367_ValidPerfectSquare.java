package com.dsa.binarysearch;

public class _367_ValidPerfectSquare {

	public static void main(String[] args) {

		System.out.println(new _367_ValidPerfectSquare().binarySearch(808201));
	}
	
	
	
	 boolean  binarySearch(int target) {
		 
		 if(target ==1){
	            return true;
	        }
		 
        long start = 1;
        long end = target/2;

        while(start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid*mid;
            if (target < square) {
                end = mid - 1;
            } else if (target > square) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
