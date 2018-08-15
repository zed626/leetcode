package leetcode707;

class MyLinkedList {
		
    private class Node{
        int value;
        Node prev, next;
        Node(int v){
            this.value = v;
        }
        Node(){
            this(0);
        }
    }
    private Node head;
    private Node tail;
    private int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
    	Node temp=find(index);
    	return temp==null?-1:temp.value;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node temp=new Node(val);
        temp.next=head.next;
        head.next.prev=temp;
        temp.prev=head;
        head.next=temp;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node temp=new Node(val);
        temp.prev=tail.prev;
        tail.prev.next=temp;
        temp.next=tail;
        tail.prev=temp;
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	if(index>size) return;
    	else if(index==size) addAtTail(val);
    	else {
	        Node temp=find(index);
	        Node inse=new Node(val);
	        temp.prev.next=inse;
	        inse.prev=temp.prev;
	        inse.next=temp;
	        temp.prev=inse;
	        size++;
    	}
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node temp=find(index);
        if(temp!=null) {
        	temp.next.prev=temp.prev;
        	temp.prev.next=temp.next;
        	size--;
        }
    }
    
    private Node find(int index) {
        if(index>=size) return null;
        Node temp;
        if(index<size/2) {
        	temp=head.next;
        	for(int i=0;i<index;i++) {
        		temp=temp.next;
        	}
        }
        else {
        	temp=tail.prev;
        	for(int i=0;i<size-1-index;i++) {
        		temp=temp.prev;
        	}
        }
        return temp;
	}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */