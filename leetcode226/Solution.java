package leetcode226;

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


class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode temp=invertTree(root.left);      
        root.left=invertTree(root.right);
        root.right=temp;
        return root;
    }
}
