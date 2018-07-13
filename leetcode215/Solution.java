package leetconde215;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        return part(nums,nums.length-k, 0,nums.length-1);
    }
    
    public int part(int[] nums,int index, int start,int end) {
    	int temp = nums[start];
    	int i =start;
    	int j = end;
    	while(i<j) {
    		while(i<j && nums[j]>=temp) j--;
    		if(i<j) {
    			nums[i++]=nums[j];
    		}
    		
    		while(i<j && nums[i]<temp) i++;
    		if(i<j) {
    			nums[j--]=nums[i];
    		}
    	}
    	nums[i]=temp;
    	if(i==index) {
    		return temp;
    	}
    	else if(i<index) {
    		return part(nums, index, i+1, end);
    	}
    	else {
    		return part(nums, index, start, i-1);
    	}
    }
};