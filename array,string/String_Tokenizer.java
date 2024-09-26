import java.util.StringTokenizer;

public class String_Tokenizer {
    public static void main(String[] args) {
        StringTokenizer s = new StringTokenizer ("hello world");

        StringTokenizer temp = new StringTokenizer ("");

        int count = s.countTokens ();

        System.out.println (count);

        System.out.println ("hello world" + s.hasMoreTokens ());

        System.out.println ("Empty : " + temp.hasMoreTokens ());

        while(s.hasMoreTokens ())
        {
            System.out.println (s.nextElement ());
        }
    }
}
