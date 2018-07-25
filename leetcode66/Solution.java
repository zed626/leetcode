package leetcode66;


class Solution {
    public int[] plusOne(int[] digits) {
    	int size = digits.length;
        int[] k=new int [size];
        int carry=1;
        for(int i=size-1;i>=0;i--) {
        	k[i]=digits[i]+carry;
        	carry=0;
        	if(k[i]==10) {
        		k[i]=0;
        		carry=1;
        	}
        }
        if(carry==0) {
        	return k;
        }
        else {
        	int []k2=new int[size+1];
        	k2[0]=1;
        	for(int i=0;i<size;i++) {
        		k2[i+1]=k[i];
        	}
        	return k2;
        }
        
    }
}