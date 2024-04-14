package com.dsa.binarysearch;

public class _287_Find_Duplicate {
	
	static _287_Find_Duplicate o = new _287_Find_Duplicate();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,3,4,2,2};
		System.out.println(o.findDuplicate(arr));
	}
	
	public int findDuplicate(int[] nums) {
		
		int frequency[]=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			
			if(frequency[nums[i]] > 0) {
				return nums[i];
			}else {
				frequency[nums[i]] ++;
			}
		}
        return -1;
    }

}
