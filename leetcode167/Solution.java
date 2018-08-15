package leetcode167;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] key=new int[2];
        key[0]=0;
        key[1]=numbers.length-1;
        while(key[0]<key[1]) {
        	if(numbers[key[0]]+numbers[key[1]]<target) key[0]++;
        	else if(numbers[key[0]]+numbers[key[1]]>target) key[1]--;
        	else break;
        }
        key[0]++;
        key[1]++;
        return key;  
    }
}