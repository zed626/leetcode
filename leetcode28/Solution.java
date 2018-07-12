package leetcode28;


class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null || needle==null || needle.length()==0) return  0;
        int m= haystack.length();
        int n = needle.length();
        if(m<n) return -1;
        if(m==n){
            if(haystack.equals(needle)) return 0;
            return -1;
        }
        for(int i=0;i<=m-n;i++) {
        	if(haystack.substring(i, i+n).equals(needle)){
        		return i;
        	}
        }
        return -1;
    }
}