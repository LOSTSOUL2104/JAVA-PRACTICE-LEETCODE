import java.util.Scanner;

public class PRACTICE_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter row of A");
        int row1 = in.nextInt ();
        System.out.println ("Enter col of A");
        int col1 = in.nextInt ();
        int [][] A = new int[row1][col1];
        System.out.println ("Enter elements of A : ");
        for (int i = 0; i <row1 ; i++) {
            for (int j = 0; j <col1 ; j++) {
                A[i][j] = in.nextInt ();
            }
        }

        System.out.println ("Enter rows of B : ");
        int row2 = in.nextInt ();
        System.out.println ("Enter col of B");
        int col2 = in.nextInt ();
        int [][]B = new int[row2][col2];
        System.out.println ("Enter elements of B : ");
        for (int i = 0; i <row2 ; i++) {
            for (int j = 0; j <col2 ; j++) {
                B[i][j] = in.nextInt ();
            }
        }
//        int[][] A = { { 1, 1, 1 },
//                { 2, 2, 2 },
//                { 3, 3, 3 },
//                { 4, 4, 4 } };
//
//        int[][] B = { { 1, 1, 1, 1 },
//                { 2, 2, 2, 2 },
//                { 3, 3, 3, 3 } };
        multiply (row1,col1,A,row2,col2,B);
    }
    static void print(int [][] M,int rowsize,int colsize)
    {
        for (int i = 0; i <rowsize ; i++)
        {
            for (int j = 0; j <colsize ; j++)
            {
                System.out.print (M[i][j] + " ");
            }
            System.out.println ();
        }
    }
    static void multiply(int row1,int col1 , int [][] A,int row2,int col2,int[][] B)
    {
        int i,j,k;
        System.out.println ("Matrix A : ");
        print (A,row1,col1);
        System.out.println ("Matrix B : ");
        print (B,row2,col2);

        if (row2!= col1)
        {
            System.out.println ("Can't multiply ");
            return;
        }
        int [][] c = new int[row1][col2];
        for ( i = 0; i <row1 ; i++) {
            for (j = 0; j <col2 ; j++) {
                for ( k = 0; k <row2 ; k++) {
                    c[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println ("Result matrix : ");
        print (c,row1,col2);
    }
}