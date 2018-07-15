package leetcode257;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<String>();
        if(root==null) return list;
        String s=new String("");
        recurvse(root, list, s);
        return list;
    }
    
    public void recurvse(TreeNode root,List<String> list,String s) {
		if(root.left==null && root.right==null){
			list.add(s+root.val);
			return;
		}
		if(root.left!=null){
			recurvse(root.left, list, s+root.val+"->");
		}
		if(root.right!=null){
			recurvse(root.right, list, s+root.val+"->");
		}
	}
}