package leetcode171;

class Solution {
    public int titleToNumber(String s) {
        if(s==null || s.length()==0) return 0;
        int sum=0;
        for(int i=0;i<s.length();i++) {
        	sum*=26;
        	sum+=s.charAt(i)-'A'+1;
        }
        return sum;
    }
}