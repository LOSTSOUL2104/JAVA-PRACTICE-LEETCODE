package Dynamic_Programming;

import java.util.Arrays;

//count number of ways :
public class dp_2 {
    private static int[] memo;

    public static void main(String[] args) {
        int n = 12;
        memo = new int[ n + 2 ];
        Arrays.fill (memo, -1);
        System.out.println (countnumber (n));
    }

    static int countnumber(int n) {
        if (n < 0) {
            return 0;
        } if (n == 0) {
            return 1;
        }
        memo[n] = countnumber (n-1) +countnumber (n-2) + countnumber (n-3);
        return memo[n];
        }
//        static int tabcountnumber(int n)
//        {
//            for (int i = 0; i <= n ; i++) {
//                if (i>=2)
//                {
//                    tab[i] += tab[i-2];
//                }
//                if (i>=3)
//                {
//                    tab[i] += tab[i-3];
//                }
//            }
//            return tab[n];
//        }
    }
