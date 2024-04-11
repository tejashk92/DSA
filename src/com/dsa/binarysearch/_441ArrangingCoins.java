package com.dsa.binarysearch;


public class _441ArrangingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new _441ArrangingCoins().binarySearch(3));
	}
	
	
	int binarySearch(int n) {
        int start = 0;
        int end =n;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int count =getCount(mid);
            
            if (count < n) {
            	 start = mid + 1;
            } else if (count > n) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
	
	int getCount(int n) {
		int sum=0;
		while(n>0) {
			sum=sum+n;
			n--;
		}
		return sum;
	}
	
	

	public int arrangeCoins(int n) {
		
		int rows=0;
		int balance=n;
		for(int i=1;i<=n;i++) {

			if(balance >= i) {
				balance=balance-i;
				rows++;
			}else {
				break;
			}
			
		}
		return rows;
        
    }

}
