package RECURSION;

public class rec_1 {
    public static void main(String[] args) {
        nto1 (5);
        System.out.println ();
        oneton(5);
        System.out.println ();
        System.out.println (prodnto1 (5));
        System.out.println ();
        System.out.println (sumnto1 (4));
        System.out.println ();
        System.out.println (sumofdigits (123));
        System.out.println ();
        System.out.println (prodofdigits (1234));
    }
    static void nto1(int n)
    {
        if(n == 0)
        {
            return ;
        }
        System.out.print (n + " ");
        nto1(n-1);
    }
    static void oneton(int n)
    {
        if (n==0)
        {
            return;
        }
        oneton (n-1);
        System.out.print (n + " ");
    }
    static int prodnto1(int n)
    {
        if(n <=1)
        {
            return 1;
        }
        return n * prodnto1 (n-1);
    }
    static int sumnto1(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n + sumnto1 (n-1);
    }
    static int sumofdigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10) + sumofdigits (n/10);
    }
    static int prodofdigits(int n)
    {
        if(n <=1)
        {
            return 1;
        }
        return (n%10) * prodofdigits (n/10);

    }
}
