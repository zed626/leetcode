package leetcode55;

class Solution {
    public boolean canJump(int[] nums) {
        if(nums==null || nums.length==0) return false;
        int dp[]=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++) {
        	for(int j=0;j<i;j++) {
        		if(dp[j]==1 && i-j<=nums[j]) {
        			dp[i]=1;
        			break;
        		}
        	}
        }
        return dp[nums.length-1]==1;
    }
}


/*public boolean canJump(int[] nums) {   更优的算法
    int reachable = 0;
    for (int i=0; i<nums.length; ++i) {
        if (i > reachable) return false;
        reachable = Math.max(reachable, i + nums[i]);
    }
    return true;
}*/