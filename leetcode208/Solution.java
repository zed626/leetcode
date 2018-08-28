package leetcode208;



class TrieNode {
    public char val;
    public boolean isWord; 
    public TrieNode[] children = new TrieNode[26];
    public TrieNode() {}
    TrieNode(char c){
        TrieNode node = new TrieNode();
        node.val = c;
    }
}

class Trie {
	private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
        root.val=' ';
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode pNode=root;
        for(char k:word.toCharArray()) {
        	if(pNode.children[k-'a']==null) {
        		pNode.children[k-'a']=new TrieNode(k);
        	}
        	pNode=pNode.children[k-'a'];
        }
        pNode.isWord=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode pNode=root;
        for(char k:word.toCharArray()) {
        	if(pNode.children[k-'a']==null) {
        		return false;
        	}
        	pNode=pNode.children[k-'a'];
        }
        return pNode.isWord;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode pNode=root;
        for(char k:prefix.toCharArray()) {
        	if(pNode.children[k-'a']==null) {
        		return false;
        	}
        	pNode=pNode.children[k-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */