package leetcode78;

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int i=0,j=nums.length-1;
        while(i<j) {
        	while(i<j&& nums[i]==0) i++;
        	while(i<j && nums[j]!=0) j--;
        	if(i<j) {
        		int temp=nums[i];
        		nums[i]=nums[j];
        		nums[j]=temp;
        	}
        }
        j=nums.length-1;
        while(i<j) {
        	while(i<j&& nums[i]==1) i++;
        	while(i<j && nums[j]==2) j--;
        	if(i<j) {
        		int temp=nums[i];
        		nums[i]=nums[j];
        		nums[j]=temp;
        	}
        }
        
    }
}

/*class Solution {
public:
    void sortColors(int A[], int n) {
        int second=n-1, zero=0;
        for (int i=0; i<=second; i++) {
            while (A[i]==2 && i<second) swap(A[i], A[second--]);
            while (A[i]==0 && i>zero) swap(A[i], A[zero++]);
        }
    }
};*/