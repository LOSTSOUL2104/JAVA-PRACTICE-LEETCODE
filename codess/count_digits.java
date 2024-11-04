package codess;

import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int cnt = 0;
        while(n!=0)
        {
            n /= 10;
            cnt++;
        }
        System.out.println ("the number of digits are : " + cnt);
    }
}
