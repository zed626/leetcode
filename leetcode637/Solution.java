package leetcode637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        double num=0;
        while(!queue.isEmpty()) {
        	int m=queue.size();
        	for(int i=0;i<m;i++) {
        		TreeNode temp=queue.poll();
        		num+=temp.val;
        		if(temp.left!=null) queue.add(temp.left);
        		if(temp.right!=null) queue.add(temp.right);
        	}
        	list.add(num/m);
        	num=0;    	
        }
        return list;
    }
}