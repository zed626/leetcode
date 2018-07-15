package leetcode107;

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(root==null) return lists;
        Queue<TreeNode> queue =new LinkedList<TreeNode>();
        queue.add(root);
        int size= queue.size();
        List<Integer> list = new ArrayList<Integer>();
        while(!queue.isEmpty()){ 	
        	TreeNode tempNode=queue.poll();
        	if(tempNode.left!=null) queue.add(tempNode.left);
        	if(tempNode.right!=null) queue.add(tempNode.right);
        	list.add(tempNode.val);
        	size--;
        	if(size==0){
        		lists.add(0, list);
        		list = new ArrayList<Integer>();
        		size=queue.size();
        	}
        }
        return lists;
    }
}