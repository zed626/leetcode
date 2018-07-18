package leetcode437;

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
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        List<Integer> list=new ArrayList<Integer>();
        return recusivive(list, root, sum);
    }
    
    public int recusivive(List<Integer> list,TreeNode root,int m) {
    	if(root==null) return 0;
    	List<Integer> list1=new ArrayList<Integer>();
    	int k=0;
    	for(int i=0;i<list.size();i++) {
    		int temp=list.get(i);
    		if(temp+root.val==m) {
    			k++;
    		}
    		list1.add(temp+root.val);
    	}
    	if(root.val==m) k++;
    	list1.add(root.val);
    	return k+recusivive(list1, root.left, m)+recusivive(list1, root.right, m);
    }
    
}


/*public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;
        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    public int findPath(TreeNode root, int sum){
        int res = 0;
        if(root == null)
            return res;
        if(sum == root.val)
            res++;
        res += findPath(root.left, sum - root.val);
        res += findPath(root.right, sum - root.val);
        return res;
    }
   
}*/