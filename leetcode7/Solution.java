package leetcode7;

class Solution {
    public int reverse(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int index = chars.length-1;
        boolean high = true;
        long result = 0;
        while(index>=0 && chars[index]=='0') {
        	index--;
        }
        for(;index>=1;index--) {
        	result = result*10+chars[index]-'0';
        }
        if(chars[0]=='+'||chars[0]=='-') {
        	high = chars[0]=='+'?true:false;
        }
        else {
        	result = result*10+chars[0]-'0';
        }
        result = high?result:-result;
        if(result<Integer.MIN_VALUE || result>Integer.MAX_VALUE) {
        	return 0;
        }
        return (int)result;
    }
}