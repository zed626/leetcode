package leetcode530;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	int  c=-1;
	int result=0;
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return 0;
        recuursive(root);
        return result;
    }
    
    public void recuursive(TreeNode root) {
    	if(root==null) return;
    	recuursive(root.left);
    	if(c==-1) {
    		c=root.val;
    		result=Integer.MAX_VALUE;
    	}
    	else {
    		result=root.val-c<result?root.val-c:result;
    		c=root.val;
    	}
    	recuursive(root.right);
    }
}