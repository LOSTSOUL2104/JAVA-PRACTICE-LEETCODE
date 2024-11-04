package HEAPS;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priority_1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer> ();
        pq.add (10);
        pq.add (20);
        pq.add (30);

        System.out.println (pq.peek ());

        System.out.println (pq.poll ());

        System.out.println (pq.peek ());
//        for (int i = 0; i < 2 ; i++) {
//            pq.add (i);
//            pq.add (1);
//        }
//        System.out.println (pq);

        pq.remove (10);
        System.out.println (pq);

        Iterator iterator = pq.iterator ();

        while (iterator.hasNext ())
        {
            System.out.println (iterator.next () + " ");
        }
    }
}
