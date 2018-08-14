package leetcode17;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new LinkedList<>();
        if(digits==null||digits.length()==0) return list;
        String table[]= {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        list.add("");
        for(char kk:digits.toCharArray()) {
        	int temp=kk-'0';
        	int size=list.size();
        	for(int i=0;i<size;i++) {
        		String o=list.remove(0);
        		for(char h:table[temp].toCharArray()) {
        			list.add(o+h);
        		}
        	}
        }
        return list;
        
    }
}