package leetcode102;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
        if(root==null) return lists;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
        	List<Integer> list=new ArrayList<>();
        	int size=queue.size();
        	for(int i=0;i<size;i++) {
        		TreeNode node=queue.poll();
        		list.add(node.val);
        		if(node.left!=null) queue.add(node.left);
        		if(node.right!=null)  queue.add(node.right);
        	}
        	lists.add(list);
        }
        return lists;
    }
}