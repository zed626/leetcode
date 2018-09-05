package leetcode50;

class Solution {
    public double myPow(double x, int n) {
    	if(Math.abs(x)<0.000000001) return 0; 
        if(n<0) {
        	if(n==Integer.MIN_VALUE) {
        		n=-(n/2);
        		double temp=recursive(x, n);
        		return 1/(temp*temp);
        	}
        	double tem=recursive(x, Math.abs(n));
        	return 1/tem;
        }
        else if(n==0) return 1;
        else return recursive(x, n);
    }
    
    public double recursive(double x,int n) {
    	if(n==1) {
    		return x;
    	}
    	int a=n/2;
    	int b=n%2;
    	double temp=recursive(x, a);
    	temp*=temp;
    	if(b==1) {
    		temp*=x;
    	}
    	return temp;
    	
    }
}