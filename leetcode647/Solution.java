package leetcode647;


class Solution {
    public int countSubstrings(String s) {
        if (s==null) {
			return 0;
		}
        int count=0;
        char[] chars=s.toCharArray();
        for(int i=0;i<s.length();i++) {
        	count+=cacal(chars, i, i);
        	count+=cacal(chars, i, i+1);
        }
        return count;
    }
    
    public int cacal(char[] chars,int i,int j) {
    	int temp=0;
		while(i<=j && i>=0 &&j<chars.length && chars[i]==chars[j]) {
			i--;
			j++;
			temp++;			
		}
		return temp;
	}
}


/*public int countSubstrings(String s) {
    int n = s.length();
    int res = 0;
    boolean[][] dp = new boolean[n][n];
    for (int i = n - 1; i >= 0; i--) {
        for (int j = i; j < n; j++) {
            dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
            if(dp[i][j]) ++res;
        }
    }
    return res;
}*/
