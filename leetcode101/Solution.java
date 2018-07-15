package leetcode101;
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isPart(root.left, root.right);
    }
    
    public boolean isPart(TreeNode left,TreeNode right){
    	if(left==null && right==null) return true;
    	if(left!=null && right!=null) {
    		return left.val==right.val && isPart(left.left, right.right) && isPart(left.right, right.left);
    		
    	}
    	else return false;
    }
}