package COLLECTIONS;
import java.util.*;

public class three {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<> ();
        List<Integer> list2 = new ArrayList<> ();

        list.add (20);
        list.add (30);
        list.add (40);
        list2.add (50);
        list2.add (60);
        list2.add (70);
        System.out.println (list);
        int lastindex = list.indexOf (40);
        System.out.println (lastindex);
        list.set (1,5000);

        System.out.println (list);
        System.out.println (list2);
    List<Integer> vector = new Vector<> ();
    vector.add (400);
    vector.add(500);
    vector.add (600);
        System.out.println (vector);

    }
    }
