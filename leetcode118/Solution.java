package leetcode118;

import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists=new ArrayList<>();
        if(numRows<=0) return lists;
        List<Integer> list=new ArrayList<>();
        list.add(1);
        lists.add(list);
        for(int i=2;i<=numRows;i++) {
        	List<Integer> newlist=new ArrayList<>();
        	newlist.add(1);
        	for(int j=0;j<i-2;j++) {
        		newlist.add(list.get(j)+list.get(j+1));
        	}
        	newlist.add(1);
        	lists.add(newlist);
        	list=newlist;
        	
        }
        return lists;
    }
}