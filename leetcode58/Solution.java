package leetcode58;


class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0) return 0;
        int size=s.length();
        int i=size-1;
        while(i>=0&&s.charAt(i)==' ')
        	i--;
        int sum=0;
        for(;i>=0;i--) {
        	if(s.charAt(i)==' ') {
        		return sum;
        	}
        	sum++;
        }
        return sum;
    }
}