package leetcode241;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> diffWaysToCompute(String input) {
    	List<Integer> list = new ArrayList<Integer>();
    	List<Integer> list2;
    	List<Integer> list3;
        if(input==null || input.length()==0) return list;
        for(int i =0;i<input.length();i++) {
        	char x = input.charAt(i);
        	if(x=='+'||x=='-'||x=='*') {
				list2 = diffWaysToCompute(input.substring(0,i));
				list3 = diffWaysToCompute(input.substring(i+1));
        		switch (x) {
				case '+':
					for(int m:list2) {
						for(int n :list3) {
							list.add(m+n);
						}
					}
					break;
				case '-':
					for(int m:list2) {
						for(int n :list3) {
							list.add(m-n);
						}
					}
					break;

				default:
					for(int m:list2) {
						for(int n :list3) {
							list.add(m*n);
						}
					}
					break;
				}
        	}
        }
        if(list.isEmpty()) list.add(Integer.parseInt(input));
        return list;
    }
}