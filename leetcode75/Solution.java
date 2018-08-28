package leetcode75;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> lists=new ArrayList<>();
        if(nums==null) return lists;
        rcursive(nums, lists, new ArrayList<Integer>(), 0);
        return lists;
    }
    
    public void rcursive(int[]nums,List<List<Integer>> lists,List<Integer> list,int index) {
    	if(index==nums.length) {
    		List<Integer> newlist=new ArrayList<>(list);
    		lists.add(newlist);
    		return ;
    	}
		list.add(nums[index]);
		rcursive(nums, lists, list, index+1);
		list.remove(list.size()-1);	  
		rcursive(nums, lists, list, index+1);
    }
}