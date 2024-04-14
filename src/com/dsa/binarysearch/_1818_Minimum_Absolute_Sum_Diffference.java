package com.dsa.binarysearch;

import java.util.Arrays;
import java.util.HashMap;

public class _1818_Minimum_Absolute_Sum_Diffference {
	
	static _1818_Minimum_Absolute_Sum_Diffference o= new _1818_Minimum_Absolute_Sum_Diffference();
	
	public static void main(String[] args) {
		//int nums1 []= {57,42,21,28,30,25,22,12,55,3,47,18,43,29,20,44,59,9,43,7,8,5,42,53,99,34,37,88,87,62,38,68,31,3,11,61,93,34,63,27,20,48,38,5,71,100,88,54,52,15,98,59,74,26,81,38,11,44,25,69,79,81,51,85,59,84,83,99,31,47,31,23,83,70,82,79,86,31,50,17,11,100,55,15,98,11,90,16,46,89,34,33,57,53,82,34,25,70,5,1};
		//int nums2 []= {76,3,5,29,18,53,55,79,30,33,87,3,56,93,40,80,9,91,71,38,35,78,32,58,77,41,63,5,21,67,21,84,52,80,65,38,62,99,80,13,59,94,21,61,43,82,29,97,31,24,95,52,90,92,37,26,65,89,90,32,27,3,42,47,93,25,14,5,39,85,89,7,74,38,12,46,40,25,51,2,19,8,21,62,58,29,32,77,62,9,74,98,10,55,25,62,48,48,24,21};
		//System.out.println(o.minAbsoluteSumDiff(nums1, nums2));
		int nums22 [] = {1,10,4,4,2,7};
		Arrays.sort(nums22);
		System.out.println(nums22[o.ceiling(nums22,9)]);
	}
	
	public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        
		//StringBuilder sb=new StringBuilder("");
		int mod = (int)1e9+7;
		int [] copy=Arrays.copyOf(nums1, nums1.length);
		Arrays.sort(copy);
		int answer=0;
		HashMap<Integer,int []> map = new HashMap<>();
		int maxDifference=Integer.MIN_VALUE;
		for(int i=0;i<nums2.length;i++) {
			
			if(nums1[i] == nums2[i]) {
				continue;
			}else {
					int result;//closestNumberToTarget(copy,nums2[i]);
					int ceiling=copy[ceiling(copy,nums2[i])];
					int floor=copy[floor(copy,nums2[i])];
					if(Math.abs(ceiling - nums2[i]) < Math.abs(floor - nums2[i])) {
						result=ceiling;
					}else {
						result=floor;
					}
					
					if(result != nums2[i]) {
						int a[]= new int[2];
						a[0]=i;
						a[1]=result;
						int diff=Math.abs(nums1[i]-result);
						map.put(diff, a);
						if(diff > maxDifference) {
							maxDifference=diff;
						}
					}
					//System.out.println("Closest number is "+result);
				/*
				 * sb.append(" |").append(nums1[i]+"-"+nums2[i]+"|"); if(i!=nums2.length-1) {
				 * sb.append(" +"); }
				 */
			}
		}
		
		System.out.println("Max is"+maxDifference);
		map.forEach((k,v)->{
			System.out.println(k+" --"+v[0]+","+v[1]);
		});
		
		nums1[map.get(maxDifference)[0]]=map.get(maxDifference)[1];
		
		for(int i=0;i<nums2.length;i++) {
			answer=(answer + Math.abs(nums1[i] - nums2[i])) % mod;
		}
		
		return answer;
    }
	
	
	 int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
	 
	 int floor(int[] arr, int target) {
	        int start = 0;
	        int end = arr.length - 1;

	        while(start <= end) {
	            int mid = start + (end - start) / 2;

	            if (target < arr[mid]) {
	                end = mid - 1;
	            } else if (target > arr[mid]) {
	                start = mid + 1;
	            } else {
	                return mid;
	            }
	        }
	        return end;
	    }

	
	 int closestNumberToTarget(int[] arr, int target) {
		/*System.out.print("Find closest number to "+target+" in [");
		Arrays.stream(arr).forEach(i -> {
			System.out.print(" "+i);
		});
		
		System.out.println(" ]");*/
        int start = 0;
        int end = arr.length - 1;
        int currentMin=Integer.MAX_VALUE;
        int result=-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int n=Math.abs(target - arr[mid]);
            	currentMin=n;
            	result=arr[mid];
            
            while( mid > 0 && arr[mid] == arr[mid-1]) {
            	mid--;
            }
            
            while( mid < arr.length -1 && arr[mid] == arr[mid+1]) {
            	mid++;
            }
            
            if (mid > 0  && Math.abs(target - arr[mid -1]) < currentMin) {
                end = mid - 1;
            } else if (mid < arr.length -1  && Math.abs(target - arr[mid + 1]) < currentMin) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return result;
    }
}
