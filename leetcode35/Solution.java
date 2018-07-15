package leetcode35;

class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums==null || nums.length==0) return 0;
        int size = nums.length;
        int a=0,b=size-1;
        for(;a<b;){
        	int temp = (a+b)/2;
        	if(nums[temp]==target){
        		return temp;
        	}
        	else if(nums[temp]>target){
        		b=temp-1;
        	}
        	else{
        		a= temp+1;
        	}
        }
        if(nums[a]==target) return a;
        return nums[a]>target?a:a+1;
    }
}