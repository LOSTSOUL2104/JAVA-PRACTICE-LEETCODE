package GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;

public class graphs_8 {
    public static void main(String[] args) {
        DirGraph graph = new DirGraph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        System.out.println(graph.isPath(0, 4));
        System.out.println(graph.isPath(0, 5));
        System.out.println(graph.isPath(0, 6));
        System.out.println(graph.isPath(3, 4));
    }
}

class DirGraph {
    private final int v;
    private final ArrayList<LinkedList<Integer>> adjList;

    public DirGraph(int v) {
        this.v = v;
        adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
    }


    public boolean isPath(int src, int dest) {
        boolean[] vis = new boolean[v];
        if ( isPathUtil(src, dest, vis))
        {
            return true;
        }
        return false;
    }


    private boolean isPathUtil(int src, int dest, boolean[] vis) {
        if (src == dest) {
            return true;
        }

        vis[src] = true;

        for (int ele : adjList.get(src)) {
            if (!vis[ele]) {
                if (isPathUtil(ele, dest, vis)) {
                    return true;
                }
            }
        }

        return false;
    }
}
