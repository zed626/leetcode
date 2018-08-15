package leetcode389;

class Solution {
    public char findTheDifference(String s, String t) {
        if(s==null || t==null || t.length()-s.length()!=1) return 0;
        int[] alpha=new int [26];
        for (char c : s.toCharArray())
            alpha[ c - 'a' ]++;

        for (char c : t.toCharArray()) {
           //could do decrement first, then check but yeah
            if (--alpha[c - 'a'] < 0)
                return c;
        }
        return 0;
    }
}


/*public char findTheDifference(String s, String t) {
	int n = t.length();
	char c = t.charAt(n - 1);
	for (int i = 0; i < n - 1; ++i) {
		c ^= s.charAt(i);
		c ^= t.charAt(i);
	}
	return c;
}*/