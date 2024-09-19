public class EVEN_DIGITS {
    public static void main(String[] args) {
    int [] nums = {12,345,2,-6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(0));
        System.out.println(even(-132));
    }
    static int findNumbers (int[] nums) {
        int count = 0;
        for (int num : nums)
        {
            if (even(num))
            {
                count ++;
            }
        }
        return count;
    }
    static boolean even(int nums) {
        int  numberofdigits = digits(nums);
//        if (numberofdigits %2 == 0)
//        {
//            return true;
//        }
//        return false;
//        OR
        return numberofdigits%2 ==0;
    }
//    COUNT DIGITS
    static int digits(int num)
    {
        if (num <0)
        {
            num = num *-1;
        }
        if (num == 0)
        {
            return 1;
        }
        int count = 0;
        while(num>0)
        {
            count ++;
            num /= 10;
        }
        return count;
    }
}
