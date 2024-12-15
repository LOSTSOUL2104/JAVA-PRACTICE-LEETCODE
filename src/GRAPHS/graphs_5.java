package GRAPHS;
import java.lang.reflect.Array;

//UNDIRECTED
import java.util.*;
public class graphs_5 {
    public static void main(String[] args) {
        Graph g1 = new Graph (5);
        g1.addEdge (0,1);
//        g1.addEdge (0,2);
        g1.addEdge (0,3);
        g1.addEdge (1,2);
        g1.addEdge (3,4);

        g1.printGraph();

        if (g1.detectCycle ())
        {
            System.out.println ("graph has cycle");
        }
        else
        {
            System.out.println ("no cycle");
        }
        int src = 0;
        int dest = 4;
        int minEdges = g1.minEdge(src, dest);
        if (minEdges != -1) {
            System.out.println(minEdges);
        } else {
            System.out.println("No path exists ");
        }
    }
}
class Graph
{
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i <v ; i++) {
            adj[i] = new LinkedList<> ();
        }
    }
    void addEdge(int v, int w)
    {
        adj[v].add (w);
        adj[w].add (v);
    }
    Boolean DFS(int v, Boolean visited[], int parent)
    {
        visited[v] = true;
        Integer i;

        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();
            if (!visited[i])
            {
                if (DFS(i, visited, v))
                    return true;
            }
            else if (i != parent)
                return true;
        }
        return false;
    }
    int minEdge(int src, int dest) {
        boolean[] vis = new boolean[V];
        vis[src] = true;
        int[] dist = new int[V];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int neighbor : adj[temp]) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    dist[neighbor] = dist[temp] + 1;

                    if (neighbor == dest) {
                        return dist[neighbor];
                    }

                    q.add(neighbor);
                }
            }
        }
        return -1;
    }

    Boolean detectCycle()
    {
        Boolean[]visited = new Boolean[V];

        for (int i = 0; i < V; i++)
            visited[i] = false;

        for (int u = 0; u <V ; u++) {
            if (!visited[u])
            {
                if (DFS(u,visited,-1))
                {
                    return true;
                }
            }
        }
        return false;
    }
    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print ("Vertex " + i + ":");
            for (Integer node : adj[ i ]) {
                System.out.print (" -> " + node);
            }
            System.out.println ();
        }
    }
}
