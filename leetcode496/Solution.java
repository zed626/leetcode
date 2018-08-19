package leetcode496;


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null) return new int[] {};
        int key[]=new int [nums1.length];
        for(int i=0;i<nums1.length;i++) {
        	int temp=Integer.MIN_VALUE;
        	for(int j=nums2.length;j>=0;j--) {
        		if(nums2[j]>nums1[i]) {
        			temp=nums2[j];
        		}
        		else if(nums1[i]==nums2[j]) {
        			key[i]=temp==Integer.MIN_VALUE?-1:temp;
        		}
        	}
        }
        return key;
    }
}


/*public int[] nextGreaterElement(int[] findNums, int[] nums) {
    Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
    Stack<Integer> stack = new Stack<>();
    for (int num : nums) {
        while (!stack.isEmpty() && stack.peek() < num)
            map.put(stack.pop(), num);
        stack.push(num);
    }   
    for (int i = 0; i < findNums.length; i++)
        findNums[i] = map.getOrDefault(findNums[i], -1);
    return findNums;
}*/

