package leetcode70;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid ==null || obstacleGrid.length<1 || obstacleGrid[0].length<1){
        	return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] dp = new int [m][n];
        for(int i=0;i<m;i++){
        	if(obstacleGrid[i][0]==0){
        		dp[i][0]=1;
        	}
        	else{
        		for(int k=i;k<m;k++){
        			dp[k][0]=0;
        		}
        		break;
        	}
        }
        for(int j=0;j<n;j++){
        	if(obstacleGrid[0][j]==0){
        		dp[0][j]=1;
        	}
        	else{
        		for(int k=j;k<n;k++){
        			dp[0][k]=0;
        		}
        		break;
        	}
        }
        for(int i=1;i<m;i++){
        	for(int j=1;j<n;j++){
        		if(obstacleGrid[i][j]==0){
        			dp[i][j] = dp[i][j-1]+dp[i-1][j];
        		}
        		else{
        			dp[i][j] = 0;
        		}
        	}
        }
        return dp[m-1][n-1];
    }
}