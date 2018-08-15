package leetcode520;

class Solution {
    public boolean detectCapitalUse(String word) {
        if(word==null || word.length()==0) return false;
        int count=0;
        for(char a:word.toCharArray()) {
        	if(a-'Z'<=0) count++;
        }
        return count==0 || count==word.length() || count==1 && word.charAt(0)<='Z';
    }
}