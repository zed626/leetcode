package leetcode860;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int key5 = 0;
        int key10 = 0;
        if(bills==null) return false;
        for(int i =0;i<bills.length;i++){
        	if(bills[i]==5) key5++;
        	else if(bills[i]==10) {
        		if(key5>=1) {
        			key5--;
        			key10++;
        		}
        		else {
        			return false;
        		}
        	}
        	else if(bills[i]==20) {
        		if(key10>=1 && key5>=1 ) {
        			key5--;
        			key10--;
        		}
        		else if(key5>=3) {
        			key5-=3;
        		}
        		else {
        			return false;
        		}
        	}
        }
        return true;
    }
}