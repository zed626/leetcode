package leetcode15;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s==null) return false;
        if(s.length()<1) return true;
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++) {
        	switch (s.charAt(i)) {
			case '(':
				stack.push('(');
				break;
			case '[':
				stack.push('[');
				break;
			case '{':
				stack.push('{');
				break;
			case ')':
				if(!stack.empty() && stack.peek()=='(') {
					stack.pop();
				}
				else {
					return false;
				}
				break;
			case ']':
				if(!stack.empty() && stack.peek()=='[') {
					stack.pop();
				}
				else {
					return false;
				}
				break;
			case '}':
				if(!stack.empty() && stack.peek()=='}') {
					stack.pop();
				}
				else {
					return false;
				}
				break;

			default:
				return false;
			}
        }
        if(stack.empty()) {
        	return true;
        }
        return false;
    }
}