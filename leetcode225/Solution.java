package leetcode225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    /** Initialize your data structure here. */
    public MyStack() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	while(queue1.size()>1) {
    		queue2.add(queue1.poll());
    	}
    	if(!queue1.isEmpty())
    		return queue1.poll();
    	else {
			if(queue2.size()>0) {
				while(queue2.size()>1) {
					queue1.add(queue2.poll());
				}
				return queue2.poll();
			}
			return -1;
		}
    }
    
    /** Get the top element. */
    public int top() {
    	while(queue1.size()>1) {
    		queue2.add(queue1.poll());
    	}
    	if(!queue1.isEmpty())
    		return queue1.peek();
    	else {
			if(queue2.size()>0) {
				while(queue2.size()>1) {
					queue1.add(queue2.poll());
				}
				int temp=queue2.poll();
				queue1.add(temp);
				return temp;
			}
			return -1;
		}
    	
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */