package leetcode203;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {      
        while(head!=null && head.val==val) {
        	head=head.next;
        }
        if(head==null) return head;
        ListNode temp=head;
        while(temp.next!=null) {
        	if(temp.next.val==val) {
        		temp.next=temp.next.next;
        	}
        	else {
        		temp=temp.next;
        	}
        }
        return head;
    }
}