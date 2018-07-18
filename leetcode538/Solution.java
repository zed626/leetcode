package leetcode538;

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
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return root;
        int [] key={0};
        recursive(root, key);
        return root;
    }
    
    public void recursive(TreeNode root,int []m) {
    	if(root==null) return;
    	recursive(root.right, m);
    	int temp=root.val;
    	root.val+=m[0];
    	m[0]+=temp;
    	recursive(root.left, m);
    }
}