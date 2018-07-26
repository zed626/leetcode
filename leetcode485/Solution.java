package leetcode485;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int index=0;
        int max=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==0) {
        		if(index>max) {
        			max=index;
        		}
        		index=0;
        	}
        	else {
        		index++;
        	}
        }
        if(index>max) max=index;
        return max;
    }
}