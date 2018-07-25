package leetcode125;

class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0) return true;
        String news=s.toLowerCase();
        int i=0,j=news.length()-1;
        while(i<j) {
        	while(!(news.charAt(i)>='0' && news.charAt(i)<='9' || news.charAt(i)>='A'&&news.charAt(i)<='Z' || news.charAt(i)>='a'&&news.charAt(i)<='z')) {
        		i++;
        		if(i==j) {
        			return true;
        		}
        	}
        	while(!(news.charAt(j)>='0' && news.charAt(j)<='9' || news.charAt(j)>='A'&&news.charAt(j)<='Z'|| news.charAt(j)>='a'&&news.charAt(j)<='z')) {
        		j--;
        	}
        	if(i>=j) break;
        	if(news.charAt(i)==news.charAt(j)) {
        		i++;j--;
        	}
        	else return false;
        }
        return true;
    }
}