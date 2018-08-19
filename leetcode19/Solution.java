package leetcode19;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode temp=head;
        for(int i=1;i<n;i++) {
        	temp=temp.next;
        }
        if(temp.next==null) {
        	return head.next;
        }
        else {
        	ListNode kk=head;
        	while(temp.next.next!=null) {
        		temp=temp.next;
        		kk=kk.next;
        	}
        	kk.next=kk.next.next;
        }
        return head;
    }
}