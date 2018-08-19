package leetcode309;

class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1) return 0;
        int buy=-prices[0],buy_before=buy,sell=0,sell_before=0,sell_yes=0;
        for(int i=1;i<prices.length;i++) {
        	buy=Math.max(sell_yes-prices[i], buy_before);
        	sell=Math.max(buy_before+prices[i],sell_before);
        	buy_before=buy;
        	sell_yes=sell_before;
        	sell_before=sell;
        }
        return sell;
        
    }

}