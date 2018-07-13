package leetcode122;


/*class Solution {  *no tanxin
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int buy=prices[0];
        int sell = prices[0];
        int profit=0;
        for(int i =1;i<prices.length;i++) {
        	if(i==prices.length-1) {
        		if(prices[i]>sell) {
        			profit+=prices[i]-buy;
        		}
        		else {
        			profit+=sell-buy;
        		}
        	}
        	else {
        		if(prices[i]<=buy) {
        			profit+=sell-buy;
        			buy=sell=prices[i];
        		}
        		else{
        			if(prices[i]>sell) {
        				sell=prices[i];
        			}
        			else {
            			profit+=sell-buy;
            			buy=sell=prices[i];
        			}
        		}
        	}
        }
        return profit;
    }
}*/


class Solution {   //with tanxin
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int profit=0;
        for(int i =0;i<prices.length-1;i++) {
        	if(prices[i+1]-prices[i]>0) {
        		profit+=prices[i+1]-prices[i];
        	}
        }
        return profit;

    }
}