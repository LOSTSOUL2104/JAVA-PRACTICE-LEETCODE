package GRAPHS;

import java.util.ArrayList;
//MINIMUM EDGES
 public class graphs_6 {

}
class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] isInStack = new boolean[V];

        for(int i = 0; i<V; i++) {
            if(!visited[i] && isCycleDFS(adj, i, visited, isInStack)) {
                return true;
            }
        }
        return false;
    }
    public boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int k, boolean[] visited, boolean[] isInStack) {
        visited[k] = true;
        isInStack[k] = true;

        for(int ele : adj.get(k)){
            if(!visited[ele] && isCycleDFS(adj, ele, visited, isInStack)){
                return true;
            }
            else if(isInStack[ele] == true) {
                return true;
            }
        }
        isInStack[k] = false;
        return false;
}
}