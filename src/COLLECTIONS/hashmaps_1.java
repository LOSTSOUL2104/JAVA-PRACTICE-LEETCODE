package COLLECTIONS;

import java.util.*;

public class hashmaps_1 {
    public static void main(String[] args) {
//        String name = "priyansh";
//        Integer a = 123456;
//        int code = a.hashCode ();
//        System.out.println (code);
        HashMap<String, Integer> hashmap = new HashMap<> ();

        hashmap.put ("hello", 1); hashmap.put ("world", 2);

        System.out.println (hashmap.get ("hello"));


        System.out.println (hashmap.containsKey ("world")); System.out.println (hashmap.containsKey ("hello"));

        System.out.println (hashmap.size ()); hashmap.remove ("world"); System.out.println (hashmap);

    }

}
