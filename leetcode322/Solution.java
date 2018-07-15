package leetcode322;

class Solution {
    public int coinChange(int[] coins, int amount) {
         if(coins==null || coins.length<=0 || amount<0) {
        	 return -1;
         }
         int [] dp = new int[amount+1];
         for(int i=0;i<amount;i++){
        	 dp[i] = 0;
         }
         return solve(coins,amount,dp);
    }
    public int solve(int[] coins, int amount,int[] dp){
    	if(amount<0){
    		return -1;
    	}
    	if(amount==0){
    		return 0;
    	}
    	if(dp[amount-1]!=0){
    		return dp[amount-1];
    	}
    	int min = Integer.MAX_VALUE;
    	for(int coin:coins){
    		int res = solve(coins, amount-coin, dp);
    		if(res>=0 && res <min){
    			min =res+1;
    		}
    	}
    	dp[amount-1] = (min==Integer.MAX_VALUE) ? -1 : min;
    	return dp[amount-1];
    }
}