package leetcode689;


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
	int len=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        len=0;
        recurssive(root, root.val);
        return len;
        
    }
    
    public int recurssive(TreeNode root,int target) {
    	if(root==null) return 0;
    	int left=recurssive(root.left, root.val);
    	int right=recurssive(root.right, root.val);
    	len=Math.max(len, left+right);
    	if(target==root.val) {
    		return Math.max(left, right)+1;
    	}
    	return 0;
    }
}

