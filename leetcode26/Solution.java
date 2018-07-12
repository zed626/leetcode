package leetcode26;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length<=0) return 0;
        int index=0;
        int temp=0;
        for(int i =0;i<nums.length;i++) {
        	if(i==0 || nums[i]>temp) {
        		temp = nums[i];
        		nums[index++] = nums[i];
        	}
        }
        return index;
    }
}