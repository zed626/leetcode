package leetcode409;

import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        if(s==null) return 0;
        int sum=0;
        int carry=0;
        HashMap<Character, Integer> map=new HashMap<>();
        for(char k:s.toCharArray()) {
        	map.put(k, map.getOrDefault(k, 0)+1);
        }
        for(char k:map.keySet()) {
        	int temp=map.get(k);
        	if(temp%2==1) {
        		carry=1;
        	}
        	sum+=temp-temp%2;
        }
        sum+=carry;
        return sum;
    }
}