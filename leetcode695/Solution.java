package leetcode695;

class Solution {
	int count=0;
    public int maxAreaOfIsland(int[][] grid) {
            if(grid==null || grid.length==0) return 0;
            int counts=0;
            for(int i=0;i<grid.length;i++) {
            	for(int j=0;j<grid[0].length;j++) {
            		if(grid[i][j]==1) {
            			DFSMaking(grid, i, j);
            			if(count>counts) counts=count;
            			count=0;
            		}
            	}
            }
            return counts;
        }
        
        public void DFSMaking(int[][] grid,int i,int j) {
        	if(i<0||i>=grid.length||j<0||j>=grid[0].length) {
        		return;
        	}
        	if(grid[i][j]==0) return;
        	grid[i][j]=0;
        	count++;
    	    DFSMaking(grid, i + 1, j);
    	    DFSMaking(grid, i - 1, j);
    	    DFSMaking(grid, i, j + 1);
    	    DFSMaking(grid, i, j - 1);
        	
        }
    
}