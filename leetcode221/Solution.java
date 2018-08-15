package leetcode221;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null || matrix.length==0) return 0;
        int m=matrix.length,n=matrix[0].length;
        int [][] num=new int [m+1][n+1];
        int max=0;
        for(int i=1;i<=m;i++) {
        	for(int j=1;j<=n;j++) {
        		if(matrix[i-1][j-1]=='1') {
        			num[i][j]=Math.min(num[i-1][j-1], Math.min(num[i-1][j], num[i][j-1]))+1;
        			max=Math.max(max, num[i][j]);
        		}
        	}
        }
        return max*max;
    }
}