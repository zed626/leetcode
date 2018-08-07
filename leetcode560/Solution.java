package leetcode560;

import java.util.HashMap;
import java.util.Map;

/*class Solution {   //错误，不是正整数
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0) return 0;
        int i=0,j=0;
        int sum=nums[0];
        int n=0;
        while(j<nums.length){
        	if(sum==k){
        		i++;j++;
        		n++;
        		if(j<nums.length)
        		sum=sum-nums[j-1]+nums[j]-nums[i-1]+nums[i];
        	}
        	else if(sum>k){
        		i++;
        		if(i>j){
        			j=i;
        			if(j<nums.length){	        			
	        			sum=nums[i];
        			}
        		}
        		else
        			sum=sum-nums[i-1];
        	}
        	else {
				j++;
				if(j<nums.length){
					sum=sum+nums[j];
				}
			}
        }
        return n;
        
    }
}*/


class Solution {
	    public int subarraySum(int[] nums, int k) {
	    	 if(nums==null || nums.length==0) return 0;
	         Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	         int sum=0;
	         int op=0;
	         map.put(0, 0);
	         for(int i=0;i<nums.length;i++){
	         	sum+=nums[i];
	         	if(map.containsKey(sum-k)){
	         		op+=map.get(sum-k);
	         	}
	         	map.put(sum,map.getOrDefault(sum-k)+1);
	         	
	         }
	         return op;
	   }
}
