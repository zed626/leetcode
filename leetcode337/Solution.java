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


/*dfs�������нڵ㣬ÿ���ڵ㷵���������֣�int [] num��num [0]������˽ڵ�ʱ�����ֵ��num [1]�����ֵ���������ֵ����ǰ�ڵ㷵��ֵ��ȡ�������ӽڵ��ֵ���任����Ӧ�ú�������⡣

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