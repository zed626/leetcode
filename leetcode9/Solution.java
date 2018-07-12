package leetcode9;

class Solution {
    public boolean isPalindrome(int x) {
        int a =x;
        int b= 0;
        int h = 1;
        if(a<0) {
        	return false;
        }
        while(a/h>=10) {
        	h*=10;
        }
        while(a!=0) {
        	if(a/h!=a%10) {
        		return false;
        	}
        	a=a%h;
        	a=a/10;
        	h= h/100;
        }
        return true;
    }
}