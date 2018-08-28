package leetcode200;

class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int count=0;
        for(int i=0;i<grid.length;i++) {
        	for(int j=0;j<grid[0].length;j++) {
        		if(grid[i][j]=='1') {
        			DFSMaking(grid, i, j);
        			count++;
        		}
        	}
        }
        return count;
    }
    
    public void DFSMaking(char[][] grid,int i,int j) {
    	if(i<0||i>=grid.length||j<0||j>=grid[0].length) {
    		return;
    	}
    	if(grid[i][j]=='0') return;
    	grid[i][j]='0';
	    DFSMaking(grid, i + 1, j);
	    DFSMaking(grid, i - 1, j);
	    DFSMaking(grid, i, j + 1);
	    DFSMaking(grid, i, j - 1);
    	
    }
}