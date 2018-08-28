package leetcode238;

class Solution {
    public int[] productExceptSelf(int[] nums) {
    	if(nums==null || nums.length==0) return new int[]{};
        int k[]=new int[nums.length];
        k[0]=1;
        for(int i=1;i<nums.length;i++) {
        	k[i]=k[i-1]*nums[i-1];
        }
        int key=1;
        for(int i=nums.length-1;i>=0;i--) {
        	k[i]*=key;
        	key*=nums[i];
        }
        return  k;
        
    }
}