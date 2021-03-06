package leetcode112;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
        	return false;
        }
        return hasPathSums(root, sum);
    }
    
    public boolean hasPathSums(TreeNode root, int sum) {
        if(root==null){
        	if(sum==0) return true;
        	else {
				return false;
			}
        }
        if(root.left==null) return hasPathSums(root.right, sum-root.val);
        if(root.right==null) return hasPathSums(root.left, sum-root.val);
        return hasPathSums(root.left, sum-root.val)||hasPathSums(root.right, sum-root.val);
    }
}*/


public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
    
        if(root.left == null && root.right == null && sum - root.val == 0) return true;
    
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
