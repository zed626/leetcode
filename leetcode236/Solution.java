package leetcode236;



import java.util.LinkedList;
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
class Solution {   //229ms
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> k1=new LinkedList<>();
        List<TreeNode>k2=new LinkedList<>();
        find(root,p, k1);
        find(root, q, k2);
        int size=Math.min(k1.size(), k2.size());
        int i=0;
        for(i=0;i<size;i++){
        	if(k1.get(i)!=k2.get(i)) break;
        }
        return k1.get(i-1);
    }
    
    public boolean find(TreeNode p,TreeNode target,List<TreeNode> list) {
    	if(p==target) {
    		list.add(p);
    		return true;
    	}
    	list.add(p);
    	if(p.left!=null && find(p.left, target,list)) return true;
    	if(p.right!=null && find(p.right, target,list)) return true;
    	list.remove(list.size()-1);
    	return false;
    }
}


/*public class Solution {   //11ms
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)  return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)   return root;
        return left != null ? left : right;
    }
}*/