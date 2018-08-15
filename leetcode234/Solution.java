package leetcode234;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode slow=head,fast=head;
        while(fast.next!=null) {
        	fast=fast.next;
        	slow=slow.next;
        	if(fast.next!=null) {
        		fast=fast.next;
        	}
        }
        ListNode newhead=null;
        while(slow!=null) {
        	ListNode temp=slow.next;
        	slow.next=newhead;
        	newhead=slow;
        	slow=temp;
        }
        while(newhead!=head) {
        	if(newhead.val!=head.val) return false;
        	else {
        		if(newhead==head.next) return true;
                newhead=newhead.next;
                head=head.next;
        	}
        }
        return true;
    } 
}