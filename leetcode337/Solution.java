package leetcode337;

import java.util.HashMap;

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
	HashMap<TreeNode, Integer> map=new HashMap<TreeNode, Integer>();
	
    public int rob(TreeNode root) {
        if(root==null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int ll=0,lr=0,rl=0,rr=0;
        if(root.left!=null){
        	ll=rob(root.left.left);
        	lr=rob(root.left.right);
        }
        if(root.right!=null){
        	rl=rob(root.right.left);
        	rr=rob(root.right.right);
        }
        int result= Math.max((root.val+ll+lr+rl+rr), rob(root.left)+rob(root.right));
        map.put(root, result);
        return result;
    }
}


/*dfs树的所有节点，每个节点返回两个数字，int [] num，num [0]是抢夺此节点时的最大值，num [1]是最大值而不抢夺此值。当前节点返回值仅取决于其子节点的值。变换功能应该很容易理解。

public class Solution {
    public int rob(TreeNode root) {
        int[] num = dfs(root);
        return Math.max(num[0], num[1]);
    }
    private int[] dfs(TreeNode x) {
        if (x == null) return new int[2];
        int[] left = dfs(x.left);
        int[] right = dfs(x.right);
        int[] res = new int[2];
        res[0] = left[1] + right[1] + x.val;
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;
    }
}*/