package leetcode589;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
        if(root==null ) return list;
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.empty()) {
        	Node temp=stack.pop();
        	list.add(temp.val);
        	int num=temp.children.size();
        	for(int i=0;i<num;i++) {
        		stack.push(temp.children.get(num-1-i));
        	}
        }
        return list;
    }
}