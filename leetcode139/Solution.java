package leetcode139;

import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s==null || wordDict==null) return false;
        int size = s.length();
        boolean [] dp = new boolean[size+1];
        dp[0] = true;
        for(int i=1;i<=size;i++) {
        	for(int j=0;j<i;j++) {
        		if(dp[j] && wordDict.contains(s.substring(j, i))){
        			dp[i] = true;
        			break;
        		}
        	}
        }
        return dp[size];
    }
}