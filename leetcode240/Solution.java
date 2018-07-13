package leetcode240;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix==null || matrix.length==0 || matrix[0].length==0) return false;
    	int i=0;
    	int j=matrix[0].length-1;
        for(;i<matrix.length && j>=0;) {
        	if(matrix[i][j]==target) {
        		return true;
        	}
        	else if(matrix[i][j]>target) {
        		j--;
        	}
        	else {
        		i++;
        	}
        }
        return false;
    }
}