package leetcode146;

import java.util.LinkedHashMap;

class LRUCache {
	LinkedHashMap<Integer, Integer> map;
	int cap;

    public LRUCache(int capacity) {
        map=new LinkedHashMap<>(capacity,0.75f,true);
        cap=capacity;
    }
    
    public int get(int key) {
        Integer temp=map.get(key);
        if(temp==null) return-1;
        else return temp;
    }
    
    public void put(int key, int value) {
        Integer temp=map.get(key);
        if(temp!=null) {
        	map.put(key, value);
        }
        else {
        	if(map.size()==cap) {
        		int a = (int) map.keySet().toArray()[0];
        		map.remove(a);
        	}
        	map.put(key,value);

        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */