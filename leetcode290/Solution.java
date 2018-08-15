package leetcode290;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern==null || str==null) return false;
        String[] words=str.split(" ");
        if(words.length!=pattern.length()) return false;
        Map<Object,Integer> index = new HashMap<Object, Integer>();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }
}