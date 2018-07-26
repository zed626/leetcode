package leetcode345;

class Solution {
	public String reverseVowels(String s) {
		if (s == null || s.length() == 0)
			return "";
		StringBuilder builder = new StringBuilder(s);
		int i = 0, j = builder.length() - 1;
		while (i < j) {
			while (i<j&&!isVowels(builder.charAt(i))) {
				i++;
			}
			while (i<j&&!isVowels(builder.charAt(j))) {
				j--;
			}
			char temp = builder.charAt(i);
			builder.setCharAt(i, builder.charAt(j));
			builder.setCharAt(j, temp);
			i++;
			j--;

		}
		return builder.toString();
	}
	
	public boolean isVowels(char a) {
		if(a== 'a'||a== 'e'||a== 'i'||a== 'o'||a== 'u'||
				a== 'A'||a== 'E'||a== 'I'||a== 'O'||a== 'U')
			return true;
		else return false;
	}
}