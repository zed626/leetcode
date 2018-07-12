package leetconde148;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        ListNode temp = head;
        while(temp.next!=null) {
        	temp = temp.next;
        }
        return merge(head, temp);
    }
    
    public ListNode merge(ListNode fast,ListNode slow) {
    	if(fast==slow) {
    		return fast;
    	}
    	if(fast.next==slow) {
    		if(fast.val>slow.val) {
    			int k = fast.val;
    			fast.val = slow.val;
    			slow.val = k;
    		}
    		return fast;
    			
    	}
    	ListNode mid = mid(fast, slow);
    	  	
    	slow = merge(mid.next, slow);
    	mid.next =null;
    	fast = merge(fast, mid);
    	ListNode temp =null;
        ListNode newhead =null;
    	while(fast!=null && slow!=null) {
    		if(temp==null) {
    			temp = fast.val>slow.val?slow:fast;
                newhead = temp;
    			if(fast.val>slow.val) {
    				slow=slow.next;
    			}
    			else {
					fast = fast.next;
				}
    		}
    		else {
    			if(fast.val>slow.val) {
    				
    				temp.next = slow;
    				slow=slow.next;
    			}
    			else {
    				temp.next = fast;
					fast = fast.next;
				}
                temp=temp.next;
    		}
    	}
    	while(fast!=null) {
			temp.next = fast;
			fast = fast.next;
            temp=temp.next;
    	}
    	while(slow!=null) {
			temp.next = slow;
			slow=slow.next;
            temp=temp.next;
    	}
    	return newhead;
    }
    
    public ListNode mid(ListNode begin,ListNode end) {
    	ListNode temp1 = begin,temp2 = begin;
    	for(;temp2!=end;) {
    		if(temp2!=end) {
    			temp2=temp2.next;
    		}

    		if(temp2!=end) {
    			temp2=temp2.next;
    		}
    		temp1=temp1.next;
    	}
    	return temp1;
    }
}