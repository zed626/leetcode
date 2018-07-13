package leetcode455;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g==null || s==null) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        int num=0;
        for(int i=0;i<g.length && j<s.length;) {
        	if(g[i]<=s[j]) {
        		i++;
        		j++;
        		num++;
        	}
        	else {
        		j++;
        	}
        }
        return num;
    }
}