package COLLECTIONS;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list_1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String> ();
        ll.add ("hello");
        ll.add ("world");
        ll.add ("wow");

        for (int i = 0; i < ll.size (); i++)
        {
            System.out.print (ll.get (i) + " ");
        }
        System.out.println ();
        ll.remove ("wow");
        for (int i = 0; i < ll.size () ; i++) {
            System.out.print (ll.get (i) + " ");
        }

    }
}
