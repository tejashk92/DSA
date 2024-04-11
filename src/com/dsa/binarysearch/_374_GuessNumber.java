package com.dsa.binarysearch;

public class _374_GuessNumber extends GuessGame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int guessNumber(int n) {
        return binarySearch(n);
    }
	
	
	  int binarySearch(int n) {
	        int start = 0;
	        int end = n;

	        while(start <= end) {
	            int mid = start + (end - start) / 2;
	            int guess = guess(mid);
	            if (guess == -1) {
	                end = mid - 1;
	            } else if (guess == 1) {
	                start = mid + 1;
	            } else {
	                return mid;
	            }
	        }
	        return -1;
	    }

}

class GuessGame{
	int guess(int num) {
		return 0;
	};
}
