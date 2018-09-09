package leetcode8;

class Solution {
    public int myAtoi(String str) {
        if(str==null || str.length()==0) return 0;
        int index=0;
        long num=-1;
        boolean flag=false;
        boolean minus=true;
        boolean number=false;
        while(index<str.length()) {
        	char k=str.charAt(index);
        	if(Character.isDigit(k)) {
        		if(!flag)  {
        			flag=true;
        			minus=true;
        		}
        		if(!number) number=true;
        		break;      		
        	}
        	else if(k=='-'||k=='+') {
                if(!flag)    flag=true;
                else return 0;
        		if(k=='-') minus=false;
        		index++;
        	}
        	else if(k==' ') {
                if(flag)   return 0;
                index++;
        	}
        	else {
        		return 0;
        	}
        }
        while(index<str.length()) {
        	char k=str.charAt(index);

        	if(Character.isDigit(k)) {
        		if(num==-1) {
        			num=k-'0';
        		}
        		else num=num*10+k-'0';
        		if(minus && num>Integer.MAX_VALUE){
        			return Integer.MAX_VALUE;
        		}
        		if(!minus && -num<Integer.MIN_VALUE) {
        			return Integer.MIN_VALUE;
        		}
        	}
        	else {
        		return minus?(int) num:(int)-num;
        	}
        	index++;
        }
        if(!number) return 0;
        return minus?(int) num:(int)-num;
    }
}



/*
public int myAtoi(String str) {
    int index = 0, sign = 1, total = 0;
    //1. Empty string
    if(str.length() == 0) return 0;

    //2. Remove Spaces
    while(str.charAt(index) == ' ' && index < str.length())
        index ++;

    //3. Handle signs
    if(str.charAt(index) == '+' || str.charAt(index) == '-'){
        sign = str.charAt(index) == '+' ? 1 : -1;
        index ++;
    }
    
    //4. Convert number and avoid overflow
    while(index < str.length()){
        int digit = str.charAt(index) - '0';
        if(digit < 0 || digit > 9) break;

        //check if total will be overflow after 10 times and add digit
        if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        total = 10 * total + digit;
        index ++;
    }
    return total * sign;
}*/