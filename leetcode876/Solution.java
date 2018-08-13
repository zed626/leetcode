package leetcode876;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
            if(fast.next!=null) fast=fast.next;
        }
        return slow;
    }
}