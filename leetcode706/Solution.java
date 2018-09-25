package leetcode706;

class MyHashMap {
	final Bucket[] buckets=new Bucket[1000];
    /** Initialize your data structure here. */
    public MyHashMap() {
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index=idx(key);
        if(buckets[index]==null) {
        	buckets[index]=new Bucket();
        }
        ListNode pre=find(buckets[index], key);
        if(pre.next==null) {
        	pre.next=new ListNode(key, value);
        }
        else {
			pre.next.value=value;
		}
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index=idx(key);
        Bucket bucket=buckets[index];
        if(bucket==null) return-1;
        ListNode node=find(bucket, key);
        return node.next==null?-1:node.next.value;
        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index=idx(key);
        Bucket bucket=buckets[index];
        if(bucket==null) return ;
        ListNode node=find(bucket, key);
        if(node.next==null) return;
        node.next=node.next.next;
    }
    
    int idx(int key) {
    	return Integer.hashCode(key)%buckets.length;
    }
    
    ListNode find(Bucket bucket,int key) {
    	ListNode node=bucket.head,pre=null;
    	while(node!=null && node.key!=key) {
    		pre=node;
    		node=node.next;
    	}
    	return pre;
    }
    
    class Bucket{
    	final ListNode head=new ListNode(-1, -1);
    }
    
    class ListNode{
    	int key,value;
    	ListNode next;
    	
    	public ListNode(int key,int value) {
			// TODO Auto-generated constructor stub
    		this.key=key;
    		this.value=value;
		}
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */