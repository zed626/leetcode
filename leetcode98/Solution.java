package leetcode98;

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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp=root;
        TreeNode k=null;
        while(temp!=null ||!stack.isEmpty()) {
        	if(temp!=null) {	
        		stack.push(temp);
        		temp=temp.left;
        	}
        	else {
        		temp=stack.pop();
        		if(k!=null && k.val>=temp.val) return false;
        		k=temp;
        		temp=temp.right;
        	}
        }
        return true;
    }
}