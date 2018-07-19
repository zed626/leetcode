package leetcode669;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
    	if(root==null) return null;
    	if(root.val>R) return trimBST(root.left, L, R);
        if(root.val<L) return trimBST(root.left, L, R);
        root.left=trimBST(root.left, L, R);
        root.right=trimBST(root.right, L, R);
        return root;
    }
    
}
*/

class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
    	if(root==null) return null;
    	while(root.val<L || root.val>R) {
    		if(root.val<L) {
    			root=root.right;
    		}
    		else if(root.val>R) {
    			root=root.left;
    		}
    		if(root==null) return null;
    	}
        TreeNode dummy = root;
        // Remove the invalid nodes from left subtree.
        while (dummy != null) {
            while (dummy.left != null && dummy.left.val < L) {
                dummy.left = dummy.left.right; 
                // If the left child is smaller than L, then we just keep the right subtree of it. 
            }
            dummy = dummy.left;
        }
        dummy = root;
        // Remove the invalid nodes from right subtree
        while (dummy != null) {
            while (dummy.right != null && dummy.right.val > R) {
                dummy.right = dummy.right.left;
                // If the right child is biggrt than R, then we just keep the left subtree of it. 
            }
            dummy = dummy.right;
        }
        return root;
    }
   
}

