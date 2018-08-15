package leetcode141;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
    	if(head==null) return false;
        ListNode slow=head,fast=head;
        while(fast!=null) {
        	if(fast.next!=null&&fast.next.next!=null)
        		fast=fast.next.next;
            else break;
        	slow=slow.next;
        	if(fast==slow) {
        		return true;
        	}

        }
        return false;
    }
}