package leetcode46;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> lists=new ArrayList<>();
        if(nums==null || nums.length==0) return  lists;
        boolean visit[]=new boolean[nums.length];
        recusive(lists, new ArrayList<Integer>(), visit, nums, 0);
        return lists;
     }
    
    public void recusive(List<List<Integer>> lists,List<Integer> list,boolean[]visit,int nums[],int index) {
    	List<Integer> list2=new ArrayList<>(list);
    	if(index==nums.length) {
    		lists.add(list2);
    		return;
    	}
    	for(int i=0;i<nums.length;i++) {
    		if(!visit[i]) {
    			visit[i]=true;
    			list2.add(nums[i]);
    			recusive(lists, list2, visit, nums, index+1);
    			visit[i]=false;
    			list2.remove(list2.size()-1);
    		}
    	}
    }
}