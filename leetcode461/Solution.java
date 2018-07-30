package leetcode461;

class Solution {
    public int hammingDistance(int x, int y) {
        x=x^y;
        int sum=0;
        while(x!=0) {
        	x&=(x-1);
        	sum++;
        }
        return sum;
    }
}