package leetcode207;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*public class Solution {    //DFS
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList<Integer>();
        boolean[] memo = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if(!dfs(graph, visited, i, memo)) {
                return false;    
            }
        }
        return true;
    }

    private boolean dfs(ArrayList[] graph, boolean[] visited, int course, boolean[] memo){
        if (visited[course]) {
            return false;
        }
        
        if (memo[course]) {
            return true;
        }
        visited[course] = true;
        for (int i = 0; i < graph[course].size(); i++) {
            if (!dfs(graph, visited, (int)graph[course].get(i), memo)) {
                return false;
            }
        }
        visited[course] = false;
        memo[course] = true;
        return true;
    }
}*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Solution {    //BFS
	public boolean canFinish(int numCourses, int[][] prerequisites) {   //BFS
	    int[][] matrix = new int[numCourses][numCourses]; // i -> j
	    int[] indegree = new int[numCourses];
	    
	    for (int i=0; i<prerequisites.length; i++) {
	        int ready = prerequisites[i][0];
	        int pre = prerequisites[i][1];
	        if (matrix[pre][ready] == 0)
	            indegree[ready]++; //duplicate case
	        matrix[pre][ready] = 1;
	    }
	    
	    int count = 0;
	    Queue<Integer> queue = new LinkedList<Integer>();
	    for (int i=0; i<indegree.length; i++) {
	        if (indegree[i] == 0) queue.offer(i);
	    }
	    while (!queue.isEmpty()) {
	        int course = queue.poll();
	        count++;
	        for (int i=0; i<numCourses; i++) {
	            if (matrix[course][i] != 0) {
	                if (--indegree[i] == 0)
	                    queue.offer(i);
	            }
	        }
	    }
	    return count == numCourses;
	}
}
