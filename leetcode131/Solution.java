package leetcode131;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> lists=new ArrayList<>();
    	if(s==null) return lists;
        recursive(lists, new ArrayList<String>(), s, 0);
        return lists;
    }
    
    public boolean isPalindrome(String s) {
    	int i=0,j=s.length()-1;
    	while(i<j) {
    		if(s.charAt(i)!=s.charAt(j)) {
    			return false;
    		}
    		i++;
    		j--;
    	}
    	return true;
    }
    
    public void recursive(List<List<String>> lists,List<String> list,String s,int index) {
    	if(index==s.length()) {
    		lists.add(list);
    	}
    	
    	for(int i=index;i<s.length();i++) {
    		if(isPalindrome(s.substring(index, i+1))) {
    			List<String> newlist=new ArrayList<>(list);
    			newlist.add(s.substring(index,i+1));
    			recursive(lists, newlist, s, i+1);
    		}
    	}
    }
}