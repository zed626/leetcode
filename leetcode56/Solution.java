package leetcode56;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
    	List<Interval> lists=new ArrayList<>();
        if(intervals==null || intervals.size()==0) return lists;
        Collections.sort(intervals,new Comparator<Interval>() {
        	@Override
        	public int compare(Interval v1,Interval v2) {
        		if(v1.start!=v2.start) return v1.start-v2.start;
        		else return v1.end-v2.end;
        	}
		});
        boolean before=false;
        int left=0,right=0;
        for(Interval k:intervals) {
        	if(!before) {
        		left=k.start;
        		right=k.end;
        		before=!before;
        	}
        	else {
        		if(k.start<=right) {
        			right=Math.max(right, k.end);
        		}
        		else {
        			lists.add(new Interval(left,right));
        			left=k.start;
        			right=k.end;
        		}
        	}
        }
        lists.add(new Interval(left,right));
        return lists;
    }
}