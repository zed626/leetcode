package leetcode412;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<String>();
        int m=0,k=0;
        for(int i=1;i<=n;i++){
        	m++;k++;
        	if(m==3&&k==5){
        		list.add("FizzBuzz");
        		m=0;
        		k=0;
        	}
        	else if(m==3){
        		list.add("Fizz");
        		m=0;
        	}
        	else if(k==5){
        		list.add("Buzz");
        		k=0;
        	}
        	else list.add(String.valueOf(i));
        }
        return list;
    }
}