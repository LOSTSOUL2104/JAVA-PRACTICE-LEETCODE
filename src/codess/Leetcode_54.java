import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode_54 {

    public static List<Integer> printSpiral(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                ans.add(mat[top][i]);

            top++;

            for (int i = top; i <= bottom; i++)
                ans.add(mat[i][right]);

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(mat[bottom][i]);

                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(mat[i][left]);

                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter row");
        int row = in.nextInt ();
        System.out.println ("Enter cols");
        int col = in.nextInt ();
        int [][] mat = new int [row][col];
        System.out.println ("enter matrix");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                mat[i][j] = in.nextInt ();
            }
        }
        List<Integer> ans = printSpiral(mat);

        for (int i : ans) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
