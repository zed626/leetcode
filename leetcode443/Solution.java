package leetcode443;


/*class Solution {
    public int compress(char[] chars) {
        int num=0;
        int key=1;
        char temp=chars[0];
        int index=0;
        int i=1;
        for(;i<chars.length;i++) {
        	if(chars[i]==temp) {
        		key++;
        	}
        	else {
        		chars[index++]=temp;
        		String a=String.valueOf(key);
        		num+=1;
        		if(num>1) {
	        		num+=a.length();
	        		for(char h:a.toCharArray()) {
	        			chars[index++]=h;
	        		}
        		}
        		key=1;
        		temp=chars[i];
        	}
        }
		chars[index++]=temp;
		String a=String.valueOf(key);
		num+=1;
		if(num>1) {
    		num+=a.length();
    		for(char h:a.toCharArray()) {
    			chars[index++]=h;
    		}
		}
		return num;
        
    }
}*/


class Solution {
    public int compress(char[] chars) {
        int index=0;
        for(int i=0;i<chars.length;) {
            int count=0;
        	char temp=chars[i];
        	while(i<chars.length&&chars[i]==temp) {
        		i++;
        		count++;
        	}
        	chars[index++]=temp;
        	if(count>1) {
        		for(char k:Integer.toString(count).toCharArray()) {
        			chars[index++]=k;
        		}
        	}
        }
        return index;
        
    }
}