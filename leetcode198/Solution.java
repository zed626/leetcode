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