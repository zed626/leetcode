package leetcode532;

import java.util.HashMap;

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null ||nums.length==0 || k<0) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        if(k!=0)
	        for(int h:nums) {
	        	if(map.containsKey(h)) continue;
	        	map.put(h, 1);
	        	if(map.containsKey(h-k)) sum++;
                if(map.containsKey(h+k)) sum++;
	        }
        else {
	        for(int h:nums) {
	        	int temp=map.getOrDefault(h, 0);
	        	if(temp==1) {
	        		sum++;
	        	}
	        	map.put(h, ++temp);
	        }
        }
        return sum;
    }
}