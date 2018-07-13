package leetcode303;


class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2) return 0;
        int max = 0;
        int min = prices[0];
        for(int i =1;i<prices.length;i++) {
        	if(min<prices[i]) {
        		int temp = prices[i]-min;
        		if(temp>max) {
        			max=temp;
        		}
        	}
        	else {
        		min = prices[i];
        	}
        }
        return max;
    }
}