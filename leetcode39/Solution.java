package leetcode39;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> lists=new ArrayList<>();
        if(candidates==null ) return lists;
        backTrack(lists, new ArrayList<Integer>(), target, candidates,0);
        return lists;
        
    }
    
    public void backTrack(List<List<Integer>> lists,List<Integer>list,int sum,int can[],int start) {
    	List<Integer> list2=new ArrayList<>(list);
    	if(sum==0) lists.add(list2);
    	if(sum<0) return;
    	for(int i=start;i<can.length;i++) {
    		list2.add(can[i]);
    		backTrack(lists, list2, sum-can[i],can,i);
    		list2.remove(list2.size()-1);
    	}
    }
}