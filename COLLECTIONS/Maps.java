package COLLECTIONS;
import java.util.*;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) throws Exception {
        String f1 = "Hello world";
        Scanner in = new Scanner (f1);

        Map<String,Integer> map = new HashMap<String,Integer> ();
        while(in.hasNext ())
        {
            String word = in.next ();
            int freq = (map.get(word) == null) ? 1: map.get (word) + 1;
            map.put (word,freq);
        }
        System.out.println (map);
    }
}
