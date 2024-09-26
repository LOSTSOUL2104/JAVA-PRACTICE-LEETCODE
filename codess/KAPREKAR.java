import java.util.Scanner;

public class KAPREKAR {
    public static void main(String[] args) {
        // Write your code here
        Scanner in = new Scanner (System.in); int test = in.nextInt (); for (int i = 0; i < test; i++) {
            int n = in.nextInt (); if (iskaprekar (n)) {
                System.out.println (1);
            } else {
                System.out.println (0);
            }
        }
    }

    public static boolean iskaprekar(int n) {
        if (n == 1) {
            return true;
        } int numdigits = 0;
        int temp = n;
        int square = n * n;
        while (temp != 0) {
            numdigits++; temp /= 10;
        } int divisor = (int) Math.pow (10, numdigits);
        int left = square / divisor;
        int right = square % divisor;
        if (left + right == n && right != 0) {
            return true;
        }
        return false;
    }
}
