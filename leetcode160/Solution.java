package leetcode160;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        int sizeA=0,sizeB=0;
        ListNode tempA=headA,tempB=headB;
        for(;tempA!=null;tempA=tempA.next) sizeA++;
        for(;tempB!=null;tempB=tempB.next) sizeB++;
        tempA=headA;
        tempB=headB;
        if(sizeA>sizeB) {
        	for(int i=0;i<sizeA-sizeB;i++) {
        		tempA=tempA.next;
        	}
        }
        else {
        	for(int i=0;i<sizeB-sizeA;i++) {
        		tempB=tempB.next;
        	}
        }
        for(;tempA!=null;tempA=tempA.next,tempB=tempB.next) {
        	if(tempA==tempB) return tempA;
        }
        return null;
    }
}