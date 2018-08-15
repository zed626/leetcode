package leetcode844;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        if(S==null || T==null) return false;
        int ks=0,kt=0;
        int indexs=S.length()-1,indext=T.length()-1;
        while(indexs>=0 && indext>=0) {
        	while(indexs>=0 &&(S.charAt(indexs)=='#'||ks>0)) {
        		if(S.charAt(indexs)=='#') ks++;
        		else ks--;
        		indexs--;
        	}
        	while(indext>=0 &&(T.charAt(indext)=='#'||kt>0)) {
        		if(T.charAt(indext)=='#') kt++;
        		else kt--;
        		indext--;
        	}
        	if(indexs<0 && indext<0) return true;
        	else if(indexs>=0 && indext>=0) {
        		if(S.charAt(indexs)==T.charAt(indext)) {  	
	        		indexs--;
	        		indext--;
        		}
        		else {
					return false;
				}
        	}
        	else return false;
        }
    	while(indexs>=0 &&(S.charAt(indexs)=='#'||ks>0)) {
    		if(S.charAt(indexs)=='#') ks++;
    		else ks--;
    		indexs--;
    	}
    	while(indext>=0 &&(T.charAt(indext)=='#'||kt>0)) {
    		if(T.charAt(indext)=='#') kt++;
    		else kt--;
    		indext--;
    	}
        if(indexs!=indext) return false;
    	return true;
    }
}