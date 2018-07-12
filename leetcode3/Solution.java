package leetcode3;

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null|| s.length()<1) {
        	return 0;
        }
        HashMap<Character, Integer> map =new HashMap<>();
        char [] chars = s.toCharArray();
        int left =0;
        int right = 0;
        int count = 0;
        int max = 0;
        for(int i=0;i<chars.length;i++) {
        	if(map.containsKey(chars[i])) {
        		if(map.get(chars[i])>=left) {
        			left = map.get(chars[i])+1;
        			right = i;
        			map.put(chars[i], i);
        			count = right-left+1;
        		}
        		else {
        			map.put(chars[i], i);
        			right = i;
        			count++;
        		}
        	}
        	else {
        		map.put(chars[i], i);
        		right = i;
        		count++;
        	}
        	if(count>max) {
        		max=count;
        	}
        }
        return max;
    }
}