package leetcode344;

class Solution {
    public String reverseString(String s) {
        if(s==null || s.length()==0) return "";
        StringBuilder builder=new StringBuilder(s);
        for(int i=0;i<builder.length()/2;i++) {
        	char temp=builder.charAt(i);
        	builder.setCharAt(i, builder.charAt(builder.length()-1-i));
        	builder.setCharAt(builder.length()-i-1, temp);
        }
        return builder.toString();
    }
}