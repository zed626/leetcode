package leetcode79;


class Solution {
    public boolean exist(char[][] board, String word) {
        if(board==null || board.length==0 || word==null) return false;
        boolean visit[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++) {
        	for(int j=0;j<board[0].length;j++) {
        		if(recursive(visit, board, word, 0, i, j)) {
        			return true;
        		}
        	}
        }
        return false;
    }
    
    public boolean recursive(boolean visit[][],char board[][],String word,int index,int x,int y) {
    	if(index==word.length()) return true;
    	if(x<0||x>=board.length||y<0 ||y>=board[0].length) return false;
    	boolean result=false;
    	if(!visit[x][y]&&board[x][y]==word.charAt(index)) {
    		visit[x][y]=true;
    		result= recursive(visit, board, word, index+1, x+1, y)||recursive(visit, board, word, index+1, x-1, y)||recursive(visit, board, word, index+1, x, y+1)||recursive(visit, board, word, index+1, x, y-1);
    		visit[x][y]=false;
    	}
    	return result;
    }
}