public class PALINDROME {
    public static void main(String[] args) {
//            String str  = "ArOrA";
//        System.out.println(ispalindrome(str));
        System.out.println (reverse (1234));
    }
    static boolean ispalindrome(String str)
    {
        if (str == null || str.length() == 0)
        {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <str.length() / 2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end)
            {
                return false;
            }
        }
        return true;
    }
    static int reverse(int n)
    {
        int rev = 0;
        int rem;
        while(n>0)
        {
            rem = n%10;
            rev = (rev*10) + rem;
            n /= 10;
        }
        return rev;
    }

}
