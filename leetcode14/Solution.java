package leetconde14;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length<1) {
        	return "";
        }
        Arrays.sort(strs);
        StringBuilder builder = new StringBuilder();
        int length = strs[0].length();
        for(int i =0;i<length;i++) {
        	if(strs[strs.length-1].length()>i && strs[0].charAt(i)==strs[strs.length-1].charAt(i)) {
        		builder.append(strs[0].charAt(i));
        	}
        	else {
        		break;
        	}
        }
        return builder.toString();
    }
}