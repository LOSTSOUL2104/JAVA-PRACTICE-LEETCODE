import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JAGGED_ARRAYS {


    public static void main(String[] args) {
//        int[][] arr = new int[2][];
//
//        arr[0] = new int [3];
//        arr[1] = new int[2];
//
//        int cnt = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                arr[i][j] = cnt++;
//            }
//        }
//        System.out.println ("JAGGED ARRAY : ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++)
//                System.out.print(arr[i][j] + " ");
//            System.out.println();
//        }
//        int r = 5;
//        int [][] arr = new int [r][];
//
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = new int[i+1];
//        }
//        int cnt = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                arr[i][j] = cnt++;
//            }
//        }
//        for (int [] a:arr)
//        {
//            System.out.println(Arrays.toString(a));
//        }
        Scanner scan = new Scanner (System.in); System.out.println ("Enter the number of sub arrays : ");
        int numberofArrays = scan.nextInt (); int[][] JAGGED_ARRAYS = new int[ numberofArrays ][];
        for (int i = 0; i < numberofArrays; i++) {
            System.out.println ("Enter the size of sub-array" + (i + 1) + " : "); int sizeofSubarray = scan.nextInt ();
            JAGGED_ARRAYS[ i ] = new int[ sizeofSubarray ];
        }
        for (int i = 0; i <numberofArrays; i++) {
            System.out.println ("Enter elements of the sub array : " + (i+1) + " : ");
            for (int j = 0; j < JAGGED_ARRAYS[i].length; j++) {
                JAGGED_ARRAYS[i][j] = scan.nextInt ();
            }
        }
        System.out.println ("The JAgged Array is : ");
        for (int i = 0; i <numberofArrays ; i++) {
            for (int j = 0; j <JAGGED_ARRAYS[i].length ; j++) {
                System.out.print (JAGGED_ARRAYS[i][j]+ " ");
            }
            System.out.println ();
        }
        scan.close ();
    }
}
