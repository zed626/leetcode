package leetcode96;


class Solution {
    public int numTrees(int n) {
        if(n<0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        int [] dp = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++) {
        	for(int j=1;j<=i;j++) {
        		dp[i] += dp[j-1]*dp[i-j];
        	}
        }
        return dp[n];
    }
}