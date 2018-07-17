package leetcode653;

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
	int target;
    public int findSecondMinimumValue(TreeNode root) {
    	target =-1;
        reverse(root);
        return target;
    }
    
    public void reverse(TreeNode root) {
    	if(root.left==null) return ;
    	if(root.left.val==root.right.val) {
    		reverse(root.left);
    		reverse(root.right);
    	}
    	else if(root.left.val>root.right.val) {
    		if(target>root.left.val || target==-1)
    		target=root.left.val;
    		reverse(root.right);
    	}
    	else {
    		if(target>root.right.val|| target==-1)
    		target=root.right.val;
    		reverse(root.left);
    	}
    	
    }
}



/*public int findSecondMinimumValue(TreeNode root) {
    if(root.left == null) return -1;
    
    int l = root.left.val == root.val ? findSecondMinimumValue(root.left) : root.left.val;
    int r = root.right.val == root.val ? findSecondMinimumValue(root.right) : root.right.val;
    
    return l == -1 || r == -1 ? Math.max(l, r) : Math.min(l, r);
}*/