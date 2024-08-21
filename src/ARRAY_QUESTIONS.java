import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_QUESTIONS {
    public static void main(String[] args) {
        // Q1 RETURN NUMBER FROM AN ARRAY :
        // Q2 FIND MAX NUMBER IN AN ARRAY :
        // Q3 REVERSE AN ARRAY :
        // Q4 INVERSE A NUMBER :

        Scanner in = new Scanner (System.in);

        System.out.print ("Enter the number of elements of the array: "); int n = in.nextInt ();

        int[] arr = new int[ n ]; System.out.println ("Enter your array: "); for (int i = 0; i < n; i++) {
            arr[ i ] = in.nextInt ();
        }

        System.out.println ("Your array is: " + Arrays.toString (arr));

        System.out.println ("ENTER YOUR TARGET : "); int target = in.nextInt ();

        System.out.println ("The max element of this array is: " + maxVal (arr));

        System.out.println ("Your element is at : " + LinearSearch (arr, target));

        reverse (arr);

        int num = in.nextInt ();

        System.out.println (inverseNumber (num));
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } for (int i = 0; i < arr.length; i++) {
            int element = arr[ i ]; if (element == target) {
                return i;
            }
        } return -1;
    }

    static int maxVal(int[] arr) {
        int max = arr[ 0 ]; for (int i = 1; i < arr.length; i++) {
            if (arr[ i ] > max) {
                max = arr[ i ];
            }
        } return max;
    }

    static void reverse(int[] arr) {
        int start = 0; int end = arr.length - 1; while (start < end) {
            int temp = arr[ start ]; arr[ start ] = arr[ end ]; arr[ end ] = temp; start++; end--;
        } System.out.println (Arrays.toString (arr));
    }


    static int inverseNumber(int num) {
        int number = 0;
        int position = 1;
        while (num > 0) {
            int digit = num % 10; number += position * Math.pow (10, digit - 1);
            num /= 10;
            position++;
        }
        return number;
    }

}
