package leetcode5;

class Solution {
    public String longestPalindrome(String s) {
    	if(s==null) return "";
    	if(s.length()<=2) return s;
    	int []cal = new int [2];
    	cal[0] = 0;
    	cal[1] =0;
    	for(int i=0;i<s.length()-1;i++){
    		solve(s, i, i,cal);
    		solve(s, i, 1+1,cal);
    	}
    	return s.substring(cal[1],cal[0]+cal[1]);
    	
    }
    public void solve(String s,int i,int j,int []cal){
    	while(i>=0 && j<s.length()){
    		if(s.charAt(i)==s.charAt(j)){
    			i--;
    			j++;
    		}
    		else break;
    	}
    	if(j-i-1>cal[0]){
    		cal[0] = j-i-1;
    		cal[1] = i+1;
    	}
    }
}