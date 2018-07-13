package leetconde91;


class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()<1) return 0;
        if(s.length()==1) {
        	if(s.charAt(0)>='1' && s.charAt(0)<='9') return 1;
        	else return 0;
        }
        int [] dp = new int[s.length()+1];
        dp[0] = 1;
        if(s.charAt(0)>='1' && s.charAt(0)<='9') dp[1] = 1;
        for(int i=1;i<s.length();i++) {
            if((s.charAt(i-1)=='1' && s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i-1)=='2'&& s.charAt(i)>='0' && s.charAt(i)<='6')) {
        			dp[i+1]+=dp[i-1];
        		}
            if(s.charAt(i)>='1' && s.charAt(i)<='9') {
        		dp[i+1] += dp[i];
        	}
        }
        return dp[s.length()];
    }
}