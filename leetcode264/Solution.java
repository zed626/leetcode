package leetcode264;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int nthUglyNumber(int n) {
        if(n<=0) return -1;
        int i=0,j=0,k=0;
        int[] num=new int[n];
        num[0]=1;
        for(int v=1;v<n;v++) {
        	num[v]=Math.min(num[i]*2, Math.min(num[j]*3, num[k]*5));
        	if(num[i]*2==num[v]) i++;
        	if(num[j]*3==num[v]) j++;
        	if(num[k]*5==num[v]) k++;
        }
        return num[n-1];
    }
}