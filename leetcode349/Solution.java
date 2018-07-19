package leetcode349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        int k1=nums1.length;
        int k2=nums2.length;
        int s1=0,s2=0;
        while(s1<k1 && s2<k2) {
        	if(nums1[s1]==nums2[s2]) {
        		list.add(nums1[s1]);
        		int temp=nums1[s1];
        		while(s1<k1&&nums1[s1]==temp) {
        			s1++;
        		}
        		while(s2<k2&&nums2[s2]==temp) {
        			s2++;
        		}
        	}
        	else if(nums1[s1]<nums2[s2]){
        		s1++;
        	}
        	else {
        		s2++;
        	}
        }
        int [] h=new int[list.size()];
        for(int i=0;i<list.size();i++) {
        	h[i]=list.get(i);
        }
        return h;
    }
}