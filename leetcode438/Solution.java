package leetcode438;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    	List<Integer> lists=new ArrayList<>();
        if(s==null || p==null || s.length()==0 || p.length()==0) return lists;
        int [] map=new int [26];
        for(char k:p.toCharArray()) {
        	map[k-'a']++;
        }
        int start=0,end=0,count=p.length();
        while(end<s.length()) {
        	if(map[s.charAt(end++)-'a']-->0) count--;
        	if(count==0) lists.add(start);
        	if(end-start==p.length() && map[s.charAt(start++)-'a']++>=0) {
        		count++;
        	}	
        }
        return lists;
    }
}