package leetcode204;

class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean[] ht=new boolean[n+1];
        int num=0;
        for(int i=2;i<=n;i++) {
        	if(!ht[i]) {
        		num++;
        		for(int j=i*2;j<=n;j+=i) {
        			ht[j]=true;
        		}
        	}
        }
        return num;
    }
}