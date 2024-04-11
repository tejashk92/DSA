package com.dsa.binarysearch;

public class _278_FirstBadVersion extends VersionControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	int binarySearch(int n) {
        int start = 0;
        int end = n;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (mid >0 && isBadVersion(mid) && isBadVersion(mid-1)) {
                end = mid - 1;
            } else if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}


class VersionControl {
	boolean isBadVersion(int version) {
		return false;
	}
}
