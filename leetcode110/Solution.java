package leetcode110;

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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return recursion(root)!=-1;
    }
    public int recursion(TreeNode root) {
		if(root==null) return 0;
		int left=recursion(root.left);
		int right = recursion(root.right);
		if(left==-1 || right==-1 || Math.abs(left-right)>1){
			return -1;
		}
		return Math.max(left, right)+1;
	}
}