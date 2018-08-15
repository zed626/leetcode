package leetcode347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i:nums) {
        	map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer>[] buckets=new ArrayList[nums.length+1];
        for(int key:map.keySet()) {
        	int fre=map.get(key);
        	if(buckets[fre]==null) {
        		buckets[fre]=new ArrayList<>();
        	}
        	buckets[fre].add(key);
        }
        List<Integer> result=new ArrayList<>();
        for(int i=buckets.length-1;i>=0 && result.size()<k;i--) {
        	if(buckets[i]!=null)
        	result.addAll(buckets[i]);
        }
        return result;
    }
}