package GRAPHS;
//DIRECTED GRAPH
import java.util.*;

public class graphs_7 {
    public static void main(String[] args) {
        int V = 5;
        CycleDetectorDirected cycle = new CycleDetectorDirected(V);

        cycle.add(1, 2);
//        cycle.add(2, 3);
        cycle.add(3, 4);
        cycle.add(4, 2);
        cycle.add(4, 5);

        if (cycle.hasCycle()) {
            System.out.println("Cycle detected in the graph");
        } else {
            System.out.println("No cycle detected in the graph");
        }
    }
}
class CycleDetectorDirected {
    int V;
    List<Integer>[] adjList;

    @SuppressWarnings ("unchecked")
    CycleDetectorDirected(int V) {
        this.V = V;
        adjList = new ArrayList[ V + 1 ];
        for (int i = 0; i <= V; i++) {
            adjList[ i ] = new ArrayList<> ();
        }
    }

    void add(int v1, int v2) {
        adjList[ v1 ].add (v2);
    }

    boolean hasCycle() {
        boolean[] visited = new boolean[ V + 1 ];
        boolean[] inRecStack = new boolean[ V + 1 ];

        for (int i = 1; i <= V; i++) {
            if (!visited[ i ]) {
                if (dfsCycleCheck (i, visited, inRecStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfsCycleCheck(int node, boolean[] visited, boolean[] inRecStack) {
        visited[ node ] = true;
        inRecStack[ node ] = true;

        for (int neighbor : adjList[ node ]) {
            if (!visited[ neighbor ]) {
                if (dfsCycleCheck (neighbor, visited, inRecStack)) {
                    return true;
                }
            } else if (inRecStack[ neighbor ]) {
                return true;
            }
        }

        inRecStack[ node ] = false;
        return false;
    }

}


