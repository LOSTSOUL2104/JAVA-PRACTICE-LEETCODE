package GRAPHS;
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
