package RECURSION;

import java.util.Arrays;

public class Recursion_3 {
    public static void main(String[] args) {
//        triangle_1(4, 0);
        int[] arr = {1,3,2,4,6,5};
        bubble_sort_recursive(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle_1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle_1(r, c + 1);
        } else {
            System.out.println();
            triangle_1(r - 1, 0);
        }
    }
    static void bubble_sort_recursive(int [] arr,int start,int end)
    {
        if (start<end)
        {
            return;
        }
        if (end < start)
        {
            if (arr[end] > arr[end +1] )
            {
                int temp = arr[end];
                arr[end] = arr[end +1];
                arr[end+1] = temp;
            }
            bubble_sort_recursive(arr,start,end +1);
        }
        else
        {
            bubble_sort_recursive(arr,start-1,0);
        }
    }
}
