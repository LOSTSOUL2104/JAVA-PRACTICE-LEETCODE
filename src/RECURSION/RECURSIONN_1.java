package RECURSION;

public class RECURSIONN_1 {
    public static void main(String[] args) {
        n_to_1(5);
        System.out.println();
        one_to_n(5);
        System.out.println();
        int ans = fact(5);
        System.out.println(ans);
        int summ = sum(5);
        System.out.println(summ);
        int sumofdigits = sum_of_digits(1234);
        System.out.println(sumofdigits);
        int prodofdigits = prod_of_digits(123);
        System.out.println(prodofdigits);
        int rev = reverse(123456);
        System.out.println(rev);
        System.out.println(Zerocounter(1010101));
    }

    static void n_to_1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        n_to_1(n - 1);
    }

    static void one_to_n(int n) {
        if (n == 0) {
            return;
        }
        one_to_n(n - 1);
        System.out.print(n + " ");
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);

    }

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    static int sum_of_digits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum_of_digits(n / 10);
    }

    static int prod_of_digits(int n) {
        if (n == 0) {
            return 1;
        }
        return (n % 10) * prod_of_digits(n / 10);
    }

    static int reverse(int n) {
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static int Zerocounter(int n)
    {
            return helper2(n,0);
    }
    private static int helper2(int n, int target)
    {
        if (n==0)
        {
            return target;
        }
        int rem = n%10;
        if (rem ==0)
        {
            return helper2(n/10,target + 1);
        }
        return helper2(n/10,target);
    }

}
