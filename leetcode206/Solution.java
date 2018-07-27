package leetcode206;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head.next;
        head.next=null;
        while(temp.next!=null) {
        	ListNode k=temp.next;
        	temp.next=head;
        	head=temp;
        	temp=k;
        }
        temp.next=head;
        return temp;
    }
}


/*public ListNode reverseList(ListNode head) {
     iterative solution 
    ListNode newHead = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = newHead;
        newHead = head;
        head = next;
    }
    return newHead;
}*/
