package leetcode31;

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int i=nums.length-1;
        while(i>0 && nums[i]<=nums[i-1]) {
        	i--;
        }
        if(i>0) {
        	for(int j=nums.length-1;j>=i;j--) {
        		if(nums[j]>nums[i-1]) {
        			int temp=nums[i-1];
        			nums[i-1]=nums[j];
        			nums[j]=temp; 
        			break;
        		}
        	}
        }
        int left=i,right=nums.length-1;
        while(left<right) {
        	int temp=nums[left];
        	nums[left++]=nums[right];
        	nums[right--]=temp;
        }
    }
}