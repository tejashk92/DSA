package com.dsa.binarysearch;

import java.util.HashSet;

public class _888_FairCandySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,3};
		int arr2[] = {2};
		Util.print(fairCandySwap(arr1,arr2));
	}
	
	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        //Find Sum of all candies & divide by 2 ==> Equality
		int aliceSum=0;
		int bobSum=0;
		
		HashSet<Integer> hs = new HashSet<>();
		
		int result [] = new int[2];
		
		for(int i:aliceSizes) {
			aliceSum=aliceSum+i;
		}
		
		for(int i:bobSizes) {
			bobSum=bobSum+i;
			hs.add(i);
		}
		
		int fairShare=(aliceSum+bobSum)/2;
		
		for(int i=0;i<aliceSizes.length;i++) {
			int target=fairShare-aliceSum+aliceSizes[i];
			if(hs.contains(target)) {
				result[0]=aliceSizes[i];
				result[1]=target;
			}
			
			}
		
		return result;
    }

}
