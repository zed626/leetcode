package leetcode563;


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
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        return  reverse(root)[1];
        
    }
    
    public int[] reverse(TreeNode root) {
    	int[] k= {0,0};
    	if(root==null) return k;
    	int[] m=reverse(root.left);
    	int[] n=reverse(root.right);
    	k[0]=m[0]+n[0]+root.val;
    	k[1]=m[1]+n[1]+Math.abs(m[0]-n[0]);
    	return k;
    }
}