package leetcode11;

class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0) return 0;
        int left=0,right=height.length-1;
        int size=0;
        while(right>left) {
        	size=Math.max(size, (right-left)*Math.min(height[left],height[right]));
        	if(height[left]>height[right]) {
        		right--;
        	}
        	else {
				left++;
			}
        }
        return size;
    }
}