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
    	TreeNode k=root;
    	while(k.left!=null) {
	    	if(k.left.val>=L) {
	    			k=k.left;
			}
	    	else if(k.left.right!=null && k.left.right.val>=L) {
	    		k.left=k.left.right;
	    		k=k.left;
	    	}
	    	else {
				k.left=null;
				break;
			}
	    	
    	}
    	k=root;
    	while(k.right!=null) {
	    	if(k.right.val<=R) {
	    			k=k.right;
			}
	    	else if(k.right.left!=null && k.left.right.val<=R) {
	    		k.right=k.right.left;
	    		k=k.right;
	    	}
	    	else {
				k.right=null;
				break;
			}
    	}
        return root;
    }
   
}

