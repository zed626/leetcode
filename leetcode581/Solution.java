package leetcode581;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums==null) return 0;
        int left=0,right=1;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0,j=nums.length-1;j>=0;i++,j--) {
        	max=Math.max(max, nums[i]);
        	if(nums[i]!=max) {
        		left=i;
        	}
        	min=Math.min(min, nums[j]);
        	if(nums[j]!=min) {
        		right=j;
        	}
        }
        return left-right+1;
    }
}