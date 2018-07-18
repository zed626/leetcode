package leetcode501;


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
    public int[] findMode(TreeNode root) {  	
        if(root==null) return  new int[]{};
        List<Integer> list=new ArrayList<Integer>();
        int [] num=new int [3];
        recursive(root, list, num);
		if(num[1]>num[2]) {
			list.clear();
			list.add(num[0]);
		}
		else if(num[1]==num[2]) {
			list.add(num[0]);
		}
        int[] key=new int[list.size()];
        for(int i=0;i<list.size();i++) {
        	key[i]=list.get(i);
        }
        return key;
        
    }
    
    public void recursive(TreeNode root,List <Integer>list,int []num) {
    	if(root==null) return;
    	recursive(root.left, list, num);
    	if(num[1]==0) {
    		num[0]=root.val;
    		num[1]++;
    	}
    	else {
	    	if(root.val==num[0]) {
	    		num[1]++;
	    	}
	    	else {
	    		if(num[1]>num[2]) {
	    			list.clear();
	    			list.add(num[0]);
	    			num[0]=root.val;
	    			num[2]=num[1];
	    			num[1]=1;
	    		}
	    		else if(num[1]==num[2]) {
	    			list.add(num[0]);
	    			num[0]=root.val;
	    			num[2]=num[1];
	    			num[1]=1;
	    		}
	    		else {
	    			num[0]=root.val;
	    			num[1]=1;
	    		}
	    	}
    	}
    	recursive(root.right, list, num);
    }
}