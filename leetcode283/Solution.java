package leetcode283;


class Solution {
    public void moveZeroes(int[] nums) {
    	if(nums==null ||nums.length==0) return;
    	int count=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==0) {
        		count++;
        	}
        	else {
        		nums[i-count]=nums[i];
        	}
        }
        for(int i=0;i<count;i++) {
        	nums[nums.length-i-1]=0;
        }
    }
}

/*public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) return;        

    int insertPos = 0;
    for (int num: nums) {
        if (num != 0) nums[insertPos++] = num;
    }        

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }
}*/