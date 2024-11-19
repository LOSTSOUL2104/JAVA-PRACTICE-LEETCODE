package GRAPHS;

import java.util.ArrayList;
import java.util.List;

public class graph_1 {
    public static void main(String[] args) {
//        adjacency matrix
        int n = 4;
        int[][] adjmat = new int[ n + 1 ][ n + 1 ];
        adjmat[ 0 ][ 1 ] = 1;
        adjmat[ 0 ][ 3 ] = 1;
        adjmat[ 1 ][ 0 ] = 1;
        adjmat[ 1 ][ 2 ] = 1;
        adjmat[ 2 ][ 1 ] = 1;
        adjmat[ 3 ][ 0 ] = 1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print (adjmat[i][j] + " ");
            }
            System.out.println ();
        }

//        adjacency list
        List<List<Integer>> adjlist = new ArrayList<> ();
        for (int i = 0; i <n ; i++) {
            adjlist.add (new ArrayList<> ());
        }
        adjlist.get (0).add (1);
        adjlist.get (0).add (3);
        adjlist.get (1).add (0);
        adjlist.get (1).add (2);
        adjlist.get (2).add (1);
        adjlist.get (3).add (0);

        for (Object obj : adjlist)
        {
            System.out.println(obj);
        }

//        edge list

        List<int[]> edgeList = new ArrayList<>();

        edgeList.add(new int[]{0, 1});
        edgeList.add(new int[]{1, 3});
        edgeList.add(new int[]{1, 0});
        edgeList.add(new int[]{1, 2});
        edgeList.add(new int[]{2, 1});
        edgeList.add(new int[]{3, 0});

        for (int[] edge : edgeList) {
            System.out.println(edge[0] + " -> " + edge[1]);
        }
    }
}
