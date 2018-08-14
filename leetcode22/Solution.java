package leetcode22;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        recursive(n, n, 0, "", list);
        return list;
    }
    
    public void recursive(int left,int rigth,int before,String str,List<String> list) {
    	if(rigth==0) {
    		list.add(str);
    		return;
    	}
    	if(before==0) {
    		recursive(left-1, rigth, before+1, str+"(", list);
    	}
    	else {
    		if(rigth>0) {
    			recursive(left, rigth-1, before-1, str+")", list);
    		}
    		if(left>0) {
    			recursive(left-1, rigth, before+1, str+"(", list);
    		}
    	}
    }
}