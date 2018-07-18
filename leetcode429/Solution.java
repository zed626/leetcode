package leetcode429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
//Definition for a Node.
class Node {
 public int val;
 public List<Node> children;

 public Node() {}

 public Node(int _val,List<Node> _children) {
     val = _val;
     children = _children;
 }
};
*/
class Solution {
 public List<List<Integer>> levelOrder(Node root) {
     List<List<Integer>> lists=new ArrayList<>();
     if(root==null) return lists;
     Queue<Node> stack= new LinkedList<>();
     stack.add(root);
     while(!stack.isEmpty()) {
    	 int size=stack.size();
    	 List<Integer> list = new ArrayList<>();
    	 for(int i=0;i<size;i++) {
    		 Node temp=stack.poll();
    		 list.add(temp.val);
    		 for(Node k:temp.children) {
    			 stack.add(k);
    		 }		 
    	 }
    	 lists.add(list);
     }
     return lists;
 }
}