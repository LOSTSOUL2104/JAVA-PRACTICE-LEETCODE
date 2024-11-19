package HASHING;

import java.util.Hashtable;
import java.util.Map;

public class hashtable_1 {
    public static void main(String[] args) {
        Hashtable<String,Integer>tab = new Hashtable<String,Integer> ();
        tab.put ("one",1);
        tab.put("two",2);
        System.out.println (tab);
        tab.put("three",3);
        System.out.println (tab);
        tab.remove ("two",2);
        System.out.println (tab);
        for (Map.Entry<String,Integer> e: tab.entrySet ())
        {
            System.out.println (e.getKey () + " " +e.getValue ());
        }
    }
}
