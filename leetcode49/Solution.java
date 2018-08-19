package leetcode49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists=new ArrayList<>();
        if(strs==null) return lists;
        HashMap<String, List<String>> map=new HashMap<>();
        for(String string :strs) {
        	char[] chars=string.toCharArray();
        	Arrays.sort(chars);
        	String kk=new String(chars);
        	if(map.containsKey(kk)) {
        		map.get(kk).add(string);
        	}
        	else {
        		List<String> list=new ArrayList<>();
        		list.add(string);
        		map.put(kk,list);
        	}
        }
        lists.addAll(map.values());
        return lists;  
    }
}