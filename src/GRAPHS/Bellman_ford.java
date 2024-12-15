package GRAPHS;

import java.util.Arrays;

public class Bellman_ford {
    public static void main(String[] args) {
        int V = 5; 
        int[][] edges = {
                {0, 1, -1},
                {0, 2, 4},
                {1, 2, 3},
                {1, 3, 2},
                {1, 4, 2},
                {3, 2, 5},
                {3, 1, 1},
                {4, 3, -3}
        };
        int src = 0;

        Solution3 solution = new Solution3();
        int[] result = solution.Bellman(V, edges, src);

        if (result.length == 1 && result[0] == -1) {
            System.out.println("Graph contains a negative weight cycle");
        } else {
            System.out.println("Shortest distances from source " + src + ": " + Arrays.toString(result));
        }
    }
}
class Solution3{
    static int[] Bellman(int V,int[][] edges,int src)
    {
        int [] dist = new int[V];
        int INF = (int)1e8;
        for (int i = 0; i < V; i++) {
            dist[i] = INF;
            dist[src] = 0;
        }

        for (int i = 0; i <V-1 ; i++) {
            for (int[] edge:edges)
            {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];

                if (dist[u]!= INF && dist[u] + wt <dist[v])
                {
                    dist[v] = dist[u] + wt;
                }

            }
            for (int[] edge:edges)
            {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];

                if (dist[u]!= INF && dist[u] + wt <dist[v])
                {
                    return new int[]{-1};
                }
            }
        }

        return dist;
    }
}
