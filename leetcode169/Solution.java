package leetcode169;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int majorityElement(int[] nums) {
    	int majo = 0;
    	int times=0;
        for(int i=0;i<nums.length;i++) {
        	if(times==0) {
        		times++;
        		majo = nums[i];
        	}
        	else {
        		if(nums[i]==majo) {
        			times++;
        		}
        		else {
        			times--;
        		}
        	}
        }
        return majo;
    }
}
