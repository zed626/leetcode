package leetcode875;

class Solution {
    public int minEatingSpeed(int[] piles, int H) {
    	if(piles==null || piles.length==0) return -1;
    	int max=0;
        for(int i=0;i<piles.length;i++) {
        	if(piles[i]>max) {
        		max=piles[i];
        	}
        }
        int i=1,j=max;
        while(i<j) {
        	int mid=i+(j-i)/2;
        	int temp=0;
        	for(int k:piles) {
        		temp+=k/mid;
        		if(k%mid>=1)  temp++;
        	}
        	if(temp<=H) {
        		j=mid;
        	}
        	else {
        		i=mid+1;
        	}
        }
        return i;
    }
}