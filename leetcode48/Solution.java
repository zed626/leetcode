package leetcode48;

class Solution {
    public void rotate(int[][] matrix) {
        if(matrix==null || matrix.length==0) return ;
        int n=matrix.length;
        for(int i=0;i<n/2;i++) {
        	for(int j=0;j<n/2;j++) {
        		int temp=matrix[i][j];
        		matrix[i][j]=matrix[n-1-j][i];
        		matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
        		matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
        		matrix[j][n-1-i]=temp;
        	}
        }
        if(n%2==1) {
        	int j=n/2;
        	for(int i=0;i<n/2;i++) {
	        	int temp=matrix[i][j];
	    		matrix[i][j]=matrix[n-1-j][i];
	    		matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
	    		matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
	    		matrix[j][n-1-i]=temp;
        	}
        }
    }
}


/*public class Solution {   //转之后水平翻转
    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}*/