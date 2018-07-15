package leetcode92;

class Solution {
    public int minDistance(String word1, String word2) {
        if(word1==null || word2 ==null) return 0;
        if(word1.length()==0) return word2.length();
        if(word2.length()==0) return word1.length();
        char[] p1=word1.toCharArray();
        char[] p2=word2.toCharArray();
        int [][] dp = new int[p1.length][p2.length];
        for(int j=0;j<p2.length;j++){   //构造了相同长度的数组，要特别考虑边界条件，如果构造+1长度的数组，边界条件要简单很多。
        	if(p2[j]==p1[0]){
    			for(int k =j;k<p2.length;k++){
    				dp[0][k] = k;
    			}
        		break;
        	}
        	else{
        		dp[0][j] = j+1;
        	}
        }
        for(int i=0;i<p1.length;i++){
        	if(p2[0]==p1[i]){
    			for(int k =i;k<p1.length;k++){
    				dp[k][0] = k;
    			}
        		break;
        	}
        	else{
        		dp[i][0] = i+1;
        	}
        }
        for(int i=0;i<p1.length;i++){
        	for(int j =1;j<p2.length;j++){
        		if(p1[i]==p2[j]) dp[i][j] = Math.min(Math.min(Math.min(dp[i-1][j]+1, dp[i-1][j-1]+1),dp[i][j-1]+1),dp[i-1][j-1]);
        		else dp[i][j]=Math.min(Math.min(dp[i-1][j]+1, dp[i-1][j-1]+1),dp[i][j-1]+1);
        	}
        }
        return dp[p1.length-1][p2.length-1];
    }
}