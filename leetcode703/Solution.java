package leetcode703;

import java.util.PriorityQueue;
import java.util.Queue;


class KthLargest {
	Queue<Integer> queue;
	int size;
    public KthLargest(int k, int[] nums) {
        size=k;
        queue=new PriorityQueue<>();
        for(int val:nums) {
        	if(queue.size()<size) {
        		queue.add(val);
        	}
        	else if(val>queue.peek()) {
        		queue.poll();
        		queue.add(val);
        	}
        }
        
    }
    
    public int add(int val) {
    	if(queue.size()<size) {
    		queue.add(val);
    	}
    	else {
    		if(val>queue.peek()) {
	        	queue.poll();
	        	queue.add(val);
    		}
        }
    	if(queue.size()==size) return queue.peek();
    	else return -1;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */