package leetcode34;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums==null || nums.length==0) return new int[] {-1,-1};
        int result[]=new int [2];
        int left=0,right=nums.length-1;
        while(left<right){
        	int mid=left+(right-left)/2;    //ʹ��λ��ƫ�����ұ�
        	if(nums[mid]<target) left=mid+1;
        	else right=mid;
        }
        result[0]=nums[left]==target?left:-1;
        left=0;
        right=nums.length-1;
        while(left<right){
        	int mid=left+(right-left)/2+1;    //ʹ��λ��ƫ�����ұߣ���ֹ��ѭ��
        	if(nums[mid]>target) right=mid-1;
        	else left=mid;
        }
        result[1]=nums[left]==target?left:-1;
        return result;      
    }
}