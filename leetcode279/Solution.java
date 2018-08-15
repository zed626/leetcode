package leetcode279;

import java.util.Arrays;

class Solution {	
	public int numSquares(int n) {
		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i = 1; i <= n; ++i) {
			int min = Integer.MAX_VALUE;
			int j = 1;
			while(i - j*j >= 0) {
				min = Math.min(min, dp[i - j*j] + 1);
				++j;
			}
			dp[i] = min;
		}		
		return dp[n];
	}
}


/*    public int numSquares(int n) {
if(n<=0) return -1;
int k=(int) Math.sqrt(n);
int [] dp=new int [n+1];
for(int i=1;i<=k;i++) {
	dp[i*i]=1;
}
for(int i=1;i<=n;i++) {
	if(dp[i]==0) {
    	dp[i]=Integer.MAX_VALUE;
    	for(int j=1;j<=i/2;j++) {
    		if(dp[j]+dp[i-j]<dp[i]) {
    			dp[i]=dp[j]+dp[i-j];
    		}
	}
	}
}
return dp[n];
}*/