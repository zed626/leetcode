package leetcode21;


/* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) { val = x; }
* }
*/
class Solution {
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1==null) return l2;
       if(l2==null) return l1;
       ListNode result = null;
       ListNode p = null;
       while(l1!=null && l2!=null) {
    	   if(l1.val<l2.val) {
    		   if(result==null) {
    			   result = l1;
    			   p = l1;
    		   }
    		   else {
    			   p.next =l1;
    			   p=p.next;
    		   }
    		   l1 = l1.next;
    	   }
    	   else {
    		   if(result==null) {
    			   result = l2;
    			   p = l2;
    		   }
    		   else {
    			   p.next =l2;
    			   p=p.next;
    		   }
    		   l2 = l2.next;
    	   }
       }
       while(l1!=null) {
    	   p.next = l1;
    	   p = p.next;
    	   l1 = l1.next;
       }
       while(l2!=null) {
    	   p.next = l2;
    	   p = p.next;
    	   l2 = l2.next;
       }
       return result;
   }
}