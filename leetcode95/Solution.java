package leetcode95;


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
    public List<TreeNode> generateTrees(int n) {
    	List<TreeNode>[] trees = new List[n+1];
    	trees[0] = new ArrayList<TreeNode>();
        if(n<=0) return trees[0];
        for(int i=1;i<=n;i++) {
        	trees[i] = new ArrayList<TreeNode>();
        	for(int j = 1;j<=i;j++) {
        		for(TreeNode m:trees[j-1]) {
        			for(TreeNode k:trees[i-j]) {
        				TreeNode root = new TreeNode(j);
        				root.left = m;
        				root.right = clone(k, j);
        				trees[i].add(root);
        			}
        		}
        	}
        }
        return trees[n];
        
    }
    
    private static TreeNode clone(TreeNode n, int offset) {
        if (n == null) {
            return null;
        }
        TreeNode node = new TreeNode(n.val + offset);
        node.left = clone(n.left, offset);
        node.right = clone(n.right, offset);
        return node;
    }
}