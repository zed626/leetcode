package leetcode94;

import java.util.ArrayList;
import java.util.List;
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null) return list;
        Stack<TreeNode> stack= new Stack<>();
        stack.push(root);
        while(stack.size()>0) {
        	TreeNode temp = stack.pop();
        	list.add
        }
        
    }
}