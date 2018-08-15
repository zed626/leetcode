package leetcode172;

class Solution {
    public int trailingZeroes(int n) {
        if(n<=0) return 0;
        int sum=0;
        while(n!=0) {
        	sum+=n/5;
        	n/=5;
        }
        return sum;
    }
}