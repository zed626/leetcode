package leetcode496;

import java.util.Arrays;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null) return new int[] {};
        int [] result=new int[nums1.length];
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++) {
        	int left=0,right=nums2.length;
        	while(left<right) {
        		int mid=left+(right-left)/2;
        		if(mid<=nums1[i]) left=mid+1;
        		else {
					right=mid;
				}
        	}
        	result[i]=nums2[left]>nums1[i]?nums2[left]:-1;
        }
        return result;
    }
}