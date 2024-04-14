package com.dsa.binarysearch;

public class _875_Koko_Eating_Bananas {

	public static void main(String[] args) {
		
		  int arr[]= {30,11,23,4,20}; int h=5; int result=new
		  _875_Koko_Eating_Bananas().minEatingSpeed(arr, h);
		  System.out.println(result);
		 

	}
	
	public boolean canEat(int[] piles, int h,int eatSpeed) {
		int hoursConsumed=0;
		for(int pile:piles) {
			hoursConsumed=hoursConsumed+((pile%eatSpeed == 0)?pile/eatSpeed:(pile/eatSpeed)+1);
			if(hoursConsumed > h) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public int minEatingSpeed(int[] piles, int h) {
		
		int max=0;
		for(int pile:piles) {
			max=Math.max(max, pile);
		}
		System.out.println("max is :"+max);
		if(piles.length == h) {
			return max;
		}
		return ceiling(max,h,piles);
    }
	
	 int ceiling(int max,int hour ,int piles[]) {
        int start = 1;
        int end = max;
        int result=0;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (canEat(piles,hour,mid)) {
            	result=mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            } 
        }
        return result;
    }

}
