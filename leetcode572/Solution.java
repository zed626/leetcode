package leetcode572;

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
    public boolean isSubtree(TreeNode s, TreeNode t) {
    	if(s==null && t==null) return true;
    	if(s==null || t==null) return false;
        if(reverse(s, t)) {
        	return true;
        }
        if(isSubtree(s.left, t)||isSubtree(s.right, t)) {
        	return true;
        }
        return false;
    }
    
    public boolean reverse(TreeNode a,TreeNode b) {
    	if(a==null && b==null) return true;
    	if(a==null || b==null) return false;
    	if(a.val!=b.val) {
    		return false;
    	}
    	return reverse(a.left, b.left) && reverse(a.right, b.right);
    }
}