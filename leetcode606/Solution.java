package leetcode606;

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
    public String tree2str(TreeNode t) {
        String a = "";
        if(t==null) return a;
        a+= t.val;
        if(t.left==null && t.right==null) return a ;
        a+="("+tree2str(t.left)+")"; 
        if( t.right!=null) {
        	a+="("+tree2str(t.right)+")"; 
        }
        return a ;
    }
}