package leetcode53;

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length<1) return 0;
        int max = Integer.MIN_VALUE;
        int temp = max;
        for(int i=0;i<nums.length;i++){
        	if(temp>=0){
        		temp+=nums[i];
        	}
        	else{
        		temp = nums[i];
        	}
        	if(temp>max){
        		max=temp;
        	}
        }
        return max;
        
    }
}