package leetcode434;

class Solution {
    public int countSegments(String s) {
        if(s==null || s.length()==0) return 0;
        int num=0;
        int key=0;
        for(int i=0;i<s.length();i++) {
        	if(key==0 &&s.charAt(i)!=' ') {
        		key=1;
        		num++;
        	}
        	else if(s.charAt(i)==' ') {
        		key=0;
        	}
        }
        return num;
    }
}