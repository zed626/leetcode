package leetcode682;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int calPoints(String[] ops) {
        if(ops==null || ops.length==0) return 0;
        List<Integer>list=new ArrayList<>();
        int score=0;
        for(String kk:ops) {
        	if(kk.equals("+")) {
        		int temp=list.get(list.size()-1)+list.get(list.size()-2);
        		list.add(temp);
        		score+=temp;
        	}
        	else if(kk.equals("D")) {
        		int temp=list.get(list.size()-1)*2;
        		list.add(temp);
        		score+=temp;
        	}
        	else if(kk.equals("C")){
        		int tep=list.get(list.size()-1);
        		list.remove(list.size()-1);
        		score-=tep;
        	}
        	else {
        		int temp=Integer.valueOf(kk);
        		list.add(temp);
        		score+=temp;
        	}
        }
        return score;
    }
}