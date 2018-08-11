package leetcode494;

/*class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums==null || nums.length==0) return 0;
        return recursive(nums, S, 0);
        
    }
    
    public int recursive(int []nums,int S,int index) {
    	if(index==nums.length-1) {
    		int k=0;
    		if(S==nums[index]) k++;
    		if(S==-nums[index]) k++;
    		return k;
    	}
    	else {
    		return recursive(nums, S-nums[index], index+1)+recursive(nums,S+nums[index],index+1);
    	}
    }
}*/

class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums==null || nums.length==0) return 0;
        int sum=0;
        for(int k:nums) sum+=k;
        if(S>sum) return 0;
        int [] dp=new int[2*sum+1];
        dp[sum]=1;
        for(int k:nums) {
        	int next[]=new int[2*sum+1];
        	for(int i=0;i<dp.length;i++) {
        		if(dp[i]!=0) {
        			next[i-k]+=dp[i];
        			next[i+k]+=dp[i];
        		}
        	}
        	dp=next;
        }
        return dp[sum+S];
    }
}