package leetcode394;

import java.util.Stack;


public class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> result = new Stack<>();
        int i = 0;
        result.push("");
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int start = i;
                while (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') i++;
                count.push(Integer.parseInt(s.substring(start, i + 1)));
            } else if (ch == '[') {
                result.push("");
            } else if (ch == ']') {
                String str = result.pop();
                StringBuilder sb = new StringBuilder();
                int times = count.pop();
                for (int j = 0; j < times; j += 1) {
                    sb.append(str);
                }
                result.push(result.pop() + sb.toString());
            } else {
                result.push(result.pop() + ch);
            }
            i += 1;
        }
        return result.pop();
    }
}

/*class Solution {
	
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
        		String g=builder.toString();
        		if(!g.equals("")) {
        			builder=new StringBuilder();
        			charStatck.push(g);
        		}
        		int size=k-'0';
        		i++;
        		k=s.charAt(i);
        		while(Character.isDigit(k)) {
        			size=size*10+k-'0';
        		}
        		countstack.push(size);
        		
        	}
        	if(k=='[') {
        		flag++;
        	}
        	else if(k==']') {
        		flag--;
        		if(flag==0) {
        			int m=countstack.pop();
        			String n=builder.toString(); 
        			if(n.equals("")) {
        				n=charStatck.pop();
        			}
        			else {
        				builder=new StringBuilder();
        			}
        			
        			for(int j=0;j<m;j++) {
        				maker.append(n);
        			}
        		}
        		else {
        			String temp=builder.toString();
        			int m=countstack.pop(); 
        			builder=new StringBuilder();
        			builder.append(charStatck.pop());
        			for(int j=0;j<m;j++) {
        				builder.append(temp);
        			}
        			charStatck.push(builder.toString());
        			builder=new StringBuilder();
        		}
        	}
        	else {
        		builder.append(k);
        	}
        }
        return maker.append(builder).toString();
        
    }
}*/