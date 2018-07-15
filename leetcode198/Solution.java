package leetcode198;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int [] count=  new int[nums.length];
        count[0] = nums[0];
        count[1] = Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++) {
        	count[i] = Math.max(count[i-1], count[i-2]+nums[i]);
        }
        return count[nums.length-1];
    }
}


/* class Solution {
    public int rob(int[] nums) {
        int [] key = new int[nums.length];
        for(int i=0;i<key.length;i++){
            key[i] = -1;
        }
        return solve(nums.length-1,nums,key);
    }
    
    public int solve(int index,int [] nums,int [] key){
        if(index<0){
            return 0;
        }
        else if(key[index]!=-1){
            return key[index];
        }
        else{
            key[index] = Math.max(nums[index]+solve(index-2,nums,key),solve(index-1,nums,key));
            return key[index];
            
        }
    }
} */