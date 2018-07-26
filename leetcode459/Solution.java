package leetcode459;


class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s==null ||s.length()==0) return false;
        int sum=s.length();
        for(int size=1; size<=sum/2;size++) {
        	int i=0;
        	if(sum%size==0) {
        		for(;i<sum;i++) {
        			if(s.charAt(i)!=s.charAt(i%size)) {
        				break;
        			}
        		}
        		if(i==sum) return true;
        	}
        }
        return false;
        
    }
}