package GRAPHS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstras {
    public static void main(String[] args) throws IOException {
        int V = 3, E=3,S=2;
        ArrayList<Integer> node1 = new ArrayList<Integer>() {{add(1);add(1);}};
        ArrayList<Integer> node2 = new ArrayList<Integer>() {{add(2);add(6);}};
        ArrayList<Integer> node3 = new ArrayList<Integer>() {{add(2);add(3);}};
        ArrayList<Integer> node4 = new ArrayList<Integer>() {{add(0);add(1);}};
        ArrayList<Integer> node5 = new ArrayList<Integer>() {{add(1);add(3);}};
        ArrayList<Integer> node6 = new ArrayList<Integer>() {{add(0);add(6);}};

        ArrayList<ArrayList<Integer>> inter1 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node1);
                add(node2);
            }
        };
        ArrayList<ArrayList<Integer>> inter2 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node3);
                add(node4);
            }
        };
        ArrayList<ArrayList<Integer>> inter3 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node5);
                add(node6);
            }
        };
        ArrayList<ArrayList<ArrayList<Integer>>> adj= new ArrayList<ArrayList<ArrayList<Integer>>>(){
            {
                add(inter1); // for 1st node
                add(inter2); // for 2nd node
                add(inter3); // for 3rd node
            }
        };
        //add final values of adj here.
        Solutionn obj = new Solutionn();
        int[] res= obj.dijkstra(V,adj,S);

        for(int i=0;i<V;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

    }
}
class Pair{
    int node;
    int distance;
    public  Pair(int distance,int node)
    {
        this.node = node;
        this.distance = distance;
    }
}
class Solutionn{
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        PriorityQueue<Pair> pq = new PriorityQueue<> ((x, y) -> x.distance - y.distance);
        int [] dist = new int[V];
        for (int i = 0; i <V ; i++) {
            dist[i] = (int)(1e9);
        }
        dist[S] = 0;
        pq.add(new Pair (0,S));

        while (pq.size ()!=0)
        {
            int dis = pq.peek ().distance;
            int node = pq.peek ().node;

            pq.remove ();

            for (int i = 0; i < adj.get(node).size () ; i++) {
                int edgeweight = adj.get (node).get (i).get (1);
            }
        }
        return dist;
    }

}
