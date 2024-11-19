package COLLECTIONS;
import java.util.*;
public class coll_1 {
    public static void main(String[] args) {


        List<String> lst = new ArrayList<String> ();  // Inform compiler about the type
        lst.add ("hello");
        lst.add ("world");
        lst.add ("wow");
        System.out.println (lst);

//        Iterator<String> iter = lst.iterator ();
//        while(iter.hasNext ())
//        {
//            String str = iter.next ();
//            System.out.println (str);
//        }
    Object[] cq2 = lst.toArray ();
        System.out.println (Arrays.toString (cq2));
        String[] cq3 = lst.toArray (new String[0]);

        cq3[2] = "Girdhar";
        System.out.println (Arrays.toString (cq3));
        System.out.println (lst);
    }
}
