package leetcode69;

class Solution {
    public int mySqrt(int x) {
        if(x<=0) return x;
        int a=1,b=x;
        while(true) {
        	int temp=a+(b-a)/2;
        	if(temp<=x/temp) {
        		a=temp+1;
                if(temp+1>x/(temp+1))
                    return temp;
        	}
        	else {
        		b=temp-1;
        	}
        }
    }
}

/*#newton method
long r = x;
while (r*r > x)
    r = (r + x/r) / 2;
return (int) r;*/