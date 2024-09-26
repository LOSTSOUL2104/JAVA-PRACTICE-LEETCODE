public class String_Builder {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder ();

        s.append ("Hello");

        System.out.println ("String = " + s);

        StringBuilder s1 = new StringBuilder ("AAAAAAAAAAAA");
        System.out.println ("String1 = " + s1.toString ());

        StringBuilder s2 = new StringBuilder (10);

        System.out.println ("String2 = " + s2.capacity ());

        StringBuilder s3 = new StringBuilder (s1.toString ());

        System.out.println ("String3 = " + s3.toString ());

//        s.appendCodePoint (14);
//        System.out.println (s);

//        int capacity = s.capacity ();

//        System.out.println (capacity);
    s.append (" world");
        System.out.println (s);
//
//        s.insert (2," ");
//        System.out.println (s);

//        s.reverse ();
//        System.out.println (s);


    }
}
