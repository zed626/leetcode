package leetcode189;

class Solution {
    public void rotate(int[] nums, int k) {
        int size=nums.length;
        k=k%size;
        if(k<=0 || nums.length==1) return;
        reverse(nums, 0, size-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, size-1);
    }
    
    public void reverse(int[]nums,int m,int n) {
    	for(int i=m;i<=(m+n)/2;i++) {
    		int temp=nums[i];
    		nums[i]=nums[m+n-i];
    		nums[m+n-i]=temp;
    	}
    }
}