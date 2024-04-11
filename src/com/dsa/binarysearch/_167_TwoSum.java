package com.dsa.binarysearch;

public class _167_TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	static int [] binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result []= {-1,-1};

        while(start <= end) {
            int mid = start + (end - start) / 2;

            int sum=arr[mid]+arr[mid+1];
            if (sum > target) {
                end = mid - 1;
            } else if (sum < target) {
                start = mid + 1;
            } else {
            	int [] rs= {mid+1,mid+2};
                return rs;
            }
        }
        return result;
    }

}
