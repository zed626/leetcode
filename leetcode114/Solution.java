package leetcode114;

import java.util.Stack;

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
    public void flatten(TreeNode root) {
        if(root==null) return ;
        Stack<TreeNode> stack=new Stack<>();
        while(root!=null) {
        	if(root.right!=null) stack.push(root.right);
        	if(root.left!=null) {
        		root.right=root.left;
        		root.left=null;
        		root=root.right;
        	}
        	else if(stack.isEmpty()) {
        		break;
        	}
        	else {
        		root.right=stack.pop();
        		root=root.right;
        	}
        }
    }
}


/*private TreeNode prev = null;

public void flatten(TreeNode root) {
    if (root == null)
        return;
    flatten(root.right);
    flatten(root.left);
    root.right = prev;
    root.left = null;
    prev = root;
}*/