package leetcode108;

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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0) return null;
        return part(nums, 0, nums.length-1);
    }
    
    public TreeNode part(int[] nums,int start,int end) {
    	if(start>end){
    		return null;
    	}
    	if(start==end){
    		return new TreeNode(nums[end]);
    	}
    	int mid =(start+end)/2;
    	TreeNode root =new TreeNode(nums[mid]);
    	root.left=part(nums, start,mid-1);
    	root.right=part(nums, mid+1, end);
    	return root;
		
	}
}