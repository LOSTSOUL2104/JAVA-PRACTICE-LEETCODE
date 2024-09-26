public class RECURSION_1 {
    public static void main(String[] args) {
    numbers(1);
    }
    static void numbers(int n)
    {
        if (n == 9)
        {
            return;
        }
        System.out.println(n);
        numbers(n +1 );
    }
}
