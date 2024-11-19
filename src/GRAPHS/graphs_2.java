package GRAPHS;

import java.util.*;

public class graphs_2 {
    public ArrayList<Integer> bfsOfGraph(int V,
        ArrayList<ArrayList<Integer>> adj) {

        ArrayList < Integer > bfs = new ArrayList < > ();
        boolean vis[] = new boolean[V];
        Queue < Integer > q = new LinkedList < > ();

        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);
            for (Integer it: adj.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }

        return bfs;
    }
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls) {
        vis[node] = true;
        ls.add(node);

        for(Integer it: adj.get(node)) {
            if(vis[it] == false) {
                dfs(it, vis, adj, ls);
            }
        }
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }

    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i <5 ; i++) {
            adj.add(new ArrayList<> ());
        }
        adj.get (0).add (1);
        adj.get (1).add (0);
        adj.get (0).add (4);
        adj.get (4).add (0);
        adj.get (1).add (2);
        adj.get (2).add (1);
        adj.get (1).add (3);
        adj.get (3).add (1);
        graphs_2 sl = new graphs_2 ();
        ArrayList < Integer > ans = sl.bfsOfGraph(5, adj);
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" ");
    }
        System.out.println ();
        ArrayList < Integer > ans2 = sl.dfsOfGraph(5, adj);
        int m = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans2.get(i)+" ");
        }
    }
}

