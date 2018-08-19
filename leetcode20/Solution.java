package leetcode20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> list=new ArrayList<>();
        if(nums==null)  return list;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
        	if(i==0 || nums[i]!=nums[i-1]) {
        		int left=i+1,right=nums.length-1;
        		int sum=-nums[i];
        		while(left<right) {
        			if(nums[left]+nums[right]==sum) {
        				list.add(Arrays.asList(nums[i],nums[left],nums[right]));
        				while(left+1<right&&nums[left]==nums[left+1]) left++;
        				while(left>right-1&&nums[right-1]==nums[right]) right--;
        				left++;
        				right--;
        			}
        			else if(nums[left]+nums[right]>sum) right--;
        			else {
						left++;
					}
        		}
        	}
        }
        return list;
    }
}