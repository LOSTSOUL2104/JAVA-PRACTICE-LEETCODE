package COLLECTIONS;

import java.util.HashMap;
import java.util.Map;

public class two {
    public static void main(String[] args) {


        Map<Integer, String> mpp = new HashMap<> ();

        mpp.put (1, "A");
        mpp.put (2, "b");
        mpp.put (3, "c");
        mpp.put (4, "c");
        mpp.put (5, "d");

        System.out.println (mpp);
        for (Integer a : mpp.keySet ()) {
            System.out.println (mpp.get (a));
        }
    }
}
