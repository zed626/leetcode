package leetcode300;

/*class Solution {
	public int lengthOfLIS(int[] nums) {
	    int[] tails = new int[nums.length];
	    int size = 0;
	    for (int x : nums) {
	        int i = 0, j = size;
	        while (i != j) {
	            int m = (i + j) / 2;
	            if (tails[m] < x)
	                i = m + 1;
	            else
	                j = m;
	        }
	        tails[i] = x;
	        if (i == size) ++size;
	    }
	    return size;
	}
}*/

class Solution {
	public int lengthOfLIS(int[] nums) {
		if(nums==null || nums.length==0) return 0;
		int [] tail=new int[nums.length];
		int size=0;
		for(int x:nums){
			int i=0,j=size;
			while(i<j){
				int temp=i+(j-i)/2;
				if(tail[temp]<x) i=temp+1;
				else j=temp;
			}
			tail[i]=x;
			if(i==size) size++;		
		}
		return size;
	}
}