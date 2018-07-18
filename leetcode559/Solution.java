package leetcode559;


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
	 public int maxDepth(Node root) {
	     if(root==null) return 0;
	     int m=1;
	     for(Node temp:root.children) {
	    	 int n=maxDepth(temp);
	    	 if(n+1>m) {
	    		 m=n+1;
	    	 }
	     }
	     return m;
	     
	 }
}