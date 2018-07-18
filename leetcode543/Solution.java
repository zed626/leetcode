package leetcode543;


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
   public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        return reverse(root)[1]-1;
   }
   
   public int[] reverse(TreeNode root) {
	  int[] m ={0,0};
	  if(root==null) {
		  return m;
	  }
	  int[] i=reverse(root.left);
	  int[] j=reverse(root.right);
	  m[0]=Math.max(i[0], j[0])+1;
	  m[1]=Math.max(i[0]+j[0]+1,Math.max(i[1], j[1]));
	  return m;
    }
}