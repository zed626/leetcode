package leetcode88;


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp=m+n-1;
        int i=m-1,j=n-1;
        while(i>=0 && j>=0) {
        	if(nums1[i]>=nums2[j]) {
        		nums1[temp--]=nums1[i--];
        	}
        	else {
        		nums1[temp--]=nums2[j--];
        	}
        }
        while(j>=0) {
        	nums1[temp--]=nums2[j--];
        }
    }
}