package leetcode268;

class Solution {
    public int missingNumber(int[] nums) {
        if(nums==null||nums.length==0) return -1;
        int totle=0;
        for(int i=0;i<nums.length;i++) {
        	totle+=i+1-nums[i];
        }
        return totle;
    }
}


/*public int missingNumber(int[] nums) {

    int xor = 0, i = 0;
	for (i = 0; i < nums.length; i++) {
		xor = xor ^ i ^ nums[i];
	}

	return xor ^ i;
}*/