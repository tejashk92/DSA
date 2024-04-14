package com.dsa.binarysearch;

public class _436_Find_Right_Interval {

	public static void main(String[] args) {
		int[][] intervals= {{1,4},{2,3},{3,4}};

		Util.print(new _436_Find_Right_Interval().findRightInterval(intervals));
		System.out.println(3%2);

	}

	public int[] findRightInterval(int[][] intervals) {

		if(intervals.length ==1  && intervals[0][0] < intervals[0][1]) {
			int ans[] = {-1};
			return ans;
		}else {
			int ans [] = new int[intervals.length];

			for(int i=0;i<intervals.length;i++) {
				int end=intervals[i][1];
				int result= -1;
				int min=Integer.MAX_VALUE;
				for(int j=0 ;j<intervals.length;j++) {

					int start=intervals[j][0];
					if(start >= end && start < min ) {
						min=start;
						result=j;
					}

				}

				ans[i]=result;
			}
			return ans;
		}
	}
}
