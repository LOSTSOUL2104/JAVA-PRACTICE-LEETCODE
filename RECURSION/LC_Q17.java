package RECURSION;

import java.util.ArrayList;

public class LC_Q17 {
    public static void main(String[] args) {
//pad("","12");
        System.out.println(padlist("","12"));
    }
    static void pad(String p , String up)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i <digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            pad(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> padlist(String p , String up)
    {
        if (up.isEmpty())
        {
          ArrayList<String > list = new ArrayList<>();
          list.add(p);
          return  list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i <digit * 3 ; i++) {
            char ch = (char) ('a' + i);
           ans.addAll( padlist(p+ch,up.substring(1)));
        }
        return ans;
    }
//    SOLUTION =>>
    
//    public static List<String> solve(String ans, String ip) {
//        if(ip.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(ans);
//            return list;
//        }
//        int digit = ip.charAt(0) - '0';
//        int i=(digit-2)*3;
//        if(digit > 7) {
//            i+=1;
//        }
//        int len = i+3;
//        if(digit == 7 || digit == 9) {
//            len+=1;
//        }
//        ArrayList<String> list = new ArrayList<>();
//        for(; i<len; i++) {
//            char ch = (char)('a' + i);
//            list.addAll(solve(ans+ch, ip.substring(1)));
//        }
//        return list;
//    }
}
