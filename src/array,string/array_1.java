import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
//        for (int i = 0; i<arr.length;i++)
//        {
//            arr[i] = in.nextInt();
//        }
//        for (int i = 0; i<arr.length;i++)
//        {
//            System.out.println(arr[i] + " ");
//        }
//        for (int num:arr)
//        {
//            System.out.print(num + " ");
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    array of objects
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));
//        2-D ARRAYS
//        System.out.println("ENTER ROWS : ");
//        int m = in.nextInt();
//        System.out.println("ENTER COLOUMNS");
//        int n = in.nextInt();
//        int[][] arr = new int [m][n];
//        for (m =0;m<arr.length;m++)
//        {
//            for (n = 0; n < arr.length; n++)
//            {
//                arr[m][n] = in.nextInt();
//            }
//        }
//        for (m =0;m<arr.length;m++)
//        {
//            for (n = 0; n < arr.length; n++)
//            {
//                System.out.print(arr[m][n]);
//            }
//            System.out.println();
//        }
//        for (int [] a:arr)
//        {
//            System.out.println(Arrays.toString(a));
//        }
//        ARRAY LISTS
//        ArrayList <Integer> list = new ArrayList<>(10);
//    Scanner in = new Scanner(System.in);
//        for (int i=0;i<5;i++)
//        {
//            list.add(in.nextInt());
//        }
//        GET ITEM AT ANY INDEX - LIST.GET
//        for (int i=0;i<5;i++)
//        {
//            list.get(2);
//        }
//            System.out.println(list);
//    SWAP NUMBERS IS ARRAY
//        int[] arr = {1,3,23,9,18};
//        System.out.println(Arrays.toString(arr));
//        System.out.println("after swap : ");
//        swap(arr,0,4);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void swap(int [] arr,int index_1, int index_2 )
//    {
//        int temp = arr[index_1];
//        arr[index_1] = arr[index_2];
//        arr[index_2]= temp;
//        MAX VALUE
    int [] arr = {1,3,23,9,18};
        System.out.println(max(arr));

    }
    static int max(int[]arr)
    {
        int maxVal = arr[0];
        for (int i = 1;i<arr.length;i++)
        {
            if (arr[i]>maxVal)
            {
                maxVal= arr[i];
            }
        }
        return maxVal;
    }
}
