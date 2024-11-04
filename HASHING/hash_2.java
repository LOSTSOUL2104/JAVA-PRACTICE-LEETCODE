// given a string find the length of the longest substring with non-repeating character


package HASHING;

import java.util.HashMap;
import java.util.Scanner;

public class hash_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String test = in.next ();
        int result = length (test);
        System.out.println ("the length is : " + result);
    }
    public static int length(String s)
    {
        int n = s.length ();
        int ans = 0;
        int i = 0;
        HashMap<Character,Integer> charIndex = new HashMap<> ();
        for (int j = 0; j <n ; j++) {
            char c = s.charAt (i);
            if (charIndex.containsKey (c))
            {
                i = Math.max(i,charIndex.get (c) + 1);
            }
            charIndex.put (c,j);
            ans = Math.max (ans,j-i+1);
        }
        return ans;
    }
}
