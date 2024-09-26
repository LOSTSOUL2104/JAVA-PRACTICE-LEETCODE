public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer ("hello");

        int p = s.length ();
        int q = s.capacity ();

        System.out.println ("Length : " + p);

        System.out.println ("capacity :" + q);

        s.append (" world");
        System.out.println (s);

        s.insert (5," there, ");
        System.out.println (s);

//        s.reverse ();
//        System.out.println (s);

//        s.deleteCharAt (7);
//        System.out.println (s);
//    s.replace (5,7,"wow");
//        System.out.println (s);

    }
}
