package RECURSION;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Recursion_4 {
    public static void main(String[] args) {
//        skip_character("","bddchdda");
//        System.out.println(skip_string("bacapplecdah"));
//        System.out.println(skipfirstNotSecond("bacapplecdah"));
//        System.out.println(subseqRet("", "abc"));
//        subseqAscii("","abc");
        System.out.println(subseqAsciiArrList("","abc"));
    }

    static void skip_character(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'd') {
            skip_character(p, up.substring(1));
        } else {
            skip_character(p + ch, up.substring(1));
        }
    }

    static String skip_string(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skip_string(up.substring(5));
        } else {
            return up.charAt(0) + skip_string(up.substring(1));
        }
    }

    static String skipfirstNotSecond(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipfirstNotSecond(up.substring(3));
        } else {
            return up.charAt(0) + skipfirstNotSecond(up.substring(1));
        }
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseqAscii(String p, String up)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char  ch = up.charAt(0);
        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p + (ch + 0),up.substring(1));
    }
    static ArrayList<String> subseqAsciiArrList(String p, String up)
    {
        if (up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiArrList(p+ch,up.substring(1));
        ArrayList<String > second = subseqAsciiArrList(p,up.substring(1));
        ArrayList<String > third = subseqAsciiArrList(p + (ch + 0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
