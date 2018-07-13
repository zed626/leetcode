package leetconde120;

import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null)  return -1;
        int k = triangle.size();
        int [][] dp = new int[k][k];
        int min=Integer.MAX_VALUE;
        for(int i =0;i<triangle.size();i++) {
        	List<Integer> list = triangle.get(i);
        	for(int j=0;j<list.size();j++) {
        		if(i==0) {
        			dp[i][j]=list.get(j);
        		}
        		else {
        			if(j==0) {
        				dp[i][j] = list.get(j)+dp[i-1][0];
        			}
        			else if(j==list.size()-1) {
        				dp[i][j] = list.get(j)+dp[i-1][j-1];
        			}
        			else {
        				dp[i][j] = list.get(j)+Math.min(dp[i-1][j-1], dp[i-1][j]);
        			}
        			
        		}
        	}
        }
        for(int i=0;i<triangle.size();i++) {
        	if(dp[triangle.size()-1][i]<min) {
        		min = dp[triangle.size()-1][i];
        	}
        }
        return min;
        
    }
}