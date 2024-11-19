package Dynamic_Programming;

public class dp_1 {
    private static int[]memo;
    private static  int[] tab;
    public static void main(String[] args) {
        int n = 5;
        memo = new int[n+1] ;
        tab = new int[n+1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        System.out.println ("using memoization");
        System.out.println (fibmemo(n));
        System.out.println ("using tabulation");
        System.out.println (fibtal(n));

    }
    static int fibmemo(int n)
    {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = fibmemo(n - 1) + fibmemo(n - 2);
        return memo[n];
    }
    static  int fibtal(int n)
    {
        tab[0] = 0;
        if (n > 0)
        {
            tab[1] = 1;
        }
    for (int i = 2; i <=n;i++)
    {
        tab[i] = tab[i - 1] + tab[i - 2];
    }
        return tab[n];
    }
}
