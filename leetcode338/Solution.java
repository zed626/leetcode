package leetcode338;

class Solution {
    public int[] countBits(int num) {
        if(num<0) return new int[]{};
        int [] result=new int [num+1];
        int carry=1;
        result[0]=0;       
        for(int i=1;i<=num;i++){
        	result[i]=result[i-carry]+1;
        	if(i==carry*2-1){
        		carry*=2;      		
        	}

        }
        return result;
    }
}