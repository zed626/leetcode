package leetcode394;

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        if(s==null) return s;
        Stack<Integer> countstack=new Stack<>();
        Stack<String> charStatck=new Stack<>();
        int flag=0;
        StringBuilder builder=new StringBuilder();
        StringBuilder maker=new StringBuilder();
        for(int i=0;i<s.length();i++) {
        	char k=s.charAt(i);
        	if(Character.isDigit(k)) {
        		int size=k-'0';
        		i++;
        		k=s.charAt(i);
        		while(Character.isDigit(k)) {
        			size=size*10+k-'0';
        		}
        		countstack.push(size);
        		
        	}
        	else if(k=='[') {
        		flag++;
        	}
        	else if(k==']') {
        		charStatck.push(builder.toString());
        		builder=new StringBuilder();
        		flag--;
        		if(flag==0) {
        			int m=countstack.pop();
        			for(int j=0;j<m;j++) {
        				maker.append(str)
        			}
        		}
        	}
        	else {
        		builder.append(k);
        	}
        	
        }
        
    }
}