package leetcode414;

import java.util.PriorityQueue;

class Solution {
    public int thirdMax(int[] nums) {
        if(nums==null) return -1;
        PriorityQueue<Integer> heap=new PriorityQueue<>(3);
        for(int i=0;i<nums.length;i++) {
        	if(heap.size()<3 && !heap.contains(nums[i])) {
        		heap.add(nums[i]);
        	}
        	else if(!heap.contains(nums[i])&&nums[i]>heap.peek()) {
        		heap.poll();
        		heap.add(nums[i]);
        	}
        }
        if(heap.size()<3) {
        	while(heap.size()!=1) {
        		heap.poll();
        	}
        }
        return heap.peek();
    }
}