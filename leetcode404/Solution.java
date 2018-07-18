package leetcode404;

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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        return recursion(root, true);
    }
    
    public int recursion(TreeNode root,boolean left) {
    	if(root.left==null && root.right==null &&  left) {
    		return root.val;
    	}
    	else if(root.left==null && root.right==null) {
    		return 0;
    	}
    	else if(root.left!=null && root.right!=null) {
    		return recursion(root.left, true)+recursion(root.right, false);
    	}
    	else if(root.left!=null) {
    		return recursion(root.left, true);
    	}
    	else {
    		return recursion(root.right, false);
    	}
    	
    }
}

/*public int sumOfLeftLeaves(TreeNode root) {
    if(root == null) return 0;
    int ans = 0;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    
    while(!stack.empty()) {
        TreeNode node = stack.pop();
        if(node.left != null) {
            if (node.left.left == null && node.left.right == null)
                ans += node.left.val;
            else
                stack.push(node.left);
        }
        if(node.right != null) {
            if (node.right.left != null || node.right.right != null)
                stack.push(node.right);
        }
    }
    return ans;
}*/