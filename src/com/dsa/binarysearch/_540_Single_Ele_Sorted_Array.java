package com.dsa.binarysearch;

public class _540_Single_Ele_Sorted_Array {

	public static void main(String[] args) {
		int arr1[] = {3,3,7,7,10,11,11};
		System.out.println(new _540_Single_Ele_Sorted_Array().singleNonDuplicate(arr1));

	}
	
	public int singleNonDuplicate(int[] arr) {
        

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (mid < arr.length - 1 && arr[mid] == arr[mid+1]  ) {
            	if(mid%2!=0) {
            		end = mid - 1;
            	} else {
            		start = mid + 2;
            	}
                
            } else if (mid > 0 && arr[mid] == arr[mid-1]) {
            	if(mid%2==0) {
            		end = mid - 2;
            	} else {
            		start = mid + 1;
            	}
                
            } else {
                // ans found
                return arr[mid];
            }
        }
        return -1;
    
    }

}
