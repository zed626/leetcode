package leetcode202;

import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        if(n<=0) return false;
        HashSet<Integer> set=new HashSet<>();
        while(!set.contains(n)) {
        	set.add(n);
        	n=convert(n);
        	if(n==1) return true;
        }
        return false;
    }
    
    public int convert(int n) {
    	int x=0;
    	for(;n!=0;n/=10) {
    		x+=(n%10)*(n%10);
    	}
    	return x;
    }
}


/*int digitSquareSum(int n) {
    int sum = 0, tmp;
    while (n) {
        tmp = n % 10;
        sum += tmp * tmp;
        n /= 10;
    }
    return sum;
}

bool isHappy(int n) {
    int slow, fast;
    slow = fast = n;
    do {
        slow = digitSquareSum(slow);
        fast = digitSquareSum(fast);
        fast = digitSquareSum(fast);
    } while(slow != fast);
    if (slow == 1) return 1;
    else return 0;
}*/