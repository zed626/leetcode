package leetcode67;


class Solution {
    public String addBinary(String a, String b) {
        StringBuilder builder=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0) {
        	int temp=carry;
        	if(i>=0) {
        		temp+=a.charAt(i)-'0';
        		i--;
        	}
        	if(j>=0) {
        		temp+=b.charAt(j)-'0';
        		j--;
        	}
        	builder.append(temp%2);
        	carry=temp/2;
        }
        if(carry>0) builder.append(carry);
        return builder.reverse().toString();
    }
}